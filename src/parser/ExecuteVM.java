package parser;

import java.util.ArrayList;

public class ExecuteVM {

    public static final int CODESIZE = 10000;
    public static final int MEMSIZE = 10000;

    private int[] code;
    private int[] memory = new int[MEMSIZE];

    private int ip = 0;
    private int sp = MEMSIZE;

    private int hp = 0;
    private int fp = MEMSIZE;
    private int ra;
    private int rv;

    public ExecuteVM(int[] code) {
        this.code = code;
    }

    private void printMemory() {
        ArrayList<Integer> list = new ArrayList<Integer>(memory.length);
        for (int i = 0; i < 10; i++)
            list.add(memory[i]);
        System.out.print("Heap:");
        System.out.print(list);
        list.clear();
        System.out.print("  Stack:");
        for (int i = MEMSIZE - 30; i < MEMSIZE; i++)
            list.add(memory[i]);
        System.out.println(list);

        System.out.println("FP = " + fp);

    }

    public void cpu() {
        while (true) {
            if (hp == sp) {
                System.err.println("Error: out of memory. Exiting... ");
                System.exit(44);
            }

            int bytecode = code[ip++]; // fetch
            //printMemory();
            int v1, v2;
            int address;

            switch (bytecode) {
                case SVMParser.PUSH:
                    push(code[ip++]);
                    break;
                case SVMParser.POP:
                    pop();
                    break;
                case SVMParser.ADD:
                    v1 = pop();
                    v2 = pop();
                    push(v2 + v1);
                    break;
                case SVMParser.MULT:
                    v1 = pop();
                    v2 = pop();
                    push(v2 * v1);
                    break;
                case SVMParser.DIV:
                    v1 = pop();
                    v2 = pop();
                    push(v2 / v1);
                    break;
                case SVMParser.SUB:
                    v1 = pop();
                    v2 = pop();
                    push(v2 - v1);
                    break;

                case SVMParser.STOREW: //
                    address = pop();
                    memory[address] = pop();
                    break;
                case SVMParser.LOADW: //
                    push(memory[pop()]);
                    break;
                case SVMParser.BRANCH:
                    address = code[ip];
                    ip = address;
                    break;
                case SVMParser.BRANCHEQ: //
                    address = code[ip++];
                    v1 = pop();
                    v2 = pop();
                    if (v2 == v1) ip = address;
                    break;
                case SVMParser.BRANCHGREATER:
                    address = code[ip++];
                    v1 = pop();
                    v2 = pop();
                    if (v2 > v1) ip = address;
                    break;
                case SVMParser.BRANCHLESS:
                    address = code[ip++];
                    v1 = pop();
                    v2 = pop();
                    if (v2 < v1) ip = address;
                    break;
                case SVMParser.BRANCHGREATEREQ:
                    address = code[ip++];
                    v1 = pop();
                    v2 = pop();
                    if (v2 >= v1) ip = address;
                    break;
                case SVMParser.BRANCHLESSEQ:
                    address = code[ip++];
                    v1 = pop();
                    v2 = pop();
                    if (v2 <= v1) ip = address;
                    break;
                case SVMParser.JS: //
                    address = pop();
                    ra = ip;
                    ip = address;
                    break;
                case SVMParser.STORERA: //
                    ra = pop();
                    break;
                case SVMParser.LOADRA: //
                    push(ra);
                    break;
                case SVMParser.STORERV: //
                    rv = pop();
                    break;
                case SVMParser.LOADRV: //
                    push(rv);
                    break;
                case SVMParser.LOADFP: //
                    push(fp);
                    break;
                case SVMParser.STOREFP: //
                    fp = pop();
                    break;
                case SVMParser.COPYFP: //
                    fp = sp;
                    break;
                case SVMParser.STOREHP: //
                    hp = pop();
                    break;
                case SVMParser.LOADHP: //
                    push(hp);
                    break;
                case SVMParser.PRINT:
                    System.out.println((sp < MEMSIZE) ? memory[sp] : "Empty stack!");
                    break;
                case SVMParser.HALT:
                    return;
            }
        }
    }

    private int pop() {
        return memory[sp++];
    }

    private void push(int v) {

        memory[--sp] = v;
    }

}