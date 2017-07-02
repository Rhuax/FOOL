package parser;

import astInterpreter.InterpreterNode;
import astInterpreter.*;



public class SVMVisitorImpl extends SVMBaseVisitor<InterpreterNode>
{
    public InterpreterNode visitPushNumber(SVMParser.PushNumberContext ctx)
    {
       return new PushNumberNode(Integer.parseInt(ctx.NUMBER().getText()));
    }

    public InterpreterNode visitPushLabel(SVMParser.PushLabelContext ctx)
    {
        return new PushLabelNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitPop(SVMParser.PopContext ctx)
    {
        return new PopNode();
    }

    public InterpreterNode visitAdd(SVMParser.AddContext ctx) { return new AddNode(); }

    public InterpreterNode visitSub(SVMParser.SubContext ctx) { return new SubNode(); }

    public InterpreterNode visitMult(SVMParser.MultContext ctx) { return new MultNode(); }

    public InterpreterNode visitDiv(SVMParser.DivContext ctx) { return new DivNode(); }

    public InterpreterNode visitLoadw(SVMParser.LoadwContext ctx) { return new LoadwNode(); }

    public InterpreterNode visitLabel(SVMParser.LabelContext ctx)
    {
        return new LabelColNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitBranch(SVMParser.BranchContext ctx)
    {
        return new BranchNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitBrancheq(SVMParser.BrancheqContext ctx)
    {
        return new BrancheqNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitBranchgreater(SVMParser.BranchgreaterContext ctx)
    {
        return new BranchgreaterNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitBranchless(SVMParser.BranchlessContext ctx)
    {
        return new BranchlessNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitBranchgreatereq(SVMParser.BranchgreatereqContext ctx)
    {
        return new BranchgreatereqNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitBranchlesseq(SVMParser.BranchlesseqContext ctx)
    {
        return new BranchlesseqNode(ctx.LABEL().getText());
    }

    public InterpreterNode visitJs(SVMParser.JsContext ctx)
    {
        return new JsNode();
    }

    public InterpreterNode visitLoadra(SVMParser.LoadraContext ctx) { return new LoadraNode(); }

    public InterpreterNode visitStorera(SVMParser.StoreraContext ctx) { return new StoreraNode(); }

    public InterpreterNode visitLoadrv(SVMParser.LoadrvContext ctx) { return new LoadrvNode(); }

    public InterpreterNode visitStorerv(SVMParser.StorervContext ctx) { return new StorervNode(); }

    public InterpreterNode visitLoadfp(SVMParser.LoadfpContext ctx) { return new LoadfpNode(); }

    public InterpreterNode visitStorefp(SVMParser.StorefpContext ctx) { return new StorefpNode(); }

    public InterpreterNode visitCopyfp(SVMParser.CopyfpContext ctx) { return new CopyfpNode(); }

    public InterpreterNode visitLoadhp(SVMParser.LoadhpContext ctx) { return new LoadhpNode(); }

    public InterpreterNode visitStorehp(SVMParser.StorehpContext ctx) { return new StorehpNode(); }
    public InterpreterNode visitStorew(SVMParser.StorewContext ctx) {
        return new StorewNode();
    }

    public InterpreterNode visitPrint(SVMParser.PrintContext ctx) { return new PrintNode(); }

    public InterpreterNode visitHalt(SVMParser.HaltContext ctx) { return new HaltNode(); }

    public InterpreterNode visitStartRule(SVMParser.StartRuleContext ctx)
    {
        for(SVMParser.AssemblyContext child: ctx.assembly())
        {
            InterpreterNode node = visit(child);

            node.code();
        }
        for(Integer refAdd: InstructionSet.labelRef.keySet()) {
            String s=InstructionSet.labelRef.get(refAdd);
            InstructionSet.code[refAdd] = InstructionSet.labelAdd.get(s);
        }
            InstructionSet.code[InstructionSet.ip++] = SVMParser.HALT;
        return null;
    }


}