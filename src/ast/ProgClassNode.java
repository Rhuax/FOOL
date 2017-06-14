package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

/**
 * Created by suri9 on 14/06/2017.
 */
public class ProgClassNode implements Node {

    private ArrayList<Node> classList;

    ProgClassNode(ArrayList<Node> cl)
    {
        classList = cl;
    }

    public String toPrint(String s) {
        String classstr = "";
        for (Node classdec:classList)
            classstr+=classdec.toPrint(s+"  ");
        return s+"ClassLetIn\n" + classstr ;
    }

    @Override
    public Node typeCheck() {
        for (Node classdec:classList)
            classdec.typeCheck();
        return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env)
    {
        //Vedere se ci sono classi con nomi duplicati
        //Per le classi che implementano un'altra classe:
            // 1 - vedere se la classe implementata esiste
            // 2 - verificare che tutti i metodi con nome in comune
            // devono rispettare le regole di sottotipaggio
        return null;
    }
}
