package ast;

import lib.FOOLlib;
import util.Environment;
import util.MapClassNestLevel;
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
                System.out.println("Wrong number of parameters when instantiating class " + cl.getId() + ". If inheriting, also super class' attributes must be included!");
                System.exit(0);
            }

        return new IdTypeNode(classId);
}

    @Override
    public String codeGeneration() {
        String code="";
        code+="lhp\n";//oggetto
        code+="lhp\n";//copia di hp

        code+="lhp\n"+
                "push "+(expList.size()+1)+"\n"+
                "add\n"+
                "shp\n";//aggiorno hp

        if(expList.isEmpty())
            code+="pop\n";//elimina copia


        for(int i=0;i<expList.size();i++){
            code+=expList.get(i).codeGeneration();
            /**
             * adesso c'è:
             * risultato della exp
             * copiahp
             */
            code+="srv\n"+
                    "sra\n"+
                    "lrv\n"+
                    "lra\n"+
                    "sw\n";
            if(i!=expList.size()-1) {
                code+="lra\n" +
                        "push 1\n" +
                        "add\n";
            }

        }

        /*
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
*/

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
