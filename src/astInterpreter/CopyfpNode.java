package astInterpreter;

import parser.SVMParser;

/**
 * Created by adele on 23/06/2017.
 */
public class CopyfpNode implements InterpreterNode {

    public void code() {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.COPYFP;
    }
}