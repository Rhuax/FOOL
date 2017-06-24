package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by suri9 on 24/06/2017.
 */
public class NewExpNode implements  Node
{
    public ArrayList<Node> expList;

    NewExpNode(ArrayList<Node> el)
    {
        expList = el;
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

        if(expList != null)
            for(Node exp: expList)
                res.addAll(exp.checkSemantics(env));

        return res;
    }
}
