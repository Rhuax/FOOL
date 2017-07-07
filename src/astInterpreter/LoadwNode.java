package astInterpreter;

import parser.SVMParser;

/**
 * Created by adele on 23/06/2017.
 */
public class LoadwNode implements InterpreterNode {

    public void code()
    {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.LOADW;
    }
}
