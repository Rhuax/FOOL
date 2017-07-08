package ast;

import lib.FOOLlib;
import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by crow on 14/06/17.
 */
public class ClassNode implements Node {

    private String id;
    public ArrayList<ClassNode> extendingClasses = new ArrayList<>();
    public int attributeOffset = 0;

    public ArrayList<VardecNode> getAttributeList() {
        return attributeList;
    }

    private ArrayList<VardecNode> attributeList;

    public ArrayList<FunNode> getMethodList() {
        return methodList;
    }

    private ArrayList<FunNode> methodList;

    private ClassNode extendedClass = null;
    private String extendedClassName = null;

    public ArrayList<VardecNode> getTotalAttributes() {
        return totalAttributes;
    }

    private ArrayList<VardecNode> totalAttributes = new ArrayList<>();

    public ArrayList<FunNode> getTotalMethodList() {
        return totalMethodList;
    }

    private ArrayList<FunNode> totalMethodList = new ArrayList<>();

    public String getExtendedClassName() {
        return extendedClassName;
    }

    public void setExtendedClass(ClassNode extendedClass) {
        this.extendedClass = extendedClass;
    }


    ClassNode(String i, ArrayList<VardecNode> al, ArrayList<FunNode> ml) {
        id = i;
        attributeList = al;


        methodList = ml;
    }

    ClassNode(String i, ArrayList<VardecNode> al, ArrayList<FunNode> ml, String cex) {
        id = i;
        attributeList = al;
        methodList = ml;

        extendedClassName = cex;

    }


    @Override
    public String toPrint(String s) {

        String attList = "";
        if (attributeList != null)
            for (VardecNode dec : attributeList)
                attList += dec.toPrint(s + "  ");

        String methList = "";
        if (methodList != null)
            for (FunNode dec : methodList)
                methList += dec.toPrint(s + "  ");

        return s + "Class:" + id + "\n"
                + attList
                + methList;
    }

    @Override
    public Node typeCheck() {
        MapClassNestLevel.setCurrentAnalyzedClass(this);


        if (attributeList != null)
            for (VardecNode dec : attributeList) {
                dec.typeCheck();
                Node type = dec.getType();
                if (type instanceof IdTypeNode) {
                    IdTypeNode id_typenode = (IdTypeNode) type;
                    for (ClassNode extendingClass : extendingClasses) {
                        if (Objects.equals(extendingClass.getId(), id_typenode.getTypeName())) {
                            System.out.println("Cannot use the sublcass " + extendingClass.getId() + " in " + this.getId() + "'s constructor");
                            System.exit(0);
                        }
                    }

                }
                //type checking sugli attributi

                ClassNode extClass = this.extendedClass;
                if (extClass != null) {
                    for (VardecNode extAtt : extClass.getTotalAttributes()) {
                        if (Objects.equals(dec.getId(), extAtt.getId())) {
                            if (!FOOLlib.isSubtype(dec.getType(), extAtt.getType())) {
                                System.out.println("Overrided attribute " + dec.getId() + " of class " + this.getId() +
                                        " is not a subtype of its ancestor from class " + extClass.getId());
                                System.exit(0);
                            }
                        }
                    }
                }


            }


        if (methodList != null)
            for (FunNode dec : methodList)
                dec.typeCheck();
        MapClassNestLevel.setCurrentAnalyzedClass(null);
        return null;
    }


    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        MapClassNestLevel.setCurrentAnalyzedClass(this);
        //Controllare se ci sono attributi e metodi duplicati
        env.nestingLevel++;
        MapClassNestLevel.putClassNestingLevel(this.id, env.nestingLevel);
        HashMap<String, STentry> hm = new HashMap<String, STentry>();
        env.symTable.add(hm);

        //declare resulting list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();
        if (extendedClass != null) {
            totalAttributes.addAll(extendedClass.totalAttributes);
            totalMethodList.addAll(extendedClass.totalMethodList);
        }

        for (VardecNode att : attributeList) {
            boolean found = false;
            for (int i = 0; i < totalAttributes.size() && !found; i++) {
                if (Objects.equals(totalAttributes.get(i).getId(), att.getId())) {
                    totalAttributes.set(i, att);
                    found = true;
                }
            }

            if (!found) {
                totalAttributes.add(att);
            }
        }

        totalMethodList.addAll(methodList);
        checkAttributes(res, env);
        checkMethods(res, env);


        MapClassNestLevel.setCurrentAnalyzedClass(null);
        return res;
    }

    public ClassNode getExtendedClass() {
        return extendedClass;
    }

    public String getId() {
        return id;
    }

    ArrayList<FunNode> getMethodsList() {
        return methodList;
    }

    FunNode getMethodFromList(String methodName) {
        FunNode methodNode = null;

        for (FunNode methoddec : methodList) {
            if (methoddec.getId().equals(methodName)) {
                methodNode = methoddec;
                break;
            }
        }

        return methodNode;
    }

    private void checkAttributes(ArrayList<SemanticError> res, Environment env) {
        if (extendedClass != null)
            attributeOffset = extendedClass.attributeOffset + 4;

        env.offset = attributeOffset;
        //check semantics in the dec list
        //if there are children then check semantics for every child and save the results
        for (VardecNode attribute : attributeList) {
            ArrayList<SemanticError> errorList = new ArrayList<>();

            int temp = env.offset;
            boolean found = false;
            if (extendedClass != null) {
                for (int i = 0; i < extendedClass.getTotalAttributes().size() && !found; i++) {
                    if (Objects.equals(attribute.getId(), extendedClass.getTotalAttributes().get(i).getId())) {
                        env.offset = -i;
                        found = true;
                    }
                }
            }

            if (errorList.isEmpty())
                errorList.addAll(attribute.checkSemantics(env));

            if (!found)
                attributeOffset = temp - 1;
            if (!errorList.isEmpty()) {
                for (SemanticError err : errorList)
                    err.msg += " in class " + id;


            }
            res.addAll(errorList);
        }


    }

    private void checkMethods(ArrayList<SemanticError> errors, Environment env) {
        boolean check = true;
        env.offset = env.methodOffset;

        HashMap<String, STentry> hm = env.symTable.get(env.nestingLevel);
        //check methods semantics
        for (FunNode f : methodList) {
            STentry entry = new STentry(env.nestingLevel, env.offset--); //separo introducendo "entry"

            if (hm.put(f.getId(), entry) != null) {
                errors.add(new SemanticError("Function id " + f.getId() + " already declared in class " + this.getId()));
                check = false;
            } else
                f.entry = entry;
        }
        env.methodOffset = env.offset;
        attributeOffset += -4;
        if (check) {

            //if there are children then check semantics for every child and save the results
            for (FunNode method : methodList) {
                errors.addAll(method.checkSemantics(env));

            }
        }
    }

    @Override
    public String codeGeneration() {

        MapClassNestLevel.setCurrentAnalyzedClass(this);
        String classCode = "";
        for (FunNode method : methodList) {
            classCode += method.codeGeneration() + '\n';
        }

        MapClassNestLevel.setCurrentAnalyzedClass(null);
        return classCode;
    }
}
