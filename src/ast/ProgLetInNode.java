package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

public class ProgLetInNode implements Node {

    private ArrayList<Node> declist;
    private Node exp;

    public ProgLetInNode(ArrayList<Node> d, Node e) {
        declist = d;
        exp = e;
    }

    public String toPrint(String s) {
        String declstr = "";
        for (Node dec : declist)
            declstr += dec.toPrint(s + "  ");
        return s + "ProgLetIn\n" + declstr + exp.toPrint(s + "  ");
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        env.nestingLevel++;
        HashMap<String, STentry> hm = new HashMap<String, STentry>();
        env.symTable.add(hm);

        //declare resulting list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();
        if (declist.size() > 0)
            env.offset = -2;
        //check semantics in the dec list
        for (Node node : declist) {
            STentry entry = new STentry(env.nestingLevel, env.offset--); //separo introducendo "entry"
            if (node instanceof FunNode) {
                if (hm.put(((FunNode) node).getId(), entry) != null)
                    res.add(new SemanticError("Fun id " + ((FunNode) node).getId() + " already declared"));
                else
                    ((FunNode) node).entry = entry;
            } else if (node instanceof VarNode) {
                if (hm.put(((VarNode) node).getId(), entry) != null)
                    res.add(new SemanticError("Var id " + ((VarNode) node).getId() + " already declared"));
                else
                    ((VarNode) node).entry = entry;
                //System.out.println(entry.getOffset());

            }
        }

        //if there are children then check semantics for every child and save the results
        if (res.isEmpty()) {
            for (Node n : declist)
                res.addAll(n.checkSemantics(env));

            //check semantics in the exp body
            res.addAll(exp.checkSemantics(env));
        }
        //clean the scope, we are leaving a let scope
        env.symTable.remove(env.nestingLevel--);

        //return the result
        return res;
    }

    public Node typeCheck() {
        for (Node dec : declist)
            dec.typeCheck();
        return exp.typeCheck();
    }

    public String codeGeneration() {
        String declCode = "";
        for (Node dec : declist)
            declCode += dec.codeGeneration();
        return "push 0\n" +
                declCode +
                exp.codeGeneration() + "halt\n" +
                FOOLlib.getCode();
    }


}  