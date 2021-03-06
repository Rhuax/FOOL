package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

public class VardecNode implements Node {

    private String id;

    public Node getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    private Node type;
    public STentry entry;
    public VardecNode(String i, Node t) {
        id = i;
        type = t;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        //create result list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //env.offset = -2;
        HashMap<String, STentry> hm = env.symTable.get(env.nestingLevel);
        STentry entry = new STentry(env.nestingLevel, type, env.offset--); //separo introducendo "entry"

        if (hm.put(id, entry) != null)
            res.add(new SemanticError("Var id " + id + " already declared"));
        this.entry=entry;
        return res;
    }

    public String toPrint(String s) {
        return s + "Var:" + id + "\n"
                + type.toPrint(s + "  ");
    }

    //valore di ritorno non utilizzato
    public Node typeCheck() {

        return null;
    }

    public String codeGeneration() {
        return null;
    }

}
