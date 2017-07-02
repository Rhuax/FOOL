package ast;

import lib.FOOLlib;
import parser.FoolProvaBisParser;
import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

import java.util.*;

/**
 * Created by suri9 on 14/06/2017.
 */
public class ProgClassNode implements Node {

    public static ArrayList<ClassNode> classList;
    public static ArrayList<Node> innerdec;
    public static Node exp;
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
        checkLet();
        checkExp();
        return null;
    }

    private void checkExp() {
        exp.typeCheck();
    }

    private void checkLet() {
        for(Node n:innerdec)
            n.typeCheck();
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
               {
                   sortClassesByInheritance();
                   env.methodOffset=-2;
                   for( ClassNode classdec: classList)
                       res.addAll(classdec.checkSemantics(env));
               }

        //Adesso checksemantic per il let(se c'è) e poi per l'exp
        env.nestingLevel++;
        HashMap<String,STentry> hm = new HashMap<String,STentry> ();
        env.symTable.add(hm);

        env.offset=env.methodOffset;
        if(ProgClassNode.innerdec!=null) {
            //env.offset -2??????????????????????
            for(Node node:ProgClassNode.innerdec){

                STentry entry = new STentry(env.nestingLevel, env.offset--); //separo introducendo "entry"
                if(node instanceof FunNode) {
                    if (hm.put(((FunNode)node).getId(), entry) != null)
                        res.add(new SemanticError("Fun id " + ((FunNode)node).getId() + " already declared"));
                    else
                        ((FunNode)node).entry=entry;
                }
                else if (node instanceof VarNode){
                    if (hm.put(((VarNode)node).getId(), entry) != null)
                        res.add(new SemanticError("Var id " + ((VarNode)node).getId() + " already declared"));
                    else
                        ((VarNode) node).entry = entry;
                }
            }
            for (Node d : ProgClassNode.innerdec)
                res.addAll(d.checkSemantics(env));
        }

        res.addAll(ProgClassNode.exp.checkSemantics(env));

        env.symTable.remove(env.nestingLevel--);
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

    public static ClassNode getClassFromList(String className)
    {
        ClassNode clNode = null;

        if(className != null)
        {
            if(classList != null)
                for (ClassNode classdec:classList)
                {
                    if(  classdec.getId().compareTo(className) == 0)
                    {
                        clNode =  classdec;
                        break;
                    }
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
            ArrayList<FunNode> methodList =  classdec.getMethodsList();
            for(FunNode method:methodList)
            {
                boolean found=false;
                ClassNode superClass = classdec.getExtendedClass();
                while( superClass != null && !found)
                {
                    ArrayList<FunNode> superMethodList =  superClass.getMethodsList();

                    for (int i =0;i<superMethodList.size() && !found;i++)
                    {
                        FunNode superMethod=superMethodList.get(i);
                        if(Objects.equals(superMethod.getId(), method.getId()))
                        {
                            found=true;
                            Node curMethodType =  method.getType();
                            Node superMethodType =  superMethod.getType();
                            checkReturnType(curMethodType, superMethodType);
                            checkMethodParametersType(method, superMethod);
                        }

                    }
                    if(!found)
                        superClass = (superClass.getExtendedClass());

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
                Node subParam = ((ParNode)subParamList.get(i)).getType();
                Node superParam = ((ParNode)superParamList.get(i)).getType();
                checkParamType(subParam, superParam, i);
            }
        }
        else
        {
            System.out.println("Param list size of overridden method does not correspond to param list size of super-method");
            System.exit(0);
        }
    }

    private void checkParamType(Node subParamType, Node superParamType, int paramIndex)
    {
        if (!FOOLlib.isSupertype(subParamType, superParamType))
        {
            System.out.println("Param type, in position " + (paramIndex + 1) + ", in overridden method, is not supertype of param type in super-method ");
            System.exit(0);
        }
    }

    private void checkReturnType(Node subType, Node superType)
    {
        if (!(FOOLlib.isSubtype(subType, superType)))
        {
            System.out.println("Method return type in class  is not subtype of method return type in super class ");
            System.exit(0);
        }
    }

    private void sortClassesByInheritance()
    {
        Map<String, String> classMap = new HashMap<>();
        List<ClassNode> orderedList = new LinkedList<>();

        for(ClassNode cl: classList)
        {
            String className = cl.getId();
            String extendedClass = cl.getExtendedClassName();
            classMap.put(className, extendedClass);
        }

        for(String clName: classMap.keySet())
        {
            String ext = classMap.get(clName);
            ClassNode curClass = getClassFromList(clName);
            ClassNode curExtClass = getClassFromList(ext);

            if(ext != null)
            {
                if(!orderedList.contains(curExtClass))
                {


                    orderedList.add(curExtClass);
                        orderedList.add(curClass);
                }
                else
                {
                    int extIndex = orderedList.indexOf(curExtClass);
                    if(extIndex < orderedList.size() - 1)
                        orderedList.add(extIndex+1, curClass);
                    else
                        orderedList.add(curClass);
                }
            }
            else
            {
                orderedList.add(curClass);
            }
        }
        classList = new ArrayList<>(orderedList);
    }

    @Override
    public String codeGeneration()
    {
        String classDeclCode="";
        for (Node classdec:classList)
            classDeclCode+=classdec.codeGeneration();

        String innerDeclCode="";
        for(Node inDec:innerdec)
            innerDeclCode+=inDec.codeGeneration();

        return  "push 0\n"+
                classDeclCode+
                innerDeclCode+
                exp.codeGeneration()+"halt\n"+
                FOOLlib.getCode();
    }

}
