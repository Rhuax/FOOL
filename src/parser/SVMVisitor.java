// Generated from /home/crow/git/FOOL/src/parser/SVM.g4 by ANTLR 4.7
package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SVMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface SVMVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by the {@code startRule}
     * labeled alternative in {@link SVMParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStartRule(SVMParser.StartRuleContext ctx);

    /**
     * Visit a parse tree produced by the {@code pushNumber}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPushNumber(SVMParser.PushNumberContext ctx);

    /**
     * Visit a parse tree produced by the {@code pushLabel}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPushLabel(SVMParser.PushLabelContext ctx);

    /**
     * Visit a parse tree produced by the {@code pop}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPop(SVMParser.PopContext ctx);

    /**
     * Visit a parse tree produced by the {@code add}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdd(SVMParser.AddContext ctx);

    /**
     * Visit a parse tree produced by the {@code sub}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSub(SVMParser.SubContext ctx);

    /**
     * Visit a parse tree produced by the {@code mult}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMult(SVMParser.MultContext ctx);

    /**
     * Visit a parse tree produced by the {@code div}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiv(SVMParser.DivContext ctx);

    /**
     * Visit a parse tree produced by the {@code loadw}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadw(SVMParser.LoadwContext ctx);

    /**
     * Visit a parse tree produced by the {@code label}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLabel(SVMParser.LabelContext ctx);

    /**
     * Visit a parse tree produced by the {@code branch}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBranch(SVMParser.BranchContext ctx);

    /**
     * Visit a parse tree produced by the {@code brancheq}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBrancheq(SVMParser.BrancheqContext ctx);

    /**
     * Visit a parse tree produced by the {@code branchgreater}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBranchgreater(SVMParser.BranchgreaterContext ctx);

    /**
     * Visit a parse tree produced by the {@code branchless}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBranchless(SVMParser.BranchlessContext ctx);

    /**
     * Visit a parse tree produced by the {@code branchgreatereq}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBranchgreatereq(SVMParser.BranchgreatereqContext ctx);

    /**
     * Visit a parse tree produced by the {@code branchlesseq}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBranchlesseq(SVMParser.BranchlesseqContext ctx);

    /**
     * Visit a parse tree produced by the {@code js}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJs(SVMParser.JsContext ctx);

    /**
     * Visit a parse tree produced by the {@code loadra}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadra(SVMParser.LoadraContext ctx);

    /**
     * Visit a parse tree produced by the {@code storera}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStorera(SVMParser.StoreraContext ctx);

    /**
     * Visit a parse tree produced by the {@code loadrv}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadrv(SVMParser.LoadrvContext ctx);

    /**
     * Visit a parse tree produced by the {@code storerv}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStorerv(SVMParser.StorervContext ctx);

    /**
     * Visit a parse tree produced by the {@code loadfp}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadfp(SVMParser.LoadfpContext ctx);

    /**
     * Visit a parse tree produced by the {@code storefp}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStorefp(SVMParser.StorefpContext ctx);

    /**
     * Visit a parse tree produced by the {@code copyfp}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCopyfp(SVMParser.CopyfpContext ctx);

    /**
     * Visit a parse tree produced by the {@code loadhp}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadhp(SVMParser.LoadhpContext ctx);

    /**
     * Visit a parse tree produced by the {@code storehp}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStorehp(SVMParser.StorehpContext ctx);

    /**
     * Visit a parse tree produced by the {@code print}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(SVMParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by the {@code halt}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHalt(SVMParser.HaltContext ctx);

    /**
     * Visit a parse tree produced by the {@code storew}
     * labeled alternative in {@link SVMParser#assembly}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStorew(SVMParser.StorewContext ctx);
}