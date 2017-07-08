package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class VarNode implements Node {

    public String getId() {
        return id;
    }

    private String id;
    private Node type;
    private Node exp;
    public STentry entry;

    public VarNode(String i, Node t, Node v) {
        id = i;
        type = t;
        exp = v;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        //create result list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();
        boolean error = false;
        if (type instanceof IdTypeNode) {
            ClassNode c = ProgClassNode.getClassFromList((((IdTypeNode) type).getTypeName()));
            if (c == null) {
                res.add(new SemanticError("Class " + ((IdTypeNode) type).getTypeName() + " does not exist!"));
                error = true;
            }
        }
        if (!error) {

            //env.offset = -2;
          /*HashMap<String, STentry> hm = env.symTable.get(env.nestingLevel);
          STentry entry = new STentry(env.nestingLevel, type, env.offset--); //separo introducendo "entry"
          /*if (hm.put(id, entry) != null)
              res.add(new SemanticError("Var id " + id + " already declared"));*/
            this.entry.addType(this.type);
            res.addAll(exp.checkSemantics(env));
        }

        return res;
    }

    public String toPrint(String s) {
        return s + "Var:" + id + "\n"
                + type.toPrint(s + "  ")
                + exp.toPrint(s + "  ");
    }

    //valore di ritorno non utilizzato
    public Node typeCheck() {
        Node expType = exp.typeCheck();
        if (!(FOOLlib.isSubtype(expType, type))) {

            System.out.println("Incompatible value for variable " + id);
            System.exit(0);
        }
        this.entry.true_type = expType;
        return null;
    }

    public String codeGeneration() {
        return exp.codeGeneration();
    }

}  