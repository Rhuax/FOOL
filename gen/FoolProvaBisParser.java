// Generated from C:/Users/suri9/Documents/GitHub/FOOL\FoolProvaBis.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoolProvaBisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, ASM=5, PLUS=6, MINUS=7, TIMES=8, DIV=9, 
		TRUE=10, FALSE=11, LPAR=12, RPAR=13, CLPAR=14, CRPAR=15, IF=16, THEN=17, 
		ELSE=18, LET=19, IN=20, VAR=21, FUN=22, INT=23, BOOL=24, CLASS=25, IMPLEMENTS=26, 
		THIS=27, NEW=28, DOT=29, INTEGER=30, ID=31, WS=32, LINECOMENTS=33, BLOCKCOMENTS=34, 
		ERR=35;
	public static final int
		RULE_prog = 0, RULE_classdec = 1, RULE_let = 2, RULE_vardec = 3, RULE_varasm = 4, 
		RULE_fun = 5, RULE_dec = 6, RULE_type = 7, RULE_exp = 8, RULE_term = 9, 
		RULE_factor = 10, RULE_value = 11;
	public static final String[] ruleNames = {
		"prog", "classdec", "let", "vardec", "varasm", "fun", "dec", "type", "exp", 
		"term", "factor", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'=='", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'true'", "'false'", "'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", 
		"'let'", "'in'", "'var'", "'fun'", "'int'", "'bool'", "'class'", "'implements'", 
		"'this'", "'new'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMIC", "COLON", "COMMA", "EQ", "ASM", "PLUS", "MINUS", "TIMES", 
		"DIV", "TRUE", "FALSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", 
		"ELSE", "LET", "IN", "VAR", "FUN", "INT", "BOOL", "CLASS", "IMPLEMENTS", 
		"THIS", "NEW", "DOT", "INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
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
	public String getGrammarFileName() { return "FoolProvaBis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FoolProvaBisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassExpContext extends ProgContext {
		public List<TerminalNode> SEMIC() { return getTokens(FoolProvaBisParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FoolProvaBisParser.SEMIC, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ClassdecContext> classdec() {
			return getRuleContexts(ClassdecContext.class);
		}
		public ClassdecContext classdec(int i) {
			return getRuleContext(ClassdecContext.class,i);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ClassExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterClassExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitClassExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitClassExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetInExpContext extends ProgContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(FoolProvaBisParser.SEMIC, 0); }
		public LetInExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterLetInExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitLetInExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitLetInExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ProgContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleExpContext extends ProgContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(FoolProvaBisParser.SEMIC, 0); }
		public SingleExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterSingleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitSingleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitSingleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case TRUE:
			case FALSE:
			case LPAR:
			case IF:
			case THIS:
			case NEW:
			case INTEGER:
			case ID:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				exp();
				setState(25);
				match(SEMIC);
				}
				break;
			case LET:
				_localctx = new LetInExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				let();
				setState(28);
				exp();
				setState(29);
				match(SEMIC);
				}
				break;
			case CLASS:
				_localctx = new ClassExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					classdec();
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLASS );
				setState(36);
				match(SEMIC);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(37);
					let();
					}
				}

				setState(40);
				exp();
				setState(41);
				match(SEMIC);
				}
				break;
			case CLPAR:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(CLPAR);
				setState(44);
				exp();
				setState(45);
				match(CRPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassdecContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FoolProvaBisParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(FoolProvaBisParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FoolProvaBisParser.ID, i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(FoolProvaBisParser.IMPLEMENTS, 0); }
		public TerminalNode LPAR() { return getToken(FoolProvaBisParser.LPAR, 0); }
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FoolProvaBisParser.RPAR, 0); }
		public TerminalNode CLPAR() { return getToken(FoolProvaBisParser.CLPAR, 0); }
		public TerminalNode CRPAR() { return getToken(FoolProvaBisParser.CRPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FoolProvaBisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolProvaBisParser.COMMA, i);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FoolProvaBisParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FoolProvaBisParser.SEMIC, i);
		}
		public ClassdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterClassdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitClassdec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitClassdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdecContext classdec() throws RecognitionException {
		ClassdecContext _localctx = new ClassdecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(CLASS);
			setState(50);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(51);
				match(IMPLEMENTS);
				setState(52);
				match(ID);
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(55);
				match(LPAR);
				setState(56);
				vardec();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(57);
					match(COMMA);
					setState(58);
					vardec();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(RPAR);
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLPAR) {
				{
				setState(68);
				match(CLPAR);
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					fun();
					setState(70);
					match(SEMIC);
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0) );
				setState(76);
				match(CRPAR);
				}
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(FoolProvaBisParser.LET, 0); }
		public TerminalNode IN() { return getToken(FoolProvaBisParser.IN, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(FoolProvaBisParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(FoolProvaBisParser.SEMIC, i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(LET);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				dec();
				setState(82);
				match(SEMIC);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(88);
			match(IN);
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

	public static class VardecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type();
			setState(91);
			match(ID);
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

	public static class VarasmContext extends ParserRuleContext {
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode ASM() { return getToken(FoolProvaBisParser.ASM, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarasmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varasm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterVarasm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitVarasm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitVarasm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarasmContext varasm() throws RecognitionException {
		VarasmContext _localctx = new VarasmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varasm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			vardec();
			setState(94);
			match(ASM);
			setState(95);
			exp();
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

	public static class FunContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FoolProvaBisParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FoolProvaBisParser.RPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FoolProvaBisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolProvaBisParser.COMMA, i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
			match(ID);
			setState(99);
			match(LPAR);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(100);
				vardec();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(101);
					match(COMMA);
					setState(102);
					vardec();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(RPAR);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(111);
				let();
				}
			}

			setState(114);
			exp();
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

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends DecContext {
		public VarasmContext varasm() {
			return getRuleContext(VarasmContext.class,0);
		}
		public VarAssignmentContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunDeclarationContext extends DecContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FunDeclarationContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				varasm();
				}
				break;
			case 2:
				_localctx = new FunDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				fun();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FoolProvaBisParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(FoolProvaBisParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext left;
		public ExpContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FoolProvaBisParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FoolProvaBisParser.MINUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(122);
				match(MINUS);
				}
			}

			setState(125);
			((ExpContext)_localctx).left = term();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				((ExpContext)_localctx).right = exp();
				}
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext left;
		public TermContext right;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(FoolProvaBisParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(FoolProvaBisParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((TermContext)_localctx).left = factor();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES || _la==DIV) {
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				((TermContext)_localctx).right = term();
				}
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

	public static class FactorContext extends ParserRuleContext {
		public ValueContext left;
		public ValueContext right;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode EQ() { return getToken(FoolProvaBisParser.EQ, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((FactorContext)_localctx).left = value();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(136);
				match(EQ);
				setState(137);
				((FactorContext)_localctx).right = value();
				}
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseExpContext extends ValueContext {
		public TerminalNode LPAR() { return getToken(FoolProvaBisParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FoolProvaBisParser.RPAR, 0); }
		public BaseExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterBaseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitBaseExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public VarExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValContext extends ValueContext {
		public TerminalNode INTEGER() { return getToken(FoolProvaBisParser.INTEGER, 0); }
		public IntValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodExpContext extends ValueContext {
		public TerminalNode DOT() { return getToken(FoolProvaBisParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(FoolProvaBisParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FoolProvaBisParser.ID, i);
		}
		public TerminalNode THIS() { return getToken(FoolProvaBisParser.THIS, 0); }
		public TerminalNode LPAR() { return getToken(FoolProvaBisParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FoolProvaBisParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FoolProvaBisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolProvaBisParser.COMMA, i);
		}
		public MethodExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterMethodExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitMethodExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitMethodExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpContext extends ValueContext {
		public TerminalNode NEW() { return getToken(FoolProvaBisParser.NEW, 0); }
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FoolProvaBisParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FoolProvaBisParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FoolProvaBisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolProvaBisParser.COMMA, i);
		}
		public NewExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ValueContext {
		public ExpContext cond;
		public ExpContext thenBranch;
		public ExpContext elseBranch;
		public TerminalNode IF() { return getToken(FoolProvaBisParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FoolProvaBisParser.THEN, 0); }
		public List<TerminalNode> CLPAR() { return getTokens(FoolProvaBisParser.CLPAR); }
		public TerminalNode CLPAR(int i) {
			return getToken(FoolProvaBisParser.CLPAR, i);
		}
		public List<TerminalNode> CRPAR() { return getTokens(FoolProvaBisParser.CRPAR); }
		public TerminalNode CRPAR(int i) {
			return getToken(FoolProvaBisParser.CRPAR, i);
		}
		public TerminalNode ELSE() { return getToken(FoolProvaBisParser.ELSE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpContext extends ValueContext {
		public TerminalNode THIS() { return getToken(FoolProvaBisParser.THIS, 0); }
		public ThisExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterThisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitThisExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitThisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(FoolProvaBisParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FoolProvaBisParser.FALSE, 0); }
		public BoolValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FoolProvaBisParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FoolProvaBisParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FoolProvaBisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolProvaBisParser.COMMA, i);
		}
		public FunExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterFunExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitFunExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFunExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(LPAR);
				setState(143);
				exp();
				setState(144);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(IF);
				setState(147);
				((IfExpContext)_localctx).cond = exp();
				setState(148);
				match(THEN);
				setState(149);
				match(CLPAR);
				setState(150);
				((IfExpContext)_localctx).thenBranch = exp();
				setState(151);
				match(CRPAR);
				setState(152);
				match(ELSE);
				setState(153);
				match(CLPAR);
				setState(154);
				((IfExpContext)_localctx).elseBranch = exp();
				setState(155);
				match(CRPAR);
				}
				break;
			case 5:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(ID);
				}
				break;
			case 6:
				_localctx = new ThisExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(THIS);
				}
				break;
			case 7:
				_localctx = new FunExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(ID);
				{
				setState(160);
				match(LPAR);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(161);
					exp();
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(162);
						match(COMMA);
						setState(163);
						exp();
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(171);
				match(RPAR);
				}
				}
				break;
			case 8:
				_localctx = new MethodExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				match(DOT);
				setState(174);
				match(ID);
				{
				setState(175);
				match(LPAR);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(176);
					exp();
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(177);
						match(COMMA);
						setState(178);
						exp();
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(186);
				match(RPAR);
				}
				}
				break;
			case 9:
				_localctx = new NewExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				match(NEW);
				setState(188);
				match(ID);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(189);
					match(LPAR);
					setState(190);
					exp();
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(191);
						match(COMMA);
						setState(192);
						exp();
						}
						}
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(198);
					match(RPAR);
					}
				}

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2#\n\2\r\2\16\2"+
		"$\3\2\3\2\5\2)\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\3\3\3\3\3"+
		"\3\3\5\38\n\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\3\3\3\5\3E\n\3"+
		"\3\3\3\3\3\3\3\3\6\3K\n\3\r\3\16\3L\3\3\3\3\5\3Q\n\3\3\4\3\4\3\4\3\4\6"+
		"\4W\n\4\r\4\16\4X\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\5\7o\n\7\3\7\3\7\5\7s\n\7\3\7\3\7\3\b"+
		"\3\b\5\by\n\b\3\t\3\t\3\n\5\n~\n\n\3\n\3\n\3\n\5\n\u0083\n\n\3\13\3\13"+
		"\3\13\5\13\u0088\n\13\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00a7\n\r\f\r\16\r\u00aa\13\r\5\r\u00ac\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\5\r\u00bb\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3\r\3\r\5\r\u00cb"+
		"\n\r\5\r\u00cd\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\4\2\31"+
		"\32!!\3\2\b\t\3\2\n\13\3\2\f\r\4\2\35\35!!\u00e3\2\61\3\2\2\2\4\63\3\2"+
		"\2\2\6R\3\2\2\2\b\\\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16x\3\2\2\2\20z\3\2"+
		"\2\2\22}\3\2\2\2\24\u0084\3\2\2\2\26\u0089\3\2\2\2\30\u00cc\3\2\2\2\32"+
		"\33\5\22\n\2\33\34\7\3\2\2\34\62\3\2\2\2\35\36\5\6\4\2\36\37\5\22\n\2"+
		"\37 \7\3\2\2 \62\3\2\2\2!#\5\4\3\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3"+
		"\2\2\2%&\3\2\2\2&(\7\3\2\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*"+
		"+\5\22\n\2+,\7\3\2\2,\62\3\2\2\2-.\7\20\2\2./\5\22\n\2/\60\7\21\2\2\60"+
		"\62\3\2\2\2\61\32\3\2\2\2\61\35\3\2\2\2\61\"\3\2\2\2\61-\3\2\2\2\62\3"+
		"\3\2\2\2\63\64\7\33\2\2\64\67\7!\2\2\65\66\7\34\2\2\668\7!\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28D\3\2\2\29:\7\16\2\2:?\5\b\5\2;<\7\5\2\2<>\5\b\5\2"+
		"=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\17\2"+
		"\2CE\3\2\2\2D9\3\2\2\2DE\3\2\2\2EP\3\2\2\2FJ\7\20\2\2GH\5\f\7\2HI\7\3"+
		"\2\2IK\3\2\2\2JG\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\21"+
		"\2\2OQ\3\2\2\2PF\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RV\7\25\2\2ST\5\16\b\2TU"+
		"\7\3\2\2UW\3\2\2\2VS\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z"+
		"[\7\26\2\2[\7\3\2\2\2\\]\5\20\t\2]^\7!\2\2^\t\3\2\2\2_`\5\b\5\2`a\7\7"+
		"\2\2ab\5\22\n\2b\13\3\2\2\2cd\5\20\t\2de\7!\2\2en\7\16\2\2fk\5\b\5\2g"+
		"h\7\5\2\2hj\5\b\5\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2nf\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\17\2\2qs\5\6\4\2rq\3\2\2"+
		"\2rs\3\2\2\2st\3\2\2\2tu\5\22\n\2u\r\3\2\2\2vy\5\n\6\2wy\5\f\7\2xv\3\2"+
		"\2\2xw\3\2\2\2y\17\3\2\2\2z{\t\2\2\2{\21\3\2\2\2|~\7\t\2\2}|\3\2\2\2}"+
		"~\3\2\2\2~\177\3\2\2\2\177\u0082\5\24\13\2\u0080\u0081\t\3\2\2\u0081\u0083"+
		"\5\22\n\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084"+
		"\u0087\5\26\f\2\u0085\u0086\t\4\2\2\u0086\u0088\5\24\13\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u008c\5\30\r\2\u008a"+
		"\u008b\7\6\2\2\u008b\u008d\5\30\r\2\u008c\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\27\3\2\2\2\u008e\u00cd\7 \2\2\u008f\u00cd\t\5\2\2\u0090\u0091"+
		"\7\16\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\17\2\2\u0093\u00cd\3\2\2"+
		"\2\u0094\u0095\7\22\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\23\2\2\u0097"+
		"\u0098\7\20\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\21\2\2\u009a\u009b"+
		"\7\24\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\21\2"+
		"\2\u009e\u00cd\3\2\2\2\u009f\u00cd\7!\2\2\u00a0\u00cd\7\35\2\2\u00a1\u00a2"+
		"\7!\2\2\u00a2\u00ab\7\16\2\2\u00a3\u00a8\5\22\n\2\u00a4\u00a5\7\5\2\2"+
		"\u00a5\u00a7\5\22\n\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00cd\7\17"+
		"\2\2\u00ae\u00af\t\6\2\2\u00af\u00b0\7\37\2\2\u00b0\u00b1\7!\2\2\u00b1"+
		"\u00ba\7\16\2\2\u00b2\u00b7\5\22\n\2\u00b3\u00b4\7\5\2\2\u00b4\u00b6\5"+
		"\22\n\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b2\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00cd\7\17\2\2\u00bd"+
		"\u00be\7\36\2\2\u00be\u00ca\7!\2\2\u00bf\u00c0\7\16\2\2\u00c0\u00c5\5"+
		"\22\n\2\u00c1\u00c2\7\5\2\2\u00c2\u00c4\5\22\n\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00bf\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u008e\3\2"+
		"\2\2\u00cc\u008f\3\2\2\2\u00cc\u0090\3\2\2\2\u00cc\u0094\3\2\2\2\u00cc"+
		"\u009f\3\2\2\2\u00cc\u00a0\3\2\2\2\u00cc\u00a1\3\2\2\2\u00cc\u00ae\3\2"+
		"\2\2\u00cc\u00bd\3\2\2\2\u00cd\31\3\2\2\2\32$(\61\67?DLPXknrx}\u0082\u0087"+
		"\u008c\u00a8\u00ab\u00b7\u00ba\u00c5\u00ca\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}