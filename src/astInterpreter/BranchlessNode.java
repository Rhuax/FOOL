package astInterpreter;

import parser.SVMParser;

/**
 * Created by suri9 on 28/06/2017.
 */
public class BranchlessNode implements InterpreterNode {
    private String label;

    public BranchlessNode(String l) {
        label = l;
    }

    @Override
    public void code() {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.BRANCHLESS;
        InstructionSet.labelRef.put(InstructionSet.ip++, label);
    }
}
