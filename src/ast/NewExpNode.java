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
            ArrayList<VardecNode> al = cl.getAttributeList();
            if(expList.size() <= al.size())
            {
                for (int i = 0; i < expList.size(); i++)
                {
                    Node subAtt = expList.get(i);
                    Node supAtt = al.get(i);
                    Node subType = subAtt.typeCheck();
                    Node supType = ((VardecNode) supAtt).getType();

                    if(!FOOLlib.isSubtype(subType, supType))
                    {
                        System.out.println("Type of parameter in position " + (i+1) + "in instantiation of class " + cl.getId() + "is not compatible with the type of corresponding attribute!");
                        System.exit(0);
                    }
                }
            }
            else
            {
                System.out.println("Too much parameters when instantiating class " + cl.getId() + "!");
                System.exit(0);
            }

        return new IdTypeNode(classId);
}

    @Override
    public String codeGeneration() {
        return null;
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
