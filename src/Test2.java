import java.io.BufferedWriter;
import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.FoolProvaBisParser.DecContext;
import parser.FoolProvaBisParser.FunContext;
import parser.FoolProvaBisParser.FunDeclarationContext;
import parser.FoolProvaBisParser.LetContext;
import parser.FoolProvaBisParser.LetInExpContext;
import parser.FoolProvaBisParser.ClassdecContext;
import parser.FoolProvaBisParser.ProgContext;
import ast.FoolVisitorImpl;
import parser.*;
import ast.Node;
import util.*;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Test2 {
	static int count_var (ParseTree t){
		if (t.getClass().getName().equals("parser.FoolProvaBisParser$LetContext")){
			LetContext s = (LetContext) t ;
			int n = 0 ;
			for (DecContext dc : s.dec()) {
				if (dc.getClass().getName().equals("parser.FoolProvaBisParser$VarAssignmentContext")) {
					n = n+1 ;
				} else n = n + count_var(dc) ;
			}		
			return(n) ;	
		}
		else if (t.getClass().getName().equals("parser.FoolProvaBisParser$LetInExpContext")){
			LetInExpContext s = (LetInExpContext) t ;
			return(count_var(s.let())) ;
		}
		else if (t.getClass().getName().equals("parser.FoolProvaBisParser$FunDeclarationContext")){
			FunDeclarationContext s = (FunDeclarationContext) t ;
			if (s.fun().let() == null){
				return(1) ;
			} else return (1 + count_var(s.fun().let()) );	
		}
		else if (t.getClass().getName().equals("parser.FoolProvaBisParser$ClassExpContext")){
			FoolProvaBisParser.ClassExpContext c = (FoolProvaBisParser.ClassExpContext) t;
			int n=0;
			for(ClassdecContext cdec:c.classdec()){
				n+=cdec.vardec().size();
			}
			return n + count_var(c.let());
		}

		else return(0) ;
	}
	
	public static void main(String[] args) throws Exception {
      
        String fileName = "prova.fool";
      
        FileInputStream is = new FileInputStream(fileName);
        ANTLRInputStream input = new ANTLRInputStream(is);
		FoolProvaBisLexer lexer = new FoolProvaBisLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //SIMPLISTIC BUT WRONG CHECK OF THE LEXER ERRORS
        if(lexer.lexicalErrors > 0){
        	System.out.println("The program was not in the right format. Exiting the compilation process now");
        }
        else
        	{
        
	        FoolProvaBisParser parser = new FoolProvaBisParser(tokens);
	        
	        ParseTree t = parser.prog() ;
	        	        
	        //System.out.println(t.getText()) ;
	        //System.out.println(count_var(t)) ;

			FoolVisitorImpl visitor = new FoolVisitorImpl();


	        Node ast = visitor.visit(t); //generazione AST

			/*
	        Environment env = new Environment();
	        ArrayList<SemanticError> err = ast.checkSemantics(env);

	        if(err.size()>0){
	        	System.out.println("You had: " +err.size()+" errors:");
	        	for(SemanticError e : err)
	        		System.out.println("\t" + e);
	        }else{
	        

	
		        System.out.println("Visualizing AST...");
		        System.out.println(ast.toPrint(""));
		*/
		        Node type = ast.typeCheck(); //type-checking bottom-up 
		        System.out.println(type.toPrint("Type checking ok! Type of the program is: "));
		        
		      
		        // CODE GENERATION  prova.fool.asm
		        String code=ast.codeGeneration(); 
		        BufferedWriter out = new BufferedWriter(new FileWriter(fileName+".asm"));
		        out.write(code);
		        out.close(); 
		        System.out.println("Code generated! Assembling and running generated code.");
		        
		        FileInputStream isASM = new FileInputStream(fileName+".asm");
		        ANTLRInputStream inputASM = new ANTLRInputStream(isASM);
		        SVMLexer lexerASM = new SVMLexer(inputASM);
		        CommonTokenStream tokensASM = new CommonTokenStream(lexerASM);
		        SVMParser parserASM = new SVMParser(tokensASM);
		        
		        parserASM.assembly();
		        
		        System.out.println("You had: "+lexerASM.lexicalErrors+" lexical errors and "+parserASM.getNumberOfSyntaxErrors()+" syntax errors.");
		        if (lexerASM.lexicalErrors>0 || parserASM.getNumberOfSyntaxErrors()>0) System.exit(1);
		
		        System.out.println("Starting Virtual Machine...");
		        ExecuteVM vm = new ExecuteVM(parserASM.code);
		        vm.cpu();
	        }

        }
       
        
    }

