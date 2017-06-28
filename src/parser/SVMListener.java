// Generated from C:/Users/suri9/Documents/GitHub/FOOL/src/parser\SVM.g4 by ANTLR 4.7
package parser;

import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SVMParser}.
 */
public interface SVMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code startRule}
	 * labeled alternative in {@link SVMParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(SVMParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code startRule}
	 * labeled alternative in {@link SVMParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(SVMParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pushNumber}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterPushNumber(SVMParser.PushNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pushNumber}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitPushNumber(SVMParser.PushNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pushLabel}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterPushLabel(SVMParser.PushLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pushLabel}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitPushLabel(SVMParser.PushLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pop}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterPop(SVMParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pop}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitPop(SVMParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SVMParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SVMParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterSub(SVMParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitSub(SVMParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterMult(SVMParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitMult(SVMParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SVMParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SVMParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadw}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterLoadw(SVMParser.LoadwContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadw}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitLoadw(SVMParser.LoadwContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SVMParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SVMParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branch}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterBranch(SVMParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branch}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitBranch(SVMParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brancheq}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterBrancheq(SVMParser.BrancheqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brancheq}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitBrancheq(SVMParser.BrancheqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchgreater}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterBranchgreater(SVMParser.BranchgreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchgreater}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitBranchgreater(SVMParser.BranchgreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchless}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterBranchless(SVMParser.BranchlessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchless}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitBranchless(SVMParser.BranchlessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchgreatereq}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterBranchgreatereq(SVMParser.BranchgreatereqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchgreatereq}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitBranchgreatereq(SVMParser.BranchgreatereqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchlesseq}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterBranchlesseq(SVMParser.BranchlesseqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchlesseq}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitBranchlesseq(SVMParser.BranchlesseqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code js}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterJs(SVMParser.JsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code js}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitJs(SVMParser.JsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadra}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterLoadra(SVMParser.LoadraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadra}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitLoadra(SVMParser.LoadraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storera}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterStorera(SVMParser.StoreraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storera}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitStorera(SVMParser.StoreraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadrv}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterLoadrv(SVMParser.LoadrvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadrv}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitLoadrv(SVMParser.LoadrvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storerv}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterStorerv(SVMParser.StorervContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storerv}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitStorerv(SVMParser.StorervContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadfp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterLoadfp(SVMParser.LoadfpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadfp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitLoadfp(SVMParser.LoadfpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storefp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterStorefp(SVMParser.StorefpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storefp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitStorefp(SVMParser.StorefpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyfp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterCopyfp(SVMParser.CopyfpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyfp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitCopyfp(SVMParser.CopyfpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadhp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterLoadhp(SVMParser.LoadhpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadhp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitLoadhp(SVMParser.LoadhpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storehp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterStorehp(SVMParser.StorehpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storehp}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitStorehp(SVMParser.StorehpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SVMParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SVMParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code halt}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterHalt(SVMParser.HaltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code halt}
	 * labeled alternative in {@link SVMParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitHalt(SVMParser.HaltContext ctx);
}