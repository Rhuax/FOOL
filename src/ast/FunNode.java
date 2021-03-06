package ast;

import lib.FOOLlib;
import util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class FunNode implements Node {

    private String id;
    private Node type;
    public STentry entry;

    ArrayList<Node> getParlist() {
        return parlist;
    }

    private ArrayList<Node> parlist = new ArrayList<Node>();
    private ArrayList<Node> declist;
    private Node body;

    FunNode(String i, Node t) {
        id = i;
        type = t;
    }

    void addDecBody(ArrayList<Node> d, Node b) {
        declist = d;
        body = b;
    }


    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        //create result list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //env.offset = -2;
        //creare una nuova hashmap per la symTable
        env.nestingLevel++;
        HashMap<String, STentry> hmn = new HashMap<String, STentry>();

        env.symTable.add(hmn);

        ArrayList<Node> parTypes = new ArrayList<Node>();
        int paroffset = 1;

        //check args
        for (Node a : parlist) {
            ParNode arg = (ParNode) a;
            parTypes.add(arg.getType());
            if (hmn.put(arg.getId(), new STentry(env.nestingLevel, arg.getType(), paroffset++)) != null)
                res.add(new SemanticError("Parameter id " + arg.getId() + " already declared"));

        }

        //set func type
        this.entry.addType(new ArrowTypeNode(parTypes, type));

        //check semantics in the dec list
        if (declist.size() > 0) {
            ClassNode current = MapClassNestLevel.getCurrentAnalyzedClass();
            if (current != null && current.getMethodFromList(this.id) != null)
                env.offset = -3;
            else
                env.offset = -2;
            //if there are children then check semantics for every child and save the results
            int offsetchepartedamenouno = -3;
            for (Node node : declist) {

                if (node instanceof FunNode) {
                    STentry entry = new STentry(env.nestingLevel, env.offset--); //separo introducendo "entry"
                    if (Objects.equals(this.id, ((FunNode) node).id))
                        res.add(new SemanticError("Fun id " + ((FunNode) node).getId() + " already declared"));
                    else if (hmn.put(((FunNode) node).getId(), entry) != null)
                        res.add(new SemanticError("Fun id " + ((FunNode) node).getId() + " already declared"));
                    else
                        ((FunNode) node).entry = entry;
                } else if (node instanceof VarNode) {
                    STentry entry;
                    entry = new STentry(env.nestingLevel, offsetchepartedamenouno--);
                    if (Objects.equals(this.id, ((VarNode) node).getId()))
                        res.add(new SemanticError("Var id " + ((VarNode) node).getId() + " already declared"));
                    else if (hmn.put(((VarNode) node).getId(), entry) != null)
                        res.add(new SemanticError("Var id " + ((VarNode) node).getId() + " already declared"));
                    else
                        ((VarNode) node).entry = entry;
                    //System.out.println(entry.getOffset());

                }
            }
            if (res.isEmpty()) {

                for (Node n : declist)
                    res.addAll(n.checkSemantics(env));
            }
        }
        if (res.isEmpty()) {
            //check body
            res.addAll(body.checkSemantics(env));
        }
        //close scope
        env.symTable.remove(env.nestingLevel--);
        // System.out.println(this.getId()+" offset:"+this.entry.getOffset());


        return res;
    }

    void addPar(Node p) {
        parlist.add(p);
    }

    public String toPrint(String s) {
        String parlstr = "";
        for (Node par : parlist)
            parlstr += par.toPrint(s + "  ");
        String declstr = "";
        if (declist != null)
            for (Node dec : declist)
                declstr += dec.toPrint(s + "  ");
        return s + "Fun:" + id + "\n"
                + type.toPrint(s + "  ")
                + parlstr
                + declstr
                + body.toPrint(s + "  ");
    }

    //valore di ritorno non utilizzato
    public Node typeCheck() {
        if (declist != null)
            for (Node dec : declist)
                dec.typeCheck();
        if (!(FOOLlib.isSubtype(body.typeCheck(), type))) {
            System.out.println("Wrong return type for function " + id);

            System.exit(0);
        }
        return null;
    }

    public String codeGeneration() {

        String declCode = "";
        if (declist != null) for (Node dec : declist)
            declCode += dec.codeGeneration();

        String popDecl = "";
        if (declist != null) for (Node dec : declist)
            popDecl += "pop\n";

        String popParl = "";
        for (Node dec : parlist)
            popParl += "pop\n";

        String funl;
        if (MapClassNestLevel.getCurrentAnalyzedClass() != null) {
            if (MapClassNestLevel.getCurrentAnalyzedClass().getMethodFromList(this.id) == null) {
                funl = FOOLlib.freshFunLabel();
            } else {
                int index = DispatchTable.getDispatchIndexFromClassName(MapClassNestLevel.getCurrentAnalyzedClass().getId());
                DispatchMethodTable dispmetTable = DispatchTable.dispatchTable.get(index).getDispatchMethodTable();
                funl = dispmetTable.methodList.get(this.id);
            }

        } else {
            funl = FOOLlib.freshFunLabel();
        }
        ClassNode current = MapClassNestLevel.getCurrentAnalyzedClass();
        if (current == null /*|| current.getMethodFromList(this.id)==null*/) {
            FOOLlib.putCode(funl + ":\n" +
                    "cfp\n" + //setta $fp a $sp
                    "lra\n" + //inserimento return address
                    declCode + //inserimento dichiarazioni locali
                    body.codeGeneration() +
                    "srv\n" + //pop del return value
                    popDecl +
                    "sra\n" + // pop del return address
                    "pop\n" + // pop di AL
                    popParl +
                    "sfp\n" +  // setto $fp a valore del CL
                    "lrv\n" + // risultato della funzione sullo stack
                    "lra\n" + "js\n" // salta a $ra
            );
        } else {
            FOOLlib.putCode(funl + ":\n" +
                    "cfp\n" + //setta $fp a $sp
                    "push 1\n" +
                    "lfp\n" +
                    "add\n" +
                    "sfp\n" +
                    "lra\n" + //inserimento return address
                    declCode + //inserimento dichiarazioni locali
                    body.codeGeneration() +
                    "srv\n" + //pop del return value
                    popDecl +
                    "sra\n" + // pop del return address
                    "pop\n" + // pop di AL
                    "pop\n" +
                    popParl +
                    "sfp\n" +  // setto $fp a valore del CL
                    "lrv\n" + // risultato della funzione sullo stack
                    "lra\n" +
                    "js\n"); // salta a $ra
        }
        return "push " + funl + "\n";
    }

    public Node getType() {
        return type;
    }

    public String getId() {
        return id;
    }


}  