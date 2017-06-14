package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by crow on 14/06/17.
 */
public class ClassNode implements Node {

    private String id;
    private ArrayList<Node> attributeList;
    private ArrayList<Node> methodList;
    private String classExtended = "";

    public ClassNode(String i, ArrayList<Node> al, ArrayList<Node> ml) {
        id = i;
        attributeList = al;
        methodList = ml;
    }

    public ClassNode(String i, ArrayList<Node> al, ArrayList<Node> ml, String cex) {
        id = i;
        attributeList = al;
        methodList = ml;
        classExtended = cex;
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
        return null;
    }
}
