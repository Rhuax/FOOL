package astInterpreter;

import parser.SVMParser;

/**
 * Created by adele on 23/06/2017.
 */
public class LabelColNode implements InterpreterNode {
    private String label;

    public LabelColNode(String l)
    {
        label = l;
    }

    public void code()
    {
        InstructionSet.labelAdd.put(label,InstructionSet.ip);
        // l=LABEL COL     {labelAdd.put($l.text,i);}
    };
}
