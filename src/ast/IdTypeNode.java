package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by crow on 26/06/17.
 */
public class IdTypeNode implements Node{
    public String getTypeName() {
        return typeName;
    }

    private String typeName;
    public IdTypeNode(String typeName){
        this.typeName=typeName;
    }
    @Override
    public String toPrint(String indent) {
        return indent+"typeName:"+typeName+"\n";
    }
    @Override
    public String toString(){
        return getTypeName();
    }
    @Override
    public Node typeCheck() {
        return null;
    }

    @Override
    public String codeGeneration() {
        return "";
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        return  new ArrayList<SemanticError>();
    }
}
