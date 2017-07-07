grammar SVM;

@header {
import java.util.HashMap;
}

@lexer::members {
public int lexicalErrors=0;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
start: (assembly)*                #startRule;

assembly: 
     PUSH n=NUMBER              #pushNumber
	  | PUSH l=LABEL            #pushLabel
	  | POP                     #pop
	  | ADD                     #add
	  | SUB                     #sub
	  | MULT                    #mult
	  | DIV                     #div
	  | LOADW                   #loadw
	  | l=LABEL COL             #label
	  | BRANCH l=LABEL          #branch
	  | BRANCHEQ l=LABEL        #brancheq
	  | BRANCHGREATER l=LABEL   #branchgreater
	  | BRANCHLESS l=LABEL      #branchless
	  | BRANCHGREATEREQ l=LABEL #branchgreatereq
	  | BRANCHLESSEQ l=LABEL    #branchlesseq
	  | JS                      #js
	  | LOADRA                  #loadra
	  | STORERA                 #storera
	  | LOADRV                  #loadrv
	  | STORERV                 #storerv
	  | LOADFP                  #loadfp
	  | STOREFP                 #storefp
	  | COPYFP                  #copyfp
	  | LOADHP                  #loadhp
	  | STOREHP                 #storehp
	  | PRINT                   #print
	  | HALT                    #halt
	  | STOREW                  #storew
;

 	 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
PUSH : 'push' ; 	// pushes constant in the stack
POP	 : 'pop' ; 	// pops from stack
ADD	 : 'add' ;  	// add two values from the stack
SUB	 : 'sub' ;	// add two values from the stack
MULT : 'mult' ;  	// add two values from the stack
DIV	 : 'div' ;	// add two values from the stack
STOREW	 : 'sw' ; 	// store in the memory cell pointed by top the value next
LOADW	 : 'lw' ;	// load a value from the memory cell pointed by top
BRANCH	 : 'b' ;	// jump to label
BRANCHEQ : 'beq' ;	// jump to label if top == next
BRANCHGREATER : 'bg';   //
BRANCHLESS: 'bl';   //
BRANCHGREATEREQ: 'bgeq';    //
BRANCHLESSEQ:'bleq' ;	// jump to label if top <= next
JS	 : 'js' ;	// jump to instruction pointed by top of stack and store next instruction in ra
LOADRA	 : 'lra' ;	// load from ra
STORERA  : 'sra' ;	// store top into ra	 
LOADRV	 : 'lrv' ;	// load from rv
STORERV  : 'srv' ;	// store top into rv	 
LOADFP	 : 'lfp' ;	// load frame pointer in the stack
STOREFP	 : 'sfp' ;	// store top into frame pointer
COPYFP   : 'cfp' ;      // copy stack pointer into frame pointer
LOADHP	 : 'lhp' ;	// load heap pointer in the stack
STOREHP	 : 'shp' ;	// store top into heap pointer
PRINT	 : 'print' ;	// print top of stack
HALT	 : 'halt' ;	// stop execution

COL	 : ':' ;
LABEL	 : ('a'..'z'|'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
NUMBER	 : '0' | ('-')?(('1'..'9')('0'..'9')*) ;

WHITESP  : ( '\t' | ' ' | '\r' | '\n' )+   -> channel(HIDDEN);

ERR   	 : . { System.err.println("Invalid char: "+ getText()); lexicalErrors++;  } -> channel(HIDDEN); 

