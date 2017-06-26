package ast;

import lib.FOOLlib;
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

    NewExpNode(String id, ArrayList<Node> el)
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
        if(cl != null)
        {
            ArrayList<VardecNode> al = cl.getAttributeList();
            if(expList.size() == al.size())
            {
                for (int i = 0; i < expList.size(); i++)
                {
                    Node subAtt = expList.get(i);
                    Node supAtt = al.get(i);
                    Node subType = subAtt.typeCheck();
                    Node supType = ((ParNode) supAtt).getType();
                    if(!FOOLlib.isSubtype(subType, supType))
                    {
                        System.out.println("Type of parameter in position " + (i+1) + "in instantiation of class " + cl.getId() + "is not compatible with the type of corresponding attribute!");
                        System.exit(0);
                    }

                }
            }
            else
            {
                System.out.println("Not enough parameters to instantiate an object of class " + cl.getId() + "!");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Cannot instantiate a class that non exists!");
            System.exit(0);
        }
        return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        ArrayList<SemanticError> res = new ArrayList<>();

        if(expList != null)
            for(Node exp: expList)
                res.addAll(exp.checkSemantics(env));

        return res;
    }
}
