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
    private Node right;

    public NotNode(Node l, Node r)
    {
        left=l;
        right=r;
    }

    @Override
    public String toPrint(String s)
    {
        return s+"Not\n" + left.toPrint(s+"  ")
                + right.toPrint(s+"  ") ;
    }

    @Override
    public Node typeCheck()
    {
        if( FOOLlib.isSubtype(left.typeCheck(), new BoolTypeNode())
                && FOOLlib.isSubtype(right.typeCheck(), new BoolTypeNode()) )
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
        return left.codeGeneration()+
                right.codeGeneration()+
                "not\n";
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        //create the result
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //check semantics in the left and in the right exp

        res.addAll(left.checkSemantics(env));
        res.addAll(right.checkSemantics(env));

        return res;
    }
}
