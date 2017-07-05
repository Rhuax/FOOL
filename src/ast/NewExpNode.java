package ast;

import lib.FOOLlib;
import org.omg.PortableInterceptor.DISCARDING;
import util.DispatchTable;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by suri9 on 24/06/2017.
 */
public class NewExpNode implements  Node
{
    String classId;
    public ArrayList<Node> expList;
    private static int fakehp=0;
    public NewExpNode(String id, ArrayList<Node> el)
    {
        classId = id; expList = el;
    }

    @Override
    public String toPrint(String indent) {
        return null;
    }

    @Override
    public Node typeCheck()
    {
        ClassNode cl = ProgClassNode.getClassFromList(classId);
            ArrayList<VardecNode> totalAttributes = cl.getTotalAttributes();

            if(expList.size() == totalAttributes.size())
            {
                for (int i = 0; i < totalAttributes.size(); i++)
                {
                    Node subAtt = expList.get(i);
                    Node supAtt = totalAttributes.get(i);
                    Node subType = subAtt.typeCheck();
                    Node supType = ((VardecNode) supAtt).getType();

                    if(!FOOLlib.isSubtype(subType, supType))
                    {
                        System.out.println("Type of parameter in position " + (i+1) + " in instantiation of class " + cl.getId() + " is not compatible with the type of corresponding attribute!");
                        System.exit(0);
                    }
                }
            }
            else
            {
                System.out.println("Wrong number of parameters when instantiating class " + cl.getId() + ". Also super classes attributes must be included!");
                System.exit(0);
            }

        return new IdTypeNode(classId);
}

    @Override
    public String codeGeneration() {
        String code="";
       /*
       versione da aggiustare con le new delle new delle new
       code+="lhp\n"+
                "srv\n";

        code+="lhp\n"+
                "push "+expList.size()+"\n"+
                "shp\n";


        for (Node anExpList : expList) {
            code += anExpList.codeGeneration();
            code += "lrv\n" +
                    "sw\n" +
                    "lrv\n" +
                    "push 1\n" +
                    "add\n" +
                    "srv\n";
        }
*/

        code+="lhp\n";
        if(expList.size()>0){
            code+=expList.get(0).codeGeneration();
            code+="lhp\n"+
                    "sw\n";
        }
        for(int i=1;i<expList.size();i++){
            code+=expList.get(i).codeGeneration();
            code+="lhp\n"
                    + "push 1\n"
                    + "add\n"
                    + "shp\n"
                    + "lhp\n"
                    + "sw\n";
        }
        code+="lhp\n"+
                "push 1\n"+
                "add\n"+
                "shp\n";


        return code;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        ArrayList<SemanticError> res = new ArrayList<>();

        ClassNode cl = ProgClassNode.getClassFromList(classId);
        if(cl == null)
        {
            res.add(new SemanticError("Cannot instantiate a class that does not exist!"));
        }
        else
        {
            for(Node exp: expList)
                res.addAll(exp.checkSemantics(env));
        }

        return res;
    }
}
