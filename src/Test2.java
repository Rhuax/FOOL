import ast.FoolVisitorImpl;
import ast.Node;
import ast.ProgClassNode;
import astInterpreter.InstructionSet;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;
import util.DispatchTable;
import util.Environment;
import util.SemanticError;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) throws Exception {

        if(args.length==0){
            System.err.println("Source file not passed!");
            System.out.println("Exiting...");
            System.exit(0);
        }

        String fileName=args[0];

        FileInputStream is = new FileInputStream(fileName);

        ANTLRInputStream input = new ANTLRInputStream(is);
        FoolProvaBisLexer lexer = new FoolProvaBisLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //SIMPLISTIC BUT WRONG CHECK OF THE LEXER ERRORS
        if (lexer.lexicalErrors > 0) {
            System.out.println("The program was not in the right format. Exiting the compilation process now");
        } else {

            FoolProvaBisParser parser = new FoolProvaBisParser(tokens);

            ParseTree t = parser.prog();
            if (parser.getNumberOfSyntaxErrors() == 0) { //Se non ci sono errori nel parser allora passa ai controlli semantici
                //System.out.println(t.getText()) ;


                FoolVisitorImpl visitor = new FoolVisitorImpl();
                Node ast = visitor.visit(t); //generazione AST


                Environment env = new Environment();
                ArrayList<SemanticError> err = ast.checkSemantics(env);

                if (err.size() > 0) {
                    System.out.println("You had: " + err.size() + " semantic errors:");
                    for (SemanticError e : err)
                        System.err.println("\t" + e);
                } else {


                    System.out.println("Visualizing AST...");
                    System.out.println(ast.toPrint(""));

                    Node type = ast.typeCheck(); //type-checking bottom-up
                    //System.out.println("Type checking ok!");
                    System.out.println(type.toPrint("Type checking ok! Type of the program is: "));


                    DispatchTable.buildDispatchTable(ProgClassNode.classList);
                    // CODE GENERATION  prova.fool.asm
                    String code = ast.codeGeneration();


                    BufferedWriter out = new BufferedWriter(new FileWriter(fileName + ".asm"));
                    out.write(code);
                    out.close();
                    System.out.println("Code generated! Assembling and running generated code.");

                    FileInputStream isASM = new FileInputStream(fileName + ".asm");
                    ANTLRInputStream inputASM = new ANTLRInputStream(isASM);
                    SVMLexer lexerASM = new SVMLexer(inputASM);
                    CommonTokenStream tokensASM = new CommonTokenStream(lexerASM);
                    SVMParser parserASM = new SVMParser(tokensASM);

                    ParseTree svmt = parserASM.start();
                    SVMVisitorImpl svmVisitor = new SVMVisitorImpl();
                /*InterpreterNode svmTree = */
                    svmVisitor.visit(svmt);


                    System.out.println("You had: " + lexerASM.lexicalErrors + " lexical errors and " + parserASM.getNumberOfSyntaxErrors() + " syntax errors.");
                    if (lexerASM.lexicalErrors > 0 || parserASM.getNumberOfSyntaxErrors() > 0) System.exit(1);

                    System.out.println("Starting Virtual Machine...");
                    ExecuteVM vm = new ExecuteVM(InstructionSet.code);
                    vm.cpu();
                }
            }
        }
    }
}



