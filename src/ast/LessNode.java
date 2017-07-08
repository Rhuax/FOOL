package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class LessNode implements Node {
    private Node left;
    private Node right;

    public LessNode(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    public String toPrint(String s) {
        return s + "Less\n" + left.toPrint(s + "  ")
                + right.toPrint(s + "  ");
    }

    @Override
    public Node typeCheck() {
        if ((FOOLlib.isSubtype(left.typeCheck(), new IntTypeNode()))
                && (FOOLlib.isSubtype(right.typeCheck(), new IntTypeNode()))) {
            return new BoolTypeNode();
        } else {
            System.out.println("Invalid type in less operation!");
            System.exit(0);
        }
        return null;
    }

    @Override
    public String codeGeneration() {
        String l1 = FOOLlib.freshLabel();
        String l2 = FOOLlib.freshLabel();
        return left.codeGeneration() +
                right.codeGeneration() +
                "bl " + l1 + "\n" +
                "push 0\n" +
                "b " + l2 + "\n" +
                l1 + ":\n" +
                "push 1\n" +
                l2 + ":\n";
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        //create the result
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //check semantics in the left and in the right exp

        res.addAll(left.checkSemantics(env));
        res.addAll(right.checkSemantics(env));

        return res;
    }
}
