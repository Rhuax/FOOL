package ast;

import java.util.ArrayList;

import util.Environment;
import util.SemanticError;

public class FloatNode implements Node {

    private Integer val;

    public FloatNode (Integer n) {
        val=n;
    }

    public String toPrint(String s) {
        return s+"Float:" + Float.toString(val) +"\n";
    }

    public Node typeCheck() {
        return new FloatTypeNode();
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        return new ArrayList<SemanticError>();
    }

    public String codeGeneration() {
        return "push "+val+"\n";
    }

}