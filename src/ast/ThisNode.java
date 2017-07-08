package ast;

import util.Environment;
import util.MapClassNestLevel;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by crow on 27/06/17.
 */
public class ThisNode implements Node {
    @Override
    public String toPrint(String indent) {
        return null;
    }

    @Override
    public Node typeCheck() {
        ClassNode c = MapClassNestLevel.getCurrentAnalyzedClass();
        if (c == null) {
            System.out.println("Cannot use 'this' operator outside a class context");
            System.exit(0);
        }

        return new IdTypeNode(c.getId());
    }

    @Override
    public String codeGeneration() {
        String code = "";
        code += "lfp\n" +
                "push -1\n" +
                "add \n" +
                "lw\n";
        return code;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        return new ArrayList<SemanticError>();
    }
}
