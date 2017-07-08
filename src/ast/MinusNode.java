package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class MinusNode implements Node {
    private Node left;
    private Node right;

    public MinusNode(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    public String toPrint(String s) {
        return s + "Minus\n" + left.toPrint(s + "  ")
                + right.toPrint(s + "  ");
    }

    @Override
    public Node typeCheck() {
        if (FOOLlib.isSubtype(left.typeCheck(), new IntTypeNode())) {
            if (FOOLlib.isSubtype(right.typeCheck(), new IntTypeNode())) {
                return new IntTypeNode();
            } else {
                System.out.println("First type is not subtype of the second in sub!");
                System.exit(0);
            }
        } else {
            System.out.println("Boolean cannot be subtracted!");
            System.exit(0);
        }
        return null;
    }

    @Override
    public String codeGeneration() {
        return left.codeGeneration() +
                right.codeGeneration() +
                "sub\n";
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
