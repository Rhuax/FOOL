package astInterpreter;

import ast.Node;
import parser.SVMParser;

/**
 * Created by suri9 on 28/06/2017.
 */
public class BranchgreaterNode implements InterpreterNode
{
    private String label;

    public BranchgreaterNode(String l)
    {
        label = l;
    }

    @Override
    public void code()
    {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.BRANCHGREATER;
        InstructionSet.labelRef.put(InstructionSet.ip++, label);
    }
}
