package astInterpreter;

import parser.SVMParser;

/**
 * Created by suri9 on 28/06/2017.
 */
public class BranchgreatereqNode implements InterpreterNode {
    private String label;

    public BranchgreatereqNode(String l) {
        label = l;
    }

    @Override
    public void code() {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.BRANCHGREATEREQ;
        InstructionSet.labelRef.put(InstructionSet.ip++, label);
    }
}
