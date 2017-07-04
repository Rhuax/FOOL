package ast;

import lib.FOOLlib;
import org.antlr.v4.runtime.tree.TerminalNode;
import util.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by suri9 on 24/06/2017.
 */
public class MethodExpNode implements Node
{
    public ArrayList<Node> expList;
    public String objectID;
    public String methodID;
    private String objectTypeName;
    TerminalNode object;
    TerminalNode method;
    private int nestinglevel;
    private STentry entry;

    MethodExpNode(ArrayList<Node> el, TerminalNode o, TerminalNode m)
    {
        expList = el;
        objectID = o.getText();
        methodID = m.getText();
        this.object=o;
        this.method=m;
    }
    @Override
    public String toPrint(String indent) {
        return null;
    }

    @Override
    public Node typeCheck() {
        boolean found=false;
        FunNode methodNode=null;
        ClassNode c=ProgClassNode.getClassFromList(objectTypeName);
        while(!found)
        {
            if((methodNode=c.getMethodFromList(methodID))!=null)
                found=true;
            else
            {
                c=c.getExtendedClass();
                if(c==null)
                {
                    System.out.println("Cannot call method " + methodID + " on object " + objectID);
                    System.exit(0);
                }
            }
        }


        ArrayList<Node> al = c.getMethodFromList(methodID).getParlist();
        if(expList.size() == al.size())
        {
            for (int i = 0; i < expList.size(); i++)
            {
                Node subAtt = expList.get(i);
                ParNode supAtt = (ParNode)al.get(i);
                Node subType = subAtt.typeCheck();
                Node supType =  supAtt.getType();

                if(!FOOLlib.isSubtype(subType, supType))
                {
                    System.out.println("Type of parameter in position " + (i+1) + " in instantiation of class " + c.getId() + " is not compatible with the type of corresponding attribute!");
                    System.exit(0);
                }
            }
        }
        else
        {
            String sign ;

            if(expList.size() > al.size())
                sign="much";
            else
                sign="few";

            System.out.println("Too " + sign + " parameters when calling method " + this.methodID + " of object "+this.objectID+" of type "+this.objectTypeName);
            System.exit(0);
        }

        return methodNode.getType();
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        ArrayList<SemanticError> res = new ArrayList<>();

        checkRuleSemantic(res,env);

        if(expList != null)
            for(Node exp: expList)
                res.addAll(exp.checkSemantics(env));

        return res;
    }

    private void checkRuleSemantic(ArrayList<SemanticError> errors,Environment env)
    {
        if(objectID == null)
        {
            ClassNode curAnalyzedClass = MapClassNestLevel.getCurrentAnalyzedClass();
            if(curAnalyzedClass != null)
            {
                objectTypeName = curAnalyzedClass.getId();
            }
            else
            {
                errors.add(new SemanticError("Cannot use this operator outside class context!"));
            }
        }
        else
        {
            int j = env.nestingLevel;
            this.nestinglevel=env.nestingLevel;
            STentry temp = (env.symTable.get(j)).get(objectID);

            while (temp!=null && j > MapClassNestLevel.getMaxClassNestLevel())
                temp = (env.symTable.get(j--)).get(objectID);

            if(temp==null)
                errors.add(new SemanticError("Object "+objectID + " is not defined"));
            else {
                objectTypeName = temp.getType().toString();
                this.entry=temp;
            }

        }



    }
    @Override
    public String codeGeneration() {
        //MapClassNestLevel.setCurrentAnalyzedClass(ProgClassNode.getClassFromList(this.objectTypeName));


        int index=DispatchTable.getDispatchIndexFromClassName(this.objectTypeName);
        DispatchEntry dispentry=DispatchTable.dispatchTable.get(index);
        String mLabel=dispentry.getDispatchMethodTable().methodList.get(this.methodID);

        String code="";
        String parCode="";
        for (int i=expList.size()-1; i>=0; i--)
            parCode+=expList.get(i).codeGeneration();

        /*String getAR="";
        for (int i=0; i<nestinglevel-entry.getNestinglevel(); i++)
            getAR+="lw\n";*/
        int objectOffset = this.entry.getOffset();

        String popParl="";
        for(int i=0;i<expList.size();i++)
            popParl+="pop\n";

        String attCode="";

        code += "lfp\n" +
                parCode +
                "lfp\n"+ //CL
                "lfp\n" +
                "push " + objectOffset+ "\n" +
                "add\n" +
                "lw\n" +
                "push "+mLabel+"\n"+
                "js\n";

        //MapClassNestLevel.setCurrentAnalyzedClass(null);
        return code;
    }
}
