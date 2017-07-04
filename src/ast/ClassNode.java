package ast;

import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by crow on 14/06/17.
 */
public class ClassNode implements Node {

    private String id;

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

        String attList="";
        if (attributeList!=null)
            for (VardecNode dec:attributeList)
                attList+=dec.toPrint(s+"  ");

        String methList="";
        if (methodList!=null)
            for (FunNode dec:methodList)
                methList+=dec.toPrint(s+"  ");

        return s+"Class:" + id +"\n"
                + attList
                + methList;
    }

    @Override
    public Node typeCheck() {
        MapClassNestLevel.setCurrentAnalyzedClass(this);
        if (attributeList!=null)
            for (VardecNode dec:attributeList)
                dec.typeCheck();

        if (methodList!=null)
            for (FunNode dec:methodList)
                dec.typeCheck();
    MapClassNestLevel.setCurrentAnalyzedClass(null);
    return null;
    }



    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        MapClassNestLevel.setCurrentAnalyzedClass(this);
        //Controllare se ci sono attributi e metodi duplicati
        env.nestingLevel++;
        MapClassNestLevel.putClassNestingLevel(this.id,env.nestingLevel);
        HashMap<String,STentry> hm = new HashMap<String,STentry> ();
        env.symTable.add(hm);

        //declare resulting list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        checkAttributes(res, env);
        checkMethods(res, env);
        ;
        if (extendedClass!=null)
            totalAttributes.addAll(extendedClass.totalAttributes);

        totalAttributes.addAll(attributeList);

        MapClassNestLevel.setCurrentAnalyzedClass(null);
        return res;
    }

    public ClassNode getExtendedClass()
    {
        return extendedClass;
    }

    public String getId()
    {
        return id;
    }

    ArrayList<FunNode> getMethodsList()
    {
        return methodList;
    }

    FunNode getMethodFromList(String methodName)
    {
        FunNode methodNode = null;

        for (FunNode methoddec:methodList)
        {
            if(methoddec.getId().equals(methodName))
            {
                methodNode =  methoddec;
                break;
            }
        }

        return methodNode;
    }

    private boolean checkAttributes(ArrayList<SemanticError> res, Environment env)
    {
        boolean check = true;
        if(extendedClass != null)
            attributeOffset = extendedClass.attributeOffset;

        env.offset = attributeOffset;

        //check semantics in the dec list
        //if there are children then check semantics for every child and save the results
        for (VardecNode attribute : attributeList)
        {
            ArrayList<SemanticError> errorList = attribute.checkSemantics(env);
            if(!errorList.isEmpty())
            {
                for(SemanticError err: errorList)
                    err.msg += " in class " + id;

                check = false;
            }
            res.addAll(errorList);
        }
        attributeOffset=env.offset;

        return check;
    }

    private boolean checkMethods(ArrayList<SemanticError> errors, Environment env)
    {
        boolean check = true;
        env.offset=env.methodOffset;

        HashMap<String, STentry> hm = env.symTable.get(env.nestingLevel);
        //check methods semantics
        for(FunNode f:methodList) {
            STentry entry = new STentry(env.nestingLevel, env.offset--); //separo introducendo "entry"

            if (hm.put(f.getId(), entry) != null) {
                errors.add(new SemanticError("Fun id " + id + " already declared"));
                check=false;
            }
            else
                f.entry=entry;
        }
        env.methodOffset=env.offset;
        attributeOffset+=-4;
        if(check) {

                //if there are children then check semantics for every child and save the results
                for (FunNode method : methodList) {
                    errors.addAll(method.checkSemantics(env));

            }
        }
        //attributeOffset=env.offset;
        return check;
    }

    @Override
    public String codeGeneration()
    {

        MapClassNestLevel.setCurrentAnalyzedClass(this);
        String classCode="";
        for(FunNode method:methodList)
        {
            classCode+=method.codeGeneration()+'\n';
        }

        MapClassNestLevel.setCurrentAnalyzedClass(null);
        return classCode;
    }
}
