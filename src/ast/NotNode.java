package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by suri9 on 09/06/2017.
 */
public class NotNode implements Node
{
    private Node left;

    public NotNode(Node l)
    {
        left=l;
    }

    @Override
    public String toPrint(String s)
    {
        return s+"Not\n" + left.toPrint(s+"  ");
    }

    @Override
    public Node typeCheck()
    {
        if( FOOLlib.isSubtype(left.typeCheck(), new BoolTypeNode()) )
        {
            return new BoolTypeNode();
        }
        else
        {
            System.out.println("Invalid type in not operation!");
            System.exit(0);
        }
        return null;
    }

    @Override
    public String codeGeneration()
    {
        return left.codeGeneration()+ "not\n";
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        //create the result
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //check semantics in the left and in the right exp

        res.addAll(left.checkSemantics(env));

        return res;
    }
}
