package astInterpreter;

import parser.SVMParser;

/**
 * Created by suri9 on 22/06/2017.
 */
public class PushLabelNode implements InterpreterNode
{
    private String label;

    public PushLabelNode(String l)
    {
        label = l;
    }

    public void code()
    {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.PUSH;
        InstructionSet.labelRef.put(InstructionSet.ip++, label);
    }
}
