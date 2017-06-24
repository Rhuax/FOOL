package ast;

import java.util.ArrayList;
import java.util.Objects;

import org.antlr.v4.runtime.tree.TerminalNode;
import parser.FoolProvaBisBaseVisitor;
import parser.FoolProvaBisLexer;
import parser.FoolProvaBisParser;
import parser.FoolProvaBisParser.BaseExpContext;
import parser.FoolProvaBisParser.BoolValContext;
import parser.FoolProvaBisParser.DecContext;
import parser.FoolProvaBisParser.ExpContext;
import parser.FoolProvaBisParser.FactorContext;
import parser.FoolProvaBisParser.FunContext;
import parser.FoolProvaBisParser.FunExpContext;
import parser.FoolProvaBisParser.IfExpContext;
import parser.FoolProvaBisParser.IntValContext;
import parser.FoolProvaBisParser.LetInExpContext;
import parser.FoolProvaBisParser.SingleExpContext;
import parser.FoolProvaBisParser.TermContext;
import parser.FoolProvaBisParser.TypeContext;
import parser.FoolProvaBisParser.VarExpContext;
import parser.FoolProvaBisParser.VarasmContext;
import parser.FoolProvaBisParser.VardecContext;


public class FoolVisitorImpl extends FoolProvaBisBaseVisitor<Node> {

	public Node visitLetInExp(LetInExpContext ctx) {
		
		//resulting node of the right type
		ProgLetInNode res;
		
		//list of declarations in @res
		ArrayList<Node> declarations = new ArrayList<Node>();
		
		//visit all nodes corresponding to declarations inside the let context and store them in @declarations
		//notice that the ctx.let().dec() method returns a list, this is because of the use of * or + in the grammar
		//antlr detects this is a group and therefore returns a list
		for(DecContext dc : ctx.let().dec()){
			declarations.add( visit(dc) );
		}
		
		//visit exp context
		Node exp = visit( ctx.exp() );
		
		//build @res accordingly with the result of the visits to its content
		res = new ProgLetInNode(declarations,  exp);
		
		return res;
	}
	

	public Node visitSingleExp(SingleExpContext ctx) {
		
		//simply return the result of the visit to the inner exp
		return visit(ctx.exp());
		
	}
	

	public Node visitVarasm(VarasmContext ctx) {
		
		//declare the result node
		VarNode result;
		
		//visit the type
		Node typeNode = visit(ctx.vardec().type());
		
		//visit the exp
		Node expNode = visit(ctx.exp());
		
		//build the varNode
		return new VarNode(ctx.vardec().ID().getText(), typeNode, expNode);
	}
	

	public Node visitFun(FunContext ctx) {
		
		//initialize @res with the visits to the type and its ID
		FunNode res = new FunNode(ctx.ID().getText(), visit(ctx.type()));
		
		//add argument declarations
		//we are getting a shortcut here by constructing directly the ParNode
		//this could be done differently by visiting instead the VardecContext
		for(VardecContext vc : ctx.vardec())
			res.addPar( new ParNode(vc.ID().getText(), visit( vc.type() )) );
		
		//add body
		//create a list for the nested declarations
		ArrayList<Node> innerDec = new ArrayList<Node>();
		
		//check whether there are actually nested decs
		if(ctx.let() != null){
			//if there are visit each dec and add it to the @innerDec list
			for(DecContext dc : ctx.let().dec())
				innerDec.add(visit(dc));
		}
		
		//get the exp body
		Node exp = visit(ctx.exp());
		
		//add the body and the inner declarations to the function
		res.addDecBody(innerDec, exp);
		
		return res;		
		
	}
	

	public Node visitType(TypeContext ctx) {
		if(ctx.getText().equals("int"))
			return new IntTypeNode();
		else
			if(ctx.getText().equals("bool"))
				return new BoolTypeNode();
		else
			if(ctx.getText().equals("float"))
				return new FloatTypeNode();
		
		//this will never happen thanks to the parser
		return null;

	}
	

	public Node visitExp(ExpContext ctx)
	{
		return visit(ctx.left);
	}
		/*
		}else{
			//it is a binary expression, you should visit left and right
			return new PlusNode(visit(ctx.left), visit(ctx.right));
		}
		*/

	public Node visitTerm(TermContext ctx)
	{
        Node node = null;
		//check whether this is a simple or binary expression
		//notice here the necessity of having named elements in the grammar
		if(ctx.right == null){
			//it is a simple expression
			return visit( ctx.left );
		}else
		{
			TerminalNode operator = (TerminalNode) ctx.operator().getChild(0);

			switch(operator.getSymbol().getType())
			{
				case FoolProvaBisLexer.EQ:
					node = new EqualNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.PLUS:
                    node = new PlusNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.MINUS:
                    node = new MinusNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.TIMES:
                    node = new MultNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.DIV:
                    node = new DivNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.LESS:
                    node = new LessNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.GREATER:
                    node = new GreaterNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.LEQ:
                    node = new LeqNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.GEQ:
                    node = new GeqNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.AND:
                    node = new AndNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.OR:
                    node = new OrNode(visit(ctx.left), visit(ctx.right));
					break;
				case FoolProvaBisLexer.NOT:
                    node = new NotNode(visit(ctx.left));
					break;
				default:
					System.out.println("Non valid operator token");
					System.exit(0);
					break;
			}
		}
		return node;
	}
	
	

	public Node visitFactor(FactorContext ctx) {
		//check whether this is a simple or binary expression
		//notice here the necessity of having named elements in the grammar
		if(ctx.right == null){
			//it is a simple expression
			return visit( ctx.left );
		}else{
			//it is a binary expression, you should visit left and right
			return new EqualNode(visit(ctx.left), visit(ctx.right));
		}
	}
	
	

	public Node visitIntVal(IntValContext ctx) {
		// notice that this method is not actually a rule but a named production #intVal
		
		//there is no need to perform a check here, the lexer ensures this text is an int
		return new IntNode(Integer.parseInt(ctx.INTEGER().getText()));
	}
	

	public Node visitBoolVal(BoolValContext ctx) {
		
		//there is no need to perform a check here, the lexer ensures this text is a boolean
		return new BoolNode(Boolean.parseBoolean(ctx.getText())); 
	}
	

	public Node visitBaseExp(BaseExpContext ctx) {
		
		//this is actually nothing in the sense that for the ast the parenthesis are not relevant
		//the thing is that the structure of the ast will ensure the operational order by giving
		//a larger depth (closer to the leafs) to those expressions with higher importance
		
		//this is actually the default implementation for this method in the FOOLBaseVisitor class
		//therefore it can be safely removed here
		
		return visit (ctx.exp());

	}
	

	public Node visitIfExp(IfExpContext ctx) {
		
		//create the resulting node
		IfNode res;
		
		//visit the conditional, then the then branch, and then the else branch
		//notice once again the need of named terminals in the rule, this is because
		//we need to point to the right expression among the 3 possible ones in the rule
		
		Node condExp = visit (ctx.cond);
		
		Node thenExp = visit (ctx.thenBranch);
		
		Node elseExp = visit (ctx.elseBranch);
		
		//build the @res properly and return it
		res = new IfNode(condExp, thenExp, elseExp);
		
		return res;
	}
	

	public Node visitVarExp(VarExpContext ctx) {
		
		//this corresponds to a variable access
		return new IdNode(ctx.ID().getText());

	}
	

	public Node visitFunExp(FunExpContext ctx) {
		//this corresponds to a function invocation
		
		//declare the result
		Node res;
		
		//get the invocation arguments
		ArrayList<Node> args = new ArrayList<Node>();
		
		for(ExpContext exp : ctx.exp())
			args.add(visit(exp));
		
		//especial check for stdlib func
		//this is WRONG, THIS SHOULD BE DONE IN A DIFFERENT WAY
		//JUST IMAGINE THERE ARE 800 stdlib functions...
		if(ctx.ID().getText().equals("print"))
			res = new PrintNode(args.get(0));
		
		else
			//instantiate the invocation
			res = new CallNode(ctx.ID().getText(), args);
		
		return res;
	}

	public Node visitVardec(VardecContext ctx)
	{
		Node typeNode = visit(ctx.type());
		return new VardecNode(ctx.ID().getText(), typeNode);
	}

	public Node visitClassExp(FoolProvaBisParser.ClassExpContext ctx)
	{
		ProgClassNode res;

		ArrayList<ClassNode> classList = new ArrayList<>();
		res = new ProgClassNode(classList);
		for(FoolProvaBisParser.ClassdecContext classdec : ctx.classdec())
			classList.add((ClassNode)visit(classdec));



		return res;
	}

	public Node visitClassdec(FoolProvaBisParser.ClassdecContext ctx)
	{
		Node res;
		ArrayList<VardecNode> attList = new ArrayList<>();
		ArrayList<FunNode> methList = new ArrayList<>();

		for(VardecContext vardec : ctx.vardec())
			attList.add((VardecNode)visit(vardec));

		for(FunContext fundec : ctx.fun())
			methList.add((FunNode)visit(fundec));

		if(ctx.ID().size() > 1)
		{
			String parentName=ctx.ID().get(1).getText();
			res = new ClassNode(ctx.ID().get(0).getText(), attList, methList, parentName);
		}
		else
			res = new ClassNode(ctx.ID().get(0).getText(), attList, methList);

		return res;
	}
}
