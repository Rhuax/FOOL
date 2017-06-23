package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

import ast.FunNode;
import lib.FOOLlib;

/**
 * Created by crow on 14/06/17.
 */
public class ClassNode implements Node {

    private String id;
    private ArrayList<Node> attributeList;
    private ArrayList<Node> methodList;
    private String extendedClass = null;

    public ClassNode(String i, ArrayList<Node> al, ArrayList<Node> ml) {
        id = i;
        attributeList = al;
        methodList = ml;
    }

    public ClassNode(String i, ArrayList<Node> al, ArrayList<Node> ml, String cex) {
        id = i;
        attributeList = al;
        methodList = ml;
        extendedClass = cex;
    }


    @Override
    public String toPrint(String s) {

        String attList="";
        if (attributeList!=null)
            for (Node dec:attributeList)
                attList+=dec.toPrint(s+"  ");

        String methList="";
        if (methodList!=null)
            for (Node dec:methodList)
                methList+=dec.toPrint(s+"  ");

        return s+"Class:" + id +"\n"
                + attList
                + methList;
    }

    @Override
    public Node typeCheck() {

        if (attributeList!=null)
            for (Node dec:attributeList)
                dec.typeCheck();

        if (methodList!=null)
            for (Node dec:methodList)
                dec.typeCheck();

    return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {

        //Controllare se ci sono attributi e metodi duplicati
        env.nestingLevel++;
        HashMap<String,STentry> hm = new HashMap<String,STentry> ();
        env.symTable.add(hm);

        //declare resulting list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        checkAttributes(res,env);



        return res;
    }

    public String getExtendedClass()
    {
        return extendedClass;
    }

    public String getId()
    {
        return id;
    }

    public ArrayList<Node> getMethodsList()
    {
        return methodList;
    }

    public Node getMethodFromList(String methodName)
    {
        FunNode methodNode = null;

        for (Node methoddec:methodList)
        {
            if( ((FunNode) methoddec).getId().compareTo(methodName) == 0)
            {
                methodNode = (FunNode) methoddec;
                break;
            }
        }

        return methodNode;
    }

    private boolean checkAttributes(ArrayList<SemanticError> res, Environment env)
    {
        boolean check = true;

        //check semantics in the dec list
        if(attributeList.size() > 0)
        {
            env.offset = -2;
            //if there are children then check semantics for every child and save the results
            for (Node attribute : attributeList)
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
        }

        return check;
    }
}
