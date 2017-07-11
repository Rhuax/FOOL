package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class BoolNode implements Node {

    private boolean val;

    public BoolNode(boolean n) {
        val = n;
    }

    public String toPrint(String s) {
        if (val) return s + "Bool:true\n";
        else return s + "Bool:false\n";
    }

    public Node typeCheck() {
        return new BoolTypeNode();
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        return new ArrayList<SemanticError>();
    }

    public String codeGeneration() {
        return "push " + (val ? 1 : 0) + "\n"; //true è 1 false è 0
    }

}  