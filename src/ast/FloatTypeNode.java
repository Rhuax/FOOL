package ast;

import java.util.ArrayList;

import util.Environment;
import util.SemanticError;

public class FloatTypeNode implements Node {

    public FloatTypeNode () {
    }

    public String toPrint(String s) {
        return s+"FloatType\n";
    }

    //non utilizzato
    public Node typeCheck() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        return new ArrayList<SemanticError>();
    }

    //non utilizzato
    public String codeGeneration() {
        return "";
    }


}
