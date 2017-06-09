// Generated from C:/Users/suri9/Documents/GitHub/FOOL/src\FoolProvaBis.g4 by ANTLR 4.6
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
		LESS=10, GREATER=11, LEQ=12, GEQ=13, AND=14, OR=15, NOT=16, TRUE=17, FALSE=18, 
		LPAR=19, RPAR=20, CLPAR=21, CRPAR=22, IF=23, THEN=24, ELSE=25, LET=26, 
		IN=27, VAR=28, FUN=29, INT=30, BOOL=31, FLOAT=32, CLASS=33, IMPLEMENTS=34, 
		THIS=35, NEW=36, DOT=37, INTEGER=38, FLOATER=39, BOOLEAN=40, ID=41, WS=42, 
		LINECOMENTS=43, BLOCKCOMENTS=44, ERR=45;
	public static final int
		RULE_prog = 0, RULE_classdec = 1, RULE_let = 2, RULE_vardec = 3, RULE_varasm = 4, 
		RULE_fun = 5, RULE_dec = 6, RULE_type = 7, RULE_exp = 8, RULE_term = 9, 
		RULE_factor = 10, RULE_value = 11, RULE_operator = 12;
	public static final String[] ruleNames = {
		"prog", "classdec", "let", "vardec", "varasm", "fun", "dec", "type", "exp", 
		"term", "factor", "value", "operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'=='", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'not'", "'true'", "'false'", 
		"'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", "'let'", "'in'", 
		"'var'", "'fun'", "'int'", "'bool'", "'float'", "'class'", "'implements'", 
		"'this'", "'new'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMIC", "COLON", "COMMA", "EQ", "ASM", "PLUS", "MINUS", "TIMES", 
		"DIV", "LESS", "GREATER", "LEQ", "GEQ", "AND", "OR", "NOT", "TRUE", "FALSE", 
		"LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "LET", "IN", "VAR", 
		"FUN", "INT", "BOOL", "FLOAT", "CLASS", "IMPLEMENTS", "THIS", "NEW", "DOT", 
		"INTEGER", "FLOATER", "BOOLEAN", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LPAR:
			case IF:
			case THIS:
			case NEW:
			case INTEGER:
			case FLOATER:
			case BOOLEAN:
			case ID:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				exp();
				setState(27);
				match(SEMIC);
				}
				break;
			case LET:
				_localctx = new LetInExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				let();
				setState(30);
				exp();
				setState(31);
				match(SEMIC);
				}
				break;
			case CLASS:
				_localctx = new ClassExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					classdec();
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLASS );
				setState(38);
				match(SEMIC);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(39);
					let();
					}
				}

				setState(42);
				exp();
				setState(43);
				match(SEMIC);
				}
				break;
			case CLPAR:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(CLPAR);
				setState(46);
				exp();
				setState(47);
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
			setState(51);
			match(CLASS);
			setState(52);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(53);
				match(IMPLEMENTS);
				setState(54);
				match(ID);
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(57);
				match(LPAR);
				setState(58);
				vardec();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(59);
					match(COMMA);
					setState(60);
					vardec();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(RPAR);
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLPAR) {
				{
				setState(70);
				match(CLPAR);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71);
					fun();
					setState(72);
					match(SEMIC);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0) );
				setState(78);
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
			setState(82);
			match(LET);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				dec();
				setState(84);
				match(SEMIC);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0) );
			setState(90);
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
			setState(92);
			type();
			setState(93);
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
			setState(95);
			vardec();
			setState(96);
			match(ASM);
			setState(97);
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
			setState(99);
			type();
			setState(100);
			match(ID);
			setState(101);
			match(LPAR);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(102);
				vardec();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(103);
					match(COMMA);
					setState(104);
					vardec();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(112);
			match(RPAR);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(113);
				let();
				}
			}

			setState(116);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				varasm();
				}
				break;
			case 2:
				_localctx = new FunDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
		public TerminalNode FLOAT() { return getToken(FoolProvaBisParser.FLOAT, 0); }
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
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(124);
				match(MINUS);
				}
			}

			setState(127);
			term();
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
		public ExpContext right;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
			setState(129);
			((TermContext)_localctx).left = factor();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << LESS) | (1L << GREATER) | (1L << LEQ) | (1L << GEQ) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(130);
				operator();
				}
				setState(131);
				((TermContext)_localctx).right = exp();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((FactorContext)_localctx).left = value();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(136);
				match(EQ);
				setState(137);
				((FactorContext)_localctx).right = value();
				}
				break;
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
	public static class FloatValContext extends ValueContext {
		public TerminalNode FLOATER() { return getToken(FoolProvaBisParser.FLOATER, 0); }
		public FloatValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterFloatVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitFloatVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFloatVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(FoolProvaBisParser.BOOLEAN, 0); }
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new FloatValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(FLOATER);
				}
				break;
			case 4:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LPAR);
				setState(144);
				exp();
				setState(145);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(IF);
				setState(148);
				((IfExpContext)_localctx).cond = exp();
				setState(149);
				match(THEN);
				setState(150);
				match(CLPAR);
				setState(151);
				((IfExpContext)_localctx).thenBranch = exp();
				setState(152);
				match(CRPAR);
				setState(153);
				match(ELSE);
				setState(154);
				match(CLPAR);
				setState(155);
				((IfExpContext)_localctx).elseBranch = exp();
				setState(156);
				match(CRPAR);
				}
				break;
			case 6:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ThisExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new FunExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				match(ID);
				{
				setState(161);
				match(LPAR);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << FLOATER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(162);
					exp();
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(163);
						match(COMMA);
						setState(164);
						exp();
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(172);
				match(RPAR);
				}
				}
				break;
			case 9:
				_localctx = new MethodExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				match(DOT);
				setState(175);
				match(ID);
				{
				setState(176);
				match(LPAR);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << FLOATER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(177);
					exp();
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(178);
						match(COMMA);
						setState(179);
						exp();
						}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(187);
				match(RPAR);
				}
				}
				break;
			case 10:
				_localctx = new NewExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				match(NEW);
				setState(189);
				match(ID);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(190);
					match(LPAR);
					setState(191);
					exp();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(192);
						match(COMMA);
						setState(193);
						exp();
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(199);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(FoolProvaBisParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(FoolProvaBisParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FoolProvaBisParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(FoolProvaBisParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(FoolProvaBisParser.DIV, 0); }
		public TerminalNode LESS() { return getToken(FoolProvaBisParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(FoolProvaBisParser.GREATER, 0); }
		public TerminalNode LEQ() { return getToken(FoolProvaBisParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(FoolProvaBisParser.GEQ, 0); }
		public TerminalNode AND() { return getToken(FoolProvaBisParser.AND, 0); }
		public TerminalNode OR() { return getToken(FoolProvaBisParser.OR, 0); }
		public TerminalNode NOT() { return getToken(FoolProvaBisParser.NOT, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolProvaBisListener ) ((FoolProvaBisListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << LESS) | (1L << GREATER) | (1L << LEQ) | (1L << GEQ) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2%\n\2"+
		"\r\2\16\2&\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\64\n\2\3\3"+
		"\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16\3C\13\3\3\3\3\3"+
		"\5\3G\n\3\3\3\3\3\3\3\3\3\6\3M\n\3\r\3\16\3N\3\3\3\3\5\3S\n\3\3\4\3\4"+
		"\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\5\7q\n\7\3\7\3\7\5\7u\n\7\3"+
		"\7\3\7\3\b\3\b\5\b{\n\b\3\t\3\t\3\n\5\n\u0080\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\5\r\u00ad\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00b7\n\r\f\r\16\r\u00ba\13\r\5\r\u00bc\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c5\n\r\f\r\16\r\u00c8\13\r\3\r\3\r\5"+
		"\r\u00cc\n\r\5\r\u00ce\n\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\5\4\2 \"++\4\2%%++\4\2\6\6\b\22\u00e5\2\63\3\2\2\2\4\65"+
		"\3\2\2\2\6T\3\2\2\2\b^\3\2\2\2\na\3\2\2\2\fe\3\2\2\2\16z\3\2\2\2\20|\3"+
		"\2\2\2\22\177\3\2\2\2\24\u0083\3\2\2\2\26\u0089\3\2\2\2\30\u00cd\3\2\2"+
		"\2\32\u00cf\3\2\2\2\34\35\5\22\n\2\35\36\7\3\2\2\36\64\3\2\2\2\37 \5\6"+
		"\4\2 !\5\22\n\2!\"\7\3\2\2\"\64\3\2\2\2#%\5\4\3\2$#\3\2\2\2%&\3\2\2\2"+
		"&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2(*\7\3\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2"+
		"\2+,\3\2\2\2,-\5\22\n\2-.\7\3\2\2.\64\3\2\2\2/\60\7\27\2\2\60\61\5\22"+
		"\n\2\61\62\7\30\2\2\62\64\3\2\2\2\63\34\3\2\2\2\63\37\3\2\2\2\63$\3\2"+
		"\2\2\63/\3\2\2\2\64\3\3\2\2\2\65\66\7#\2\2\669\7+\2\2\678\7$\2\28:\7+"+
		"\2\29\67\3\2\2\29:\3\2\2\2:F\3\2\2\2;<\7\25\2\2<A\5\b\5\2=>\7\5\2\2>@"+
		"\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2D"+
		"E\7\26\2\2EG\3\2\2\2F;\3\2\2\2FG\3\2\2\2GR\3\2\2\2HL\7\27\2\2IJ\5\f\7"+
		"\2JK\7\3\2\2KM\3\2\2\2LI\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\7\30\2\2QS\3\2\2\2RH\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TX\7\34\2\2UV\5"+
		"\16\b\2VW\7\3\2\2WY\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\"+
		"\3\2\2\2\\]\7\35\2\2]\7\3\2\2\2^_\5\20\t\2_`\7+\2\2`\t\3\2\2\2ab\5\b\5"+
		"\2bc\7\7\2\2cd\5\22\n\2d\13\3\2\2\2ef\5\20\t\2fg\7+\2\2gp\7\25\2\2hm\5"+
		"\b\5\2ij\7\5\2\2jl\5\b\5\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3"+
		"\2\2\2om\3\2\2\2ph\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7\26\2\2su\5\6\4\2ts"+
		"\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\22\n\2w\r\3\2\2\2x{\5\n\6\2y{\5\f\7\2"+
		"zx\3\2\2\2zy\3\2\2\2{\17\3\2\2\2|}\t\2\2\2}\21\3\2\2\2~\u0080\7\t\2\2"+
		"\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5\24\13"+
		"\2\u0082\23\3\2\2\2\u0083\u0087\5\26\f\2\u0084\u0085\5\32\16\2\u0085\u0086"+
		"\5\22\n\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\25\3\2\2\2\u0089\u008c\5\30\r\2\u008a\u008b\7\6\2\2\u008b\u008d"+
		"\5\30\r\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e"+
		"\u00ce\7(\2\2\u008f\u00ce\7*\2\2\u0090\u00ce\7)\2\2\u0091\u0092\7\25\2"+
		"\2\u0092\u0093\5\22\n\2\u0093\u0094\7\26\2\2\u0094\u00ce\3\2\2\2\u0095"+
		"\u0096\7\31\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7\32\2\2\u0098\u0099"+
		"\7\27\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\30\2\2\u009b\u009c\7\33\2"+
		"\2\u009c\u009d\7\27\2\2\u009d\u009e\5\22\n\2\u009e\u009f\7\30\2\2\u009f"+
		"\u00ce\3\2\2\2\u00a0\u00ce\7+\2\2\u00a1\u00ce\7%\2\2\u00a2\u00a3\7+\2"+
		"\2\u00a3\u00ac\7\25\2\2\u00a4\u00a9\5\22\n\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00a8\5\22\n\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ce\7\26"+
		"\2\2\u00af\u00b0\t\3\2\2\u00b0\u00b1\7\'\2\2\u00b1\u00b2\7+\2\2\u00b2"+
		"\u00bb\7\25\2\2\u00b3\u00b8\5\22\n\2\u00b4\u00b5\7\5\2\2\u00b5\u00b7\5"+
		"\22\n\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b3\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00ce\7\26\2\2\u00be"+
		"\u00bf\7&\2\2\u00bf\u00cb\7+\2\2\u00c0\u00c1\7\25\2\2\u00c1\u00c6\5\22"+
		"\n\2\u00c2\u00c3\7\5\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c0\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u008e\3\2"+
		"\2\2\u00cd\u008f\3\2\2\2\u00cd\u0090\3\2\2\2\u00cd\u0091\3\2\2\2\u00cd"+
		"\u0095\3\2\2\2\u00cd\u00a0\3\2\2\2\u00cd\u00a1\3\2\2\2\u00cd\u00a2\3\2"+
		"\2\2\u00cd\u00af\3\2\2\2\u00cd\u00be\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d0"+
		"\t\4\2\2\u00d0\33\3\2\2\2\31&*\639AFNRZmptz\177\u0087\u008c\u00a9\u00ac"+
		"\u00b8\u00bb\u00c6\u00cb\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}