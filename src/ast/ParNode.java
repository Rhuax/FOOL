package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class ParNode implements Node {

    private String id;
    private Node type;

    public ParNode(String i, Node t) {
        id = i;
        type = t;
    }

    public String getId() {
        return id;
    }

    public Node getType() {
        return type;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        return new ArrayList<SemanticError>();
    }

    public String toPrint(String s) {
        return s + "Par:" + id + "\n"
                + type.toPrint(s + "  ");
    }

    //non utilizzato
    public Node typeCheck() {
        return type;
    }

    //non utilizzato
    public String codeGeneration() {
        return "";
    }

}  