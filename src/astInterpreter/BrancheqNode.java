package astInterpreter;

import parser.SVMParser;

/**
 * Created by adele on 23/06/2017.
 */
public class BrancheqNode implements InterpreterNode
{
    private String label;

    public BrancheqNode(String l)
    {
        label = l;
    }

    public void code()
    {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.BRANCHEQ;
        InstructionSet.labelRef.put(InstructionSet.ip++, label);
    };
}
