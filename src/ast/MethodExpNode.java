package ast;

import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by suri9 on 24/06/2017.
 */
public class MethodExpNode implements Node
{
    public ArrayList<Node> expList;
    public String objectID;
    public String methodID;

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
        return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        ArrayList<SemanticError> res = new ArrayList<>();

        checkRuleSemantic(res);

        if(expList != null)
            for(Node exp: expList)
                res.addAll(exp.checkSemantics(env));

        return res;
    }

    private void checkRuleSemantic(ArrayList<SemanticError> errors)
    {
        String curAnalyzedClassName;

        if(objectID == null)
        {
            ClassNode curAnalyzedClass = MapClassNestLevel.getCurrentAnalyzedClass();
            if(curAnalyzedClass != null)
            {
                curAnalyzedClassName = curAnalyzedClass.getId();
            }
            else
            {
                errors.add(new SemanticError("Cannot use this operator outside class context!"));
            }
        }
        else
        {
            
        }
    }
}
