package astInterpreter;

import parser.SVMParser;

/**
 * Created by crow on 29/06/17.
 */
public class NotNode implements InterpreterNode {
    @Override
    public void code() {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.NOT;
    }
}
