package astInterpreter;

import parser.ExecuteVM;

import java.util.HashMap;

/**
 * Created by suri9 on 22/06/2017.
 */
public class InstructionSet {
    static public int[] code = new int[ExecuteVM.CODESIZE];
    static public HashMap<String, Integer> labelAdd = new HashMap<String, Integer>();
    static public HashMap<Integer, String> labelRef = new HashMap<Integer, String>();
    static public int ip = 0;
}
