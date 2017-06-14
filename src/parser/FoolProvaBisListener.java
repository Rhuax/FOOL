// Generated from /home/crow/git/FOOL/src/parser/FoolProvaBis.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FoolProvaBisParser}.
 */
public interface FoolProvaBisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSingleExp(FoolProvaBisParser.SingleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSingleExp(FoolProvaBisParser.SingleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterLetInExp(FoolProvaBisParser.LetInExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitLetInExp(FoolProvaBisParser.LetInExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterClassExp(FoolProvaBisParser.ClassExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitClassExp(FoolProvaBisParser.ClassExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#classdec}.
	 * @param ctx the parse tree
	 */
	void enterClassdec(FoolProvaBisParser.ClassdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#classdec}.
	 * @param ctx the parse tree
	 */
	void exitClassdec(FoolProvaBisParser.ClassdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(FoolProvaBisParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(FoolProvaBisParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(FoolProvaBisParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(FoolProvaBisParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#varasm}.
	 * @param ctx the parse tree
	 */
	void enterVarasm(FoolProvaBisParser.VarasmContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#varasm}.
	 * @param ctx the parse tree
	 */
	void exitVarasm(FoolProvaBisParser.VarasmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(FoolProvaBisParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(FoolProvaBisParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link FoolProvaBisParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(FoolProvaBisParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link FoolProvaBisParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(FoolProvaBisParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link FoolProvaBisParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(FoolProvaBisParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link FoolProvaBisParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(FoolProvaBisParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FoolProvaBisParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FoolProvaBisParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FoolProvaBisParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FoolProvaBisParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FoolProvaBisParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FoolProvaBisParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FoolProvaBisParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FoolProvaBisParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(FoolProvaBisParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(FoolProvaBisParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(FoolProvaBisParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(FoolProvaBisParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFloatVal(FoolProvaBisParser.FloatValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFloatVal(FoolProvaBisParser.FloatValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(FoolProvaBisParser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(FoolProvaBisParser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(FoolProvaBisParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(FoolProvaBisParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(FoolProvaBisParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(FoolProvaBisParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterThisExp(FoolProvaBisParser.ThisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitThisExp(FoolProvaBisParser.ThisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(FoolProvaBisParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(FoolProvaBisParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMethodExp(FoolProvaBisParser.MethodExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMethodExp(FoolProvaBisParser.MethodExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(FoolProvaBisParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(FoolProvaBisParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolProvaBisParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(FoolProvaBisParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolProvaBisParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(FoolProvaBisParser.OperatorContext ctx);
}