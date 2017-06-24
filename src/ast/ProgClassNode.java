package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.*;

/**
 * Created by suri9 on 14/06/2017.
 */
public class ProgClassNode implements Node {

    public static ArrayList<ClassNode> classList;

    ProgClassNode(ArrayList<ClassNode> cl)
    {
        classList = cl;
    }

    public String toPrint(String s) {
        String classstr = "";
        for (ClassNode classdec:classList)
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
        /*env.nestingLevel++;
        HashMap<String,STentry> hm = new HashMap<String,STentry> ();
        env.symTable.add(hm);*/

        setExtendedClasses();

        ArrayList<SemanticError> res = new ArrayList<SemanticError>();
        if(checkDuplicatedClasses(res))
            if(checkImplementedClasses(res))
               if(checkCyclicInheritance(res))
                   for( ClassNode classdec: classList)
                       res.addAll(classdec.checkSemantics(env));

        return res;
    }

    private void setExtendedClasses()
    {
        for(ClassNode classdec: classList)
        {
            String extClassName = classdec.getExtendedClassName();
            if(extClassName != null)
            {
                classdec.setExtendedClass(getClassFromList(extClassName));
            }
        }
    }

    private boolean checkDuplicatedClasses(ArrayList<SemanticError> errors)
    {
        boolean check = true;
        Set<String> classSet = new HashSet<>();

        for(ClassNode classNode: classList)
        {
            if(!classSet.add(  classNode.getId()))
            {
                errors.add(new SemanticError("Class " +  classNode.getId() + " already defined!"));
                check = false;
            }
        }

        return check;
    }

    private boolean checkImplementedClasses(ArrayList<SemanticError> errors)
    {
        boolean check = true;

        for(ClassNode classdec: classList)
        {
            ClassNode extClass =classdec.getExtendedClass();
            if( extClass != null)
            {
                ClassNode superClass = getClassFromList(extClass.getId());
                if(superClass == null)
                {
                    errors.add(new SemanticError("Extended class " + extClass.getId() + " not in class list! "));
                    check = false;
                }
            }
        }

        return check;
    }

    private boolean checkCyclicInheritance(ArrayList<SemanticError> errors)
    {
        boolean check = true;
        Set<String> inheritedClasses;

        for(ClassNode classdec: classList)
        {
            inheritedClasses = new HashSet<>();

            inheritedClasses.add(classdec.getId());
            ClassNode extClass = classdec.getExtendedClass();

                while( extClass != null && inheritedClasses.add(extClass.getId()) )
                {
                    extClass = (getClassFromList(extClass.getId()).getExtendedClass());
                }

                if(extClass != null)
                {
                    errors.add(new SemanticError("Cyclic inheritance in class " +  classdec.getId() + "!" ));
                    check = false;
                }
        }

        return check;
    }

    private ClassNode getClassFromList(String className)
    {
        ClassNode clNode = null;

        for (ClassNode classdec:classList)
        {
            if(  classdec.getId().compareTo(className) == 0)
            {
                clNode =  classdec;
                break;
            }
        }

        return clNode;
    }

    private void checkClasses()
    {
        for (ClassNode classdec:classList)
            classdec.typeCheck();
    }

    private void checkMethods()
    {
        for (ClassNode classdec:classList)
        {
            String extClass =  classdec.getExtendedClass().getId();
            if( extClass != null)
            {
                ClassNode superClass = getClassFromList(extClass);
                ArrayList<FunNode> methodList =  classdec.getMethodsList();
                for (FunNode methoddec : methodList)
                {
                    FunNode superMethod = superClass.getMethodFromList( methoddec.getId());
                    if (superMethod != null)
                    {
                        Node curMethodType =  methoddec.getType();
                        Node superMethodType =  superMethod.getType();
                        checkReturnType(curMethodType, superMethodType);
                        checkMethodParametersType( methoddec, superMethod);
                    }
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
}
