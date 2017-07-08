package ast;

import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import static java.lang.StrictMath.abs;

public class IdNode implements Node {

    private String id;
    boolean isAttribute = false;

    public STentry getEntry() {
        return entry;
    }

    private STentry entry;
    private int nestinglevel;

    public IdNode(String i) {
        id = i;
    }

    public String toPrint(String s) {
        return s + "Id:" + id + " at nestlev " + nestinglevel + "\n" + entry.toPrint(s + "  ");
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        //create result list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();
        ClassNode CurAnalyzedClass = MapClassNestLevel.getCurrentAnalyzedClass();

        if (CurAnalyzedClass == null) {
            int j = env.nestingLevel;
            STentry tmp = null;
            while (j >= 0 && tmp == null)
                tmp = (env.symTable.get(j--)).get(id);
            if (tmp == null)
                res.add(new SemanticError("Id " + id + " not declared"));

            else {
                entry = tmp;
                nestinglevel = env.nestingLevel;
            }

        } else {
            int j = env.nestingLevel;
            STentry temp = (env.symTable.get(j)).get(id);
            while (temp == null && j >= MapClassNestLevel.getNestingLevelFromClass(MapClassNestLevel.getCurrentAnalyzedClass().getId())) {
                temp = (env.symTable.get(j)).get(id);
                if (temp == null)
                    j--;
            }
            boolean should = true;
            while (temp == null && should) {
                ClassNode inheritedClassNode = CurAnalyzedClass.getExtendedClass();
                if (inheritedClassNode != null) {
                    String classInheritedName = inheritedClassNode.getId();
                    int nestingLevel = MapClassNestLevel.getNestingLevelFromClass(classInheritedName);
                    HashMap<String, STentry> t = env.symTable.get(nestingLevel);
                    temp = (t.get(id));
                } else
                    should = false;
                CurAnalyzedClass = inheritedClassNode;
            }
            if (temp == null || !should)
                res.add(new SemanticError("Id " + id + " not declared in class " + MapClassNestLevel.getCurrentAnalyzedClass().getId()));
            else {
                entry = temp;
                nestinglevel = env.nestingLevel;
                int n = MapClassNestLevel.getNestingLevelFromClass(MapClassNestLevel.getCurrentAnalyzedClass().getId());
                if (nestinglevel == n)
                    isAttribute = true;
                else if (j <= n) {
                    ClassNode current = MapClassNestLevel.getCurrentAnalyzedClass();
                    for (VardecNode att : current.getTotalAttributes()) {
                        if (Objects.equals(att.getId(), this.id))
                            isAttribute = true;
                    }
                }
            }

        }
        return res;
    }

    public Node typeCheck() {
        if (entry.getType() instanceof ArrowTypeNode) { //
            System.out.println("Wrong usage of function identifier");
            System.exit(0);
        }
        return entry.getType();
    }

    public String codeGeneration() {
        String getAR = "";
        //System.out.println(this.id+" sottrazione "+(nestinglevel-entry.getNestinglevel()));

        if (MapClassNestLevel.getCurrentAnalyzedClass() == null)
            for (int i = 0; i < nestinglevel - entry.getNestinglevel(); i++)
                getAR += "lw\n";

        String code = "";


        if (isAttribute) {
            code += "lfp\n" +
                    "push -1\n" +
                    "add\n" +
                    "lw\n" +
                    "push " + abs(this.getEntry().getOffset()) + "\n" +
                    "add\n" +
                    "lw\n";
        } else {
            code += "push " + entry.getOffset() + "\n" + //metto offset sullo stack
                    "lfp\n" + getAR + //risalgo la catena statica
                    "add\n" +
                    "lw\n"; //carico sullo stack il valore all'indirizzo ottenuto
        }

        return code;
    }
}  