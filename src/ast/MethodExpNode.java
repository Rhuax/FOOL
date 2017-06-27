package ast;

import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

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
    MethodExpNode(ArrayList<Node> el, String o, String m)
    {
        expList = el;
        objectID = o;
        methodID = m;
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
            else{
                c=c.getExtendedClass();
                if(c==null) {
                    System.out.println("Cannot call method " + methodID + " on object " + objectID);
                    System.exit(0);
                }

        }
        }
        return methodNode.getType();


    }

    @Override
    public String codeGeneration() {
        return null;
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
            STentry temp = (env.symTable.get(j)).get(objectID);
            while (temp!=null && j > MapClassNestLevel.getMaxClassNestLevel())
                temp = (env.symTable.get(j--)).get(objectID);

            if(temp==null)
                errors.add(new SemanticError("Object "+objectID + " is not defined"));
            else
                objectTypeName=temp.getType().toString();



        }

    }
}
