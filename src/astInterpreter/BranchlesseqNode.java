package astInterpreter;

import parser.SVMParser;

/**
 * Created by adele on 23/06/2017.
 */
public class BranchlesseqNode implements InterpreterNode {
    private String label;

    public BranchlesseqNode(String l) {
        label = l;
    }

    public void code() {
        InstructionSet.code[InstructionSet.ip++] = SVMParser.BRANCHLESSEQ;
        InstructionSet.labelRef.put(InstructionSet.ip++, label);
    }
}
