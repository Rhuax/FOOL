package ast;

import java.util.ArrayList;

import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

public class IdNode implements Node {

  private String id;
  private STentry entry;
  private int nestinglevel;
  
  public IdNode (String i) {
    id=i;
  }
  
  public String toPrint(String s) {
	return s+"Id:" + id + " at nestlev " + nestinglevel +"\n" + entry.toPrint(s+"  ") ;  
  }
  
  @Override
	public ArrayList<SemanticError> checkSemantics(Environment env) {
	  
	  //create result list
	  ArrayList<SemanticError> res = new ArrayList<SemanticError>();
      ClassNode CurAnalyzedClass=MapClassNestLevel.getCurrentAnalyzedClass();
	  if (CurAnalyzedClass==null) {
          int j = env.nestingLevel;
          STentry tmp = null;
          while (j >= 0 && tmp == null)
              tmp = (env.symTable.get(j--)).get(id);
          if (tmp == null)
              res.add(new SemanticError("Id " + id + " not declared"));

          else {
              entry = tmp;
              nestinglevel = env.nestingLevel;
          }
      }
      else{
	      int j = env.nestingLevel;
	      STentry temp = (env.symTable.get(j)).get(id);
	      boolean should=true;
	      while (temp==null && should){
              ClassNode inheritedClassNode=CurAnalyzedClass.getExtendedClass();
              if (inheritedClassNode!=null)
	            temp = (env.symTable.get(MapClassNestLevel.getNestingLevelFromClass(inheritedClassNode.getId())).get(id));
              else
                  should=false;
              CurAnalyzedClass=inheritedClassNode;
          }
          if (temp == null || should==false)
              res.add(new SemanticError("Id " + id + " not declared"));
      }
	  return res;
	}
  
  public Node typeCheck () {
	if (entry.getType() instanceof ArrowTypeNode) { //
	  System.out.println("Wrong usage of function identifier");
      System.exit(0);
    }	 
    return entry.getType();
  }
  
  public String codeGeneration() {
      String getAR="";
	  for (int i=0; i<nestinglevel-entry.getNestinglevel(); i++) 
	    	 getAR+="lw\n";
	    return "push "+entry.getOffset()+"\n"+ //metto offset sullo stack
		       "lfp\n"+getAR+ //risalgo la catena statica
			   "add\n"+ 
               "lw\n"; //carico sullo stack il valore all'indirizzo ottenuto

  }
}  