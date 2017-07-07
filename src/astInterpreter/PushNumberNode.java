package astInterpreter;

import astInterpreter.InterpreterNode;
import parser.SVMParser;

public class PushNumberNode implements InterpreterNode
{
    private int value;

    public PushNumberNode(int val)
    {
        value = val;
    }

    public void code()
    {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.PUSH;
        InstructionSet.code[InstructionSet.ip++] = value;
    }
}