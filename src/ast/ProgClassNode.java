package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by suri9 on 14/06/2017.
 */
public class ProgClassNode implements Node {

    private ArrayList<Node> classList;

    ProgClassNode(ArrayList<Node> cl)
    {
        classList = cl;
    }

    public String toPrint(String s) {
        String classstr = "";
        for (Node classdec:classList)
            classstr+=classdec.toPrint(s+"  ");
        return s+"ClassLetIn\n" + classstr ;
    }

    @Override
    public Node typeCheck()
    {
        checkClasses();
        checkMethods();

        return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        //Vedere se ci sono classi con nomi duplicati
        return null;
    }

    private ClassNode getClassFromList(String className)
    {
        ClassNode clNode = null;

        for (Node classdec:classList)
        {
            if( ((ClassNode) classdec).getId().compareTo(className) == 0)
            {
                clNode = (ClassNode) classdec;
                break;
            }
        }

        return clNode;
    }

    private void checkClasses()
    {
        for (Node classdec:classList)
            classdec.typeCheck();
    }

    private void checkMethods()
    {
        for (Node classdec:classList)
        {
            String extClass = ((ClassNode) classdec).getExtendedClass();
            if( extClass != null)
            {
                ClassNode superClass = getClassFromList(extClass);
                if (superClass != null)
                {
                    ArrayList<Node> methodList = ((ClassNode) classdec).getMethodsList();
                    for (Node methoddec : methodList)
                    {
                        Node superMethod = superClass.getMethodFromList(((FunNode) methoddec).getId());
                        if (superMethod != null)
                        {
                            Node curMethodType = ((FunNode) methoddec).getType();
                            Node superMethodType = ((FunNode) superMethod).getType();
                            checkReturnType(curMethodType, superMethodType);
                            checkMethodParametersType((FunNode) methoddec, (FunNode) superMethod);
                        }
                    }
                }
                else
                {
                    System.out.println("Extended class not in class list! ");
                    System.exit(0);
                }
            }
        }
    }

    private void checkMethodParametersType(FunNode subMethod, FunNode superMethod)
    {
        ArrayList<Node> subParamList = subMethod.getParlist();
        ArrayList<Node> superParamList = superMethod.getParlist();

        int subParamListSize = subParamList.size();
        int superParamListSize = superParamList.size();

        if(subParamListSize == superParamListSize)
        {
            for(int i = 0; i < subParamList.size(); i++)
            {
                Node subParam = subParamList.get(i);
                Node superParam = superParamList.get(i);
                checkParamType(subParam, superParam, i);
            }
        }
        else
        {
            System.out.println("Param list size of sub-method does not correspond to param list size of super-method");
            System.exit(0);
        }
    }

    private void checkParamType(Node subParamType, Node superParamType, int paramIndex)
    {
        if (!(FOOLlib.isSubtype(superParamType, subParamType)))
        {
            System.out.println("Param type, in position " + (paramIndex + 1) + ", in sub-method is not supertype of param type in super-method ");
            System.exit(0);
        }
    }

    private void checkReturnType(Node subType, Node superType)
    {
        if (!(FOOLlib.isSubtype(subType, superType)))
        {
            System.out.println("Method return type in class is not subtype of method return type in super class ");
            System.exit(0);
        }
    }

    private void checkDuplicateClasses()
    {

    }
}
