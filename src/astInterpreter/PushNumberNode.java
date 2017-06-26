package astInterpreter;

import java.util.ArrayList;
import astInterpreter.InterpreterNode;
import parser.SVMParser;
import util.Environment;
import util.SemanticError;
import parser.SVMVisitorImpl;

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
    };
}