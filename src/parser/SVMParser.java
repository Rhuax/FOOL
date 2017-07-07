// Generated from /home/crow/git/FOOL/src/parser/SVM.g4 by ANTLR 4.7
package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUSH=1, POP=2, ADD=3, SUB=4, MULT=5, DIV=6, STOREW=7, LOADW=8, BRANCH=9, 
		BRANCHEQ=10, BRANCHGREATER=11, BRANCHLESS=12, BRANCHGREATEREQ=13, BRANCHLESSEQ=14, 
		JS=15, LOADRA=16, STORERA=17, LOADRV=18, STORERV=19, LOADFP=20, STOREFP=21, 
		COPYFP=22, LOADHP=23, STOREHP=24, PRINT=25, HALT=26, COL=27, LABEL=28, 
		NUMBER=29, WHITESP=30, ERR=31;
	public static final int
		RULE_start = 0, RULE_assembly = 1;
	public static final String[] ruleNames = {
		"start", "assembly"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'push'", "'pop'", "'add'", "'sub'", "'mult'", "'div'", "'sw'", 
		"'lw'", "'b'", "'beq'", "'bg'", "'bl'", "'bgeq'", "'bleq'", "'js'", "'lra'", 
		"'sra'", "'lrv'", "'srv'", "'lfp'", "'sfp'", "'cfp'", "'lhp'", "'shp'", 
		"'print'", "'halt'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PUSH", "POP", "ADD", "SUB", "MULT", "DIV", "STOREW", "LOADW", "BRANCH", 
		"BRANCHEQ", "BRANCHGREATER", "BRANCHLESS", "BRANCHGREATEREQ", "BRANCHLESSEQ", 
		"JS", "LOADRA", "STORERA", "LOADRV", "STORERV", "LOADFP", "STOREFP", "COPYFP", 
		"LOADHP", "STOREHP", "PRINT", "HALT", "COL", "LABEL", "NUMBER", "WHITESP", 
		"ERR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SVM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SVMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartRuleContext extends StartContext {
		public List<AssemblyContext> assembly() {
			return getRuleContexts(AssemblyContext.class);
		}
		public AssemblyContext assembly(int i) {
			return getRuleContext(AssemblyContext.class,i);
		}
		public StartRuleContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new StartRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUSH) | (1L << POP) | (1L << ADD) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << STOREW) | (1L << LOADW) | (1L << BRANCH) | (1L << BRANCHEQ) | (1L << BRANCHGREATER) | (1L << BRANCHLESS) | (1L << BRANCHGREATEREQ) | (1L << BRANCHLESSEQ) | (1L << JS) | (1L << LOADRA) | (1L << STORERA) | (1L << LOADRV) | (1L << STORERV) | (1L << LOADFP) | (1L << STOREFP) | (1L << COPYFP) | (1L << LOADHP) | (1L << STOREHP) | (1L << PRINT) | (1L << HALT) | (1L << LABEL))) != 0)) {
				{
				{
				setState(4);
				assembly();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyContext extends ParserRuleContext {
		public AssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly; }
	 
		public AssemblyContext() { }
		public void copyFrom(AssemblyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadraContext extends AssemblyContext {
		public TerminalNode LOADRA() { return getToken(SVMParser.LOADRA, 0); }
		public LoadraContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterLoadra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitLoadra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitLoadra(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends AssemblyContext {
		public TerminalNode SUB() { return getToken(SVMParser.SUB, 0); }
		public SubContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends AssemblyContext {
		public TerminalNode MULT() { return getToken(SVMParser.MULT, 0); }
		public MultContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranchgreatereqContext extends AssemblyContext {
		public Token l;
		public TerminalNode BRANCHGREATEREQ() { return getToken(SVMParser.BRANCHGREATEREQ, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public BranchgreatereqContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterBranchgreatereq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitBranchgreatereq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitBranchgreatereq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranchlessContext extends AssemblyContext {
		public Token l;
		public TerminalNode BRANCHLESS() { return getToken(SVMParser.BRANCHLESS, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public BranchlessContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterBranchless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitBranchless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitBranchless(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JsContext extends AssemblyContext {
		public TerminalNode JS() { return getToken(SVMParser.JS, 0); }
		public JsContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterJs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitJs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitJs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranchgreaterContext extends AssemblyContext {
		public Token l;
		public TerminalNode BRANCHGREATER() { return getToken(SVMParser.BRANCHGREATER, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public BranchgreaterContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterBranchgreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitBranchgreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitBranchgreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranchContext extends AssemblyContext {
		public Token l;
		public TerminalNode BRANCH() { return getToken(SVMParser.BRANCH, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public BranchContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PopContext extends AssemblyContext {
		public TerminalNode POP() { return getToken(SVMParser.POP, 0); }
		public PopContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends AssemblyContext {
		public TerminalNode DIV() { return getToken(SVMParser.DIV, 0); }
		public DivContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StorervContext extends AssemblyContext {
		public TerminalNode STORERV() { return getToken(SVMParser.STORERV, 0); }
		public StorervContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterStorerv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitStorerv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitStorerv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PushNumberContext extends AssemblyContext {
		public Token n;
		public TerminalNode PUSH() { return getToken(SVMParser.PUSH, 0); }
		public TerminalNode NUMBER() { return getToken(SVMParser.NUMBER, 0); }
		public PushNumberContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterPushNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitPushNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitPushNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StorehpContext extends AssemblyContext {
		public TerminalNode STOREHP() { return getToken(SVMParser.STOREHP, 0); }
		public StorehpContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterStorehp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitStorehp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitStorehp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StorefpContext extends AssemblyContext {
		public TerminalNode STOREFP() { return getToken(SVMParser.STOREFP, 0); }
		public StorefpContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterStorefp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitStorefp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitStorefp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends AssemblyContext {
		public TerminalNode ADD() { return getToken(SVMParser.ADD, 0); }
		public AddContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StoreraContext extends AssemblyContext {
		public TerminalNode STORERA() { return getToken(SVMParser.STORERA, 0); }
		public StoreraContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterStorera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitStorera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitStorera(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PushLabelContext extends AssemblyContext {
		public Token l;
		public TerminalNode PUSH() { return getToken(SVMParser.PUSH, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public PushLabelContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterPushLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitPushLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitPushLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StorewContext extends AssemblyContext {
		public TerminalNode STOREW() { return getToken(SVMParser.STOREW, 0); }
		public StorewContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterStorew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitStorew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitStorew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadfpContext extends AssemblyContext {
		public TerminalNode LOADFP() { return getToken(SVMParser.LOADFP, 0); }
		public LoadfpContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterLoadfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitLoadfp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitLoadfp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranchlesseqContext extends AssemblyContext {
		public Token l;
		public TerminalNode BRANCHLESSEQ() { return getToken(SVMParser.BRANCHLESSEQ, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public BranchlesseqContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterBranchlesseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitBranchlesseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitBranchlesseq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelContext extends AssemblyContext {
		public Token l;
		public TerminalNode COL() { return getToken(SVMParser.COL, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public LabelContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HaltContext extends AssemblyContext {
		public TerminalNode HALT() { return getToken(SVMParser.HALT, 0); }
		public HaltContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterHalt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitHalt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitHalt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BrancheqContext extends AssemblyContext {
		public Token l;
		public TerminalNode BRANCHEQ() { return getToken(SVMParser.BRANCHEQ, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public BrancheqContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterBrancheq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitBrancheq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitBrancheq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends AssemblyContext {
		public TerminalNode PRINT() { return getToken(SVMParser.PRINT, 0); }
		public PrintContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadwContext extends AssemblyContext {
		public TerminalNode LOADW() { return getToken(SVMParser.LOADW, 0); }
		public LoadwContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterLoadw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitLoadw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitLoadw(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadhpContext extends AssemblyContext {
		public TerminalNode LOADHP() { return getToken(SVMParser.LOADHP, 0); }
		public LoadhpContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterLoadhp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitLoadhp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitLoadhp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadrvContext extends AssemblyContext {
		public TerminalNode LOADRV() { return getToken(SVMParser.LOADRV, 0); }
		public LoadrvContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterLoadrv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitLoadrv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitLoadrv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CopyfpContext extends AssemblyContext {
		public TerminalNode COPYFP() { return getToken(SVMParser.COPYFP, 0); }
		public CopyfpContext(AssemblyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).enterCopyfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVMListener ) ((SVMListener)listener).exitCopyfp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitCopyfp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyContext assembly() throws RecognitionException {
		AssemblyContext _localctx = new AssemblyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assembly);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PushNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(PUSH);
				setState(11);
				((PushNumberContext)_localctx).n = match(NUMBER);
				}
				break;
			case 2:
				_localctx = new PushLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(PUSH);
				setState(13);
				((PushLabelContext)_localctx).l = match(LABEL);
				}
				break;
			case 3:
				_localctx = new PopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(POP);
				}
				break;
			case 4:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				match(ADD);
				}
				break;
			case 5:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(16);
				match(SUB);
				}
				break;
			case 6:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				match(MULT);
				}
				break;
			case 7:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(18);
				match(DIV);
				}
				break;
			case 8:
				_localctx = new LoadwContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(19);
				match(LOADW);
				}
				break;
			case 9:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(20);
				((LabelContext)_localctx).l = match(LABEL);
				setState(21);
				match(COL);
				}
				break;
			case 10:
				_localctx = new BranchContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(22);
				match(BRANCH);
				setState(23);
				((BranchContext)_localctx).l = match(LABEL);
				}
				break;
			case 11:
				_localctx = new BrancheqContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(24);
				match(BRANCHEQ);
				setState(25);
				((BrancheqContext)_localctx).l = match(LABEL);
				}
				break;
			case 12:
				_localctx = new BranchgreaterContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(26);
				match(BRANCHGREATER);
				setState(27);
				((BranchgreaterContext)_localctx).l = match(LABEL);
				}
				break;
			case 13:
				_localctx = new BranchlessContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(28);
				match(BRANCHLESS);
				setState(29);
				((BranchlessContext)_localctx).l = match(LABEL);
				}
				break;
			case 14:
				_localctx = new BranchgreatereqContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(30);
				match(BRANCHGREATEREQ);
				setState(31);
				((BranchgreatereqContext)_localctx).l = match(LABEL);
				}
				break;
			case 15:
				_localctx = new BranchlesseqContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(32);
				match(BRANCHLESSEQ);
				setState(33);
				((BranchlesseqContext)_localctx).l = match(LABEL);
				}
				break;
			case 16:
				_localctx = new JsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(34);
				match(JS);
				}
				break;
			case 17:
				_localctx = new LoadraContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(35);
				match(LOADRA);
				}
				break;
			case 18:
				_localctx = new StoreraContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(36);
				match(STORERA);
				}
				break;
			case 19:
				_localctx = new LoadrvContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(37);
				match(LOADRV);
				}
				break;
			case 20:
				_localctx = new StorervContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(38);
				match(STORERV);
				}
				break;
			case 21:
				_localctx = new LoadfpContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(39);
				match(LOADFP);
				}
				break;
			case 22:
				_localctx = new StorefpContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(40);
				match(STOREFP);
				}
				break;
			case 23:
				_localctx = new CopyfpContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(41);
				match(COPYFP);
				}
				break;
			case 24:
				_localctx = new LoadhpContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(42);
				match(LOADHP);
				}
				break;
			case 25:
				_localctx = new StorehpContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(43);
				match(STOREHP);
				}
				break;
			case 26:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(44);
				match(PRINT);
				}
				break;
			case 27:
				_localctx = new HaltContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(45);
				match(HALT);
				}
				break;
			case 28:
				_localctx = new StorewContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(46);
				match(STOREW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\64\4\2\t\2\4\3\t"+
		"\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\2\2\4\2\4\2"+
		"\2\2M\2\t\3\2\2\2\4\61\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t"+
		"\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13\t\3\2\2\2\f\r\7\3\2\2\r\62\7\37"+
		"\2\2\16\17\7\3\2\2\17\62\7\36\2\2\20\62\7\4\2\2\21\62\7\5\2\2\22\62\7"+
		"\6\2\2\23\62\7\7\2\2\24\62\7\b\2\2\25\62\7\n\2\2\26\27\7\36\2\2\27\62"+
		"\7\35\2\2\30\31\7\13\2\2\31\62\7\36\2\2\32\33\7\f\2\2\33\62\7\36\2\2\34"+
		"\35\7\r\2\2\35\62\7\36\2\2\36\37\7\16\2\2\37\62\7\36\2\2 !\7\17\2\2!\62"+
		"\7\36\2\2\"#\7\20\2\2#\62\7\36\2\2$\62\7\21\2\2%\62\7\22\2\2&\62\7\23"+
		"\2\2\'\62\7\24\2\2(\62\7\25\2\2)\62\7\26\2\2*\62\7\27\2\2+\62\7\30\2\2"+
		",\62\7\31\2\2-\62\7\32\2\2.\62\7\33\2\2/\62\7\34\2\2\60\62\7\t\2\2\61"+
		"\f\3\2\2\2\61\16\3\2\2\2\61\20\3\2\2\2\61\21\3\2\2\2\61\22\3\2\2\2\61"+
		"\23\3\2\2\2\61\24\3\2\2\2\61\25\3\2\2\2\61\26\3\2\2\2\61\30\3\2\2\2\61"+
		"\32\3\2\2\2\61\34\3\2\2\2\61\36\3\2\2\2\61 \3\2\2\2\61\"\3\2\2\2\61$\3"+
		"\2\2\2\61%\3\2\2\2\61&\3\2\2\2\61\'\3\2\2\2\61(\3\2\2\2\61)\3\2\2\2\61"+
		"*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2"+
		"\61\60\3\2\2\2\62\5\3\2\2\2\4\t\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}