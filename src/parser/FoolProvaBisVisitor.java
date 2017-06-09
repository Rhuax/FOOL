// Generated from C:/Users/suri9/Documents/GitHub/FOOL/src/parser\FoolProvaBis.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FoolProvaBisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FoolProvaBisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExp(FoolProvaBisParser.SingleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetInExp(FoolProvaBisParser.LetInExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classExp}
	 * labeled alternative in {@link FoolProvaBisParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExp(FoolProvaBisParser.ClassExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#classdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdec(FoolProvaBisParser.ClassdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(FoolProvaBisParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(FoolProvaBisParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#varasm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarasm(FoolProvaBisParser.VarasmContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(FoolProvaBisParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link FoolProvaBisParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(FoolProvaBisParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link FoolProvaBisParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(FoolProvaBisParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FoolProvaBisParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(FoolProvaBisParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FoolProvaBisParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(FoolProvaBisParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(FoolProvaBisParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(FoolProvaBisParser.BoolValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatVal}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVal(FoolProvaBisParser.FloatValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(FoolProvaBisParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(FoolProvaBisParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(FoolProvaBisParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExp(FoolProvaBisParser.ThisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExp(FoolProvaBisParser.FunExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExp(FoolProvaBisParser.MethodExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link FoolProvaBisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(FoolProvaBisParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FoolProvaBisParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(FoolProvaBisParser.OperatorContext ctx);
}