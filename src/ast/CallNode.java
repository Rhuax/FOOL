package ast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import util.*;
import lib.FOOLlib;

public class CallNode implements Node {

  private String id;
  private STentry entry; 
  private ArrayList<Node> parlist; 
  private int nestinglevel;

  public CallNode(String text, ArrayList<Node> args) {
	id=text;
    parlist = args;
}

public String toPrint(String s) {  //
    String parlstr="";
	for (Node par:parlist)
	  parlstr+=par.toPrint(s+"  ");		
	return s+"Call:" + id + " at nestlev " + nestinglevel +"\n" 
           +entry.toPrint(s+"  ")
           +parlstr;        
  }

@Override
	public ArrayList<SemanticError> checkSemantics(Environment env) {
		//create the result
		ArrayList<SemanticError> res = new ArrayList<SemanticError>();
		ClassNode CurAnalyzedClass = MapClassNestLevel.getCurrentAnalyzedClass();
		if (CurAnalyzedClass==null) {
            int j = env.nestingLevel;
            STentry tmp = null;
            while (j >= 0 && tmp == null)
                tmp = (env.symTable.get(j--)).get(id);
            if (tmp == null)
                res.add(new SemanticError("Id " + id + " not declared"));

            else {
                this.entry = tmp;
                this.nestinglevel = env.nestingLevel;

                for (Node arg : parlist)
                    res.addAll(arg.checkSemantics(env));
            }
        }
        else{
            int j = env.nestingLevel;
            STentry temp = (env.symTable.get(j)).get(id);
            while(temp==null && j>=MapClassNestLevel.getNestingLevelFromClass(MapClassNestLevel.getCurrentAnalyzedClass().getId())){
                temp=(env.symTable.get(j--)).get(id);
            }
            boolean should=true;
            while (temp==null && should){
                ClassNode inheritedClassNode=CurAnalyzedClass.getExtendedClass();
                if (inheritedClassNode!=null) {
                    String classInheritedName=inheritedClassNode.getId();
                    int nestingLevel=MapClassNestLevel.getNestingLevelFromClass(classInheritedName);

                    HashMap<String,STentry> t=env.symTable.get(nestingLevel);
                    temp = (t.get(id));
                }
                else
                    should=false;
                CurAnalyzedClass=inheritedClassNode;
            }
            if (temp == null || should==false)
                res.add(new SemanticError("Id " + id + " not declared in class "+MapClassNestLevel.getCurrentAnalyzedClass().getId()));
            else{
                this.entry=temp;
                nestinglevel=env.nestingLevel;
                for (Node arg : parlist)
                    res.addAll(arg.checkSemantics(env));
            }
        }
		 return res;
	}
  
  public Node typeCheck () {  //                           
	 ArrowTypeNode t=null;
     if (entry.getType() instanceof ArrowTypeNode) t=(ArrowTypeNode) entry.getType(); 
     else {
       System.out.println("Invocation of a non-function "+id);
       System.exit(0);
     }
     ArrayList<Node> p = t.getParList();
     if ( !(p.size() == parlist.size()) ) {
       System.out.println("Wrong number of parameters in the invocation of "+id);
       System.exit(0);
     } 
     for (int i=0; i<parlist.size(); i++) 
       if ( !(FOOLlib.isSubtype( (parlist.get(i)).typeCheck(), p.get(i)) ) ) {
         System.out.println("Wrong type for "+(i+1)+"-th parameter in the invocation of "+id);
         System.exit(0);
       } 
     return t.getRet();
  }
  
  public String codeGeneration() {
	    String parCode="";
	    String popParl="";
	    String code="";

	    for (int i=parlist.size()-1; i>=0; i--)
	    	parCode+=parlist.get(i).codeGeneration();

	    for(int i=0;i<parlist.size();i++)
	        popParl+="pop\n";

	    String getAR="";
		  for (int i=0; i<nestinglevel-entry.getNestinglevel(); i++) 
		    	 getAR+="lw\n";


		  ClassNode current=MapClassNestLevel.getCurrentAnalyzedClass();
		  if(current!=null /*&& current.getMethodFromList(this.id)!=null*/){


		      //sono in un metodo e sto chiamando un altro metodo della mia classe
              FunNode nodo=current.getMethodFromList(this.id);
                  code += "lfp\n" +
                          parCode +
                          "lfp\n" ; //CL
              if(nodo!=null){
                          code+="lfp\n" +
                          "push -1\n" +
                          "add\n" +
                          "lw\n";}
              else{
                  code+="lfp\n"+
                          "lw\n";
              }

              if(nodo!=null) {
                  int index = DispatchTable.getDispatchIndexFromClassName(current.getId());
                  DispatchEntry dispentry = DispatchTable.dispatchTable.get(index);
                  String mLabel = dispentry.getDispatchMethodTable().methodList.get(this.id);
                  code+= "push "+mLabel+"\n";
              }
                else
              {
                  // ora recupero l'indirizzo a cui saltare e lo metto sullo stack
                  code+="push " + entry.getOffset() + "\n" + //metto offset sullo stack
                          "lfp\n" + getAR + //risalgo la catena statica
                          "add\n" +
                          "lw\n" ; //carico sullo stack il valore all'indirizzo ottenuto
              }
                      code+="js\n";
          }
		  else {

              code += "lfp\n" + //CL
                      parCode +
                      "lfp\n" + getAR + //setto AR risalendo la catena statica
                      // ora recupero l'indirizzo a cui saltare e lo metto sullo stack
                      "push " + entry.getOffset() + "\n" + //metto offset sullo stack
                      "lfp\n" + getAR + //risalgo la catena statica
                      "add\n" +
                      "lw\n" + //carico sullo stack il valore all'indirizzo ottenuto
                      "js\n";
          }
        return code;
  }

    
}  