// Generated from C:/Users/suri9/Documents/GitHub/FOOL/src/parser\FoolProvaBis.g4 by ANTLR 4.6
package parser;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitLetInExp(this);
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
			setState(45);
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
			setState(47);
			match(CLASS);
			setState(48);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(49);
				match(IMPLEMENTS);
				setState(50);
				match(ID);
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(53);
				match(LPAR);
				setState(54);
				vardec();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(55);
					match(COMMA);
					setState(56);
					vardec();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(RPAR);
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLPAR) {
				{
				setState(66);
				match(CLPAR);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					fun();
					setState(68);
					match(SEMIC);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0) );
				setState(74);
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
			setState(78);
			match(LET);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				dec();
				setState(80);
				match(SEMIC);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0) );
			setState(86);
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
			setState(88);
			type();
			setState(89);
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
			setState(91);
			vardec();
			setState(92);
			match(ASM);
			setState(93);
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
			setState(95);
			type();
			setState(96);
			match(ID);
			setState(97);
			match(LPAR);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(98);
				vardec();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					vardec();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
			match(RPAR);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(109);
				let();
				}
			}

			setState(112);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				varasm();
				}
				break;
			case 2:
				_localctx = new FunDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
			setState(118);
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
		public TermContext left;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(120);
				match(MINUS);
				}
			}

			setState(123);
			((ExpContext)_localctx).left = term();
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
		public OperatorContext op;
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
			setState(125);
			((TermContext)_localctx).left = factor();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << LESS) | (1L << GREATER) | (1L << LEQ) | (1L << GEQ) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(126);
				((TermContext)_localctx).op = operator();
				}
				setState(127);
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
			setState(131);
			((FactorContext)_localctx).left = value();
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(132);
				match(EQ);
				setState(133);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(FoolProvaBisParser.ID, 0); }
		public VarExpContext(ValueContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpContext extends ValueContext {
		public TerminalNode THIS() { return getToken(FoolProvaBisParser.THIS, 0); }
		public ThisExpContext(ValueContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FoolProvaBisVisitor ) return ((FoolProvaBisVisitor<? extends T>)visitor).visitFloatVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(FoolProvaBisParser.BOOLEAN, 0); }
		public BoolValContext(ValueContext ctx) { copyFrom(ctx); }
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new FloatValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(FLOATER);
				}
				break;
			case 4:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(LPAR);
				setState(140);
				exp();
				setState(141);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(IF);
				setState(144);
				((IfExpContext)_localctx).cond = exp();
				setState(145);
				match(THEN);
				setState(146);
				match(CLPAR);
				setState(147);
				((IfExpContext)_localctx).thenBranch = exp();
				setState(148);
				match(CRPAR);
				setState(149);
				match(ELSE);
				setState(150);
				match(CLPAR);
				setState(151);
				((IfExpContext)_localctx).elseBranch = exp();
				setState(152);
				match(CRPAR);
				}
				break;
			case 6:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ThisExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new FunExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(ID);
				{
				setState(157);
				match(LPAR);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << FLOATER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(158);
					exp();
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(159);
						match(COMMA);
						setState(160);
						exp();
						}
						}
						setState(165);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(168);
				match(RPAR);
				}
				}
				break;
			case 9:
				_localctx = new MethodExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				match(DOT);
				setState(171);
				match(ID);
				{
				setState(172);
				match(LPAR);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAR) | (1L << IF) | (1L << THIS) | (1L << NEW) | (1L << INTEGER) | (1L << FLOATER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(173);
					exp();
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(174);
						match(COMMA);
						setState(175);
						exp();
						}
						}
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(183);
				match(RPAR);
				}
				}
				break;
			case 10:
				_localctx = new NewExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				match(NEW);
				setState(185);
				match(ID);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(186);
					match(LPAR);
					setState(187);
					exp();
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(188);
						match(COMMA);
						setState(189);
						exp();
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195);
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
			setState(201);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2%\n\2"+
		"\r\2\16\2&\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\5\2\60\n\2\3\3\3\3\3\3\3\3\5\3"+
		"\66\n\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\5\3C\n\3\3\3\3"+
		"\3\3\3\3\3\6\3I\n\3\r\3\16\3J\3\3\3\3\5\3O\n\3\3\4\3\4\3\4\3\4\6\4U\n"+
		"\4\r\4\16\4V\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7h\n\7\f\7\16\7k\13\7\5\7m\n\7\3\7\3\7\5\7q\n\7\3\7\3\7\3\b\3\b\5"+
		"\bw\n\b\3\t\3\t\3\n\5\n|\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0084\n"+
		"\13\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a4"+
		"\n\r\f\r\16\r\u00a7\13\r\5\r\u00a9\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\5\r\u00b8\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3\r\3\r\5\r\u00c8\n\r\5\r\u00ca"+
		"\n\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\4\2 \""+
		"++\4\2%%++\4\2\6\6\b\22\u00e0\2/\3\2\2\2\4\61\3\2\2\2\6P\3\2\2\2\bZ\3"+
		"\2\2\2\n]\3\2\2\2\fa\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22{\3\2\2\2\24\177"+
		"\3\2\2\2\26\u0085\3\2\2\2\30\u00c9\3\2\2\2\32\u00cb\3\2\2\2\34\35\5\22"+
		"\n\2\35\36\7\3\2\2\36\60\3\2\2\2\37 \5\6\4\2 !\5\22\n\2!\"\7\3\2\2\"\60"+
		"\3\2\2\2#%\5\4\3\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2"+
		"(*\7\3\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\22\n\2-.\7\3\2"+
		"\2.\60\3\2\2\2/\34\3\2\2\2/\37\3\2\2\2/$\3\2\2\2\60\3\3\2\2\2\61\62\7"+
		"#\2\2\62\65\7+\2\2\63\64\7$\2\2\64\66\7+\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66B\3\2\2\2\678\7\25\2\28=\5\b\5\29:\7\5\2\2:<\5\b\5\2;9\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\26\2\2AC\3\2\2\2"+
		"B\67\3\2\2\2BC\3\2\2\2CN\3\2\2\2DH\7\27\2\2EF\5\f\7\2FG\7\3\2\2GI\3\2"+
		"\2\2HE\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\30\2\2MO\3"+
		"\2\2\2ND\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PT\7\34\2\2QR\5\16\b\2RS\7\3\2\2"+
		"SU\3\2\2\2TQ\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\35\2"+
		"\2Y\7\3\2\2\2Z[\5\20\t\2[\\\7+\2\2\\\t\3\2\2\2]^\5\b\5\2^_\7\7\2\2_`\5"+
		"\22\n\2`\13\3\2\2\2ab\5\20\t\2bc\7+\2\2cl\7\25\2\2di\5\b\5\2ef\7\5\2\2"+
		"fh\5\b\5\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"ld\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\26\2\2oq\5\6\4\2po\3\2\2\2pq\3\2\2"+
		"\2qr\3\2\2\2rs\5\22\n\2s\r\3\2\2\2tw\5\n\6\2uw\5\f\7\2vt\3\2\2\2vu\3\2"+
		"\2\2w\17\3\2\2\2xy\t\2\2\2y\21\3\2\2\2z|\7\t\2\2{z\3\2\2\2{|\3\2\2\2|"+
		"}\3\2\2\2}~\5\24\13\2~\23\3\2\2\2\177\u0083\5\26\f\2\u0080\u0081\5\32"+
		"\16\2\u0081\u0082\5\22\n\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0088\5\30\r\2\u0086\u0087\7\6\2"+
		"\2\u0087\u0089\5\30\r\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\27\3\2\2\2\u008a\u00ca\7(\2\2\u008b\u00ca\7*\2\2\u008c\u00ca\7)\2\2\u008d"+
		"\u008e\7\25\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\26\2\2\u0090\u00ca"+
		"\3\2\2\2\u0091\u0092\7\31\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\32\2"+
		"\2\u0094\u0095\7\27\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\30\2\2\u0097"+
		"\u0098\7\33\2\2\u0098\u0099\7\27\2\2\u0099\u009a\5\22\n\2\u009a\u009b"+
		"\7\30\2\2\u009b\u00ca\3\2\2\2\u009c\u00ca\7+\2\2\u009d\u00ca\7%\2\2\u009e"+
		"\u009f\7+\2\2\u009f\u00a8\7\25\2\2\u00a0\u00a5\5\22\n\2\u00a1\u00a2\7"+
		"\5\2\2\u00a2\u00a4\5\22\n\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ca\7\26\2\2\u00ab\u00ac\t\3\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00ae\7"+
		"+\2\2\u00ae\u00b7\7\25\2\2\u00af\u00b4\5\22\n\2\u00b0\u00b1\7\5\2\2\u00b1"+
		"\u00b3\5\22\n\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00af\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ca\7\26"+
		"\2\2\u00ba\u00bb\7&\2\2\u00bb\u00c7\7+\2\2\u00bc\u00bd\7\25\2\2\u00bd"+
		"\u00c2\5\22\n\2\u00be\u00bf\7\5\2\2\u00bf\u00c1\5\22\n\2\u00c0\u00be\3"+
		"\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c8\3"+
		"\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u008a\3\2\2\2\u00c9\u008b\3\2\2\2\u00c9\u008c\3\2\2\2\u00c9\u008d\3\2"+
		"\2\2\u00c9\u0091\3\2\2\2\u00c9\u009c\3\2\2\2\u00c9\u009d\3\2\2\2\u00c9"+
		"\u009e\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9\u00ba\3\2\2\2\u00ca\31\3\2\2"+
		"\2\u00cb\u00cc\t\4\2\2\u00cc\33\3\2\2\2\31&*/\65=BJNVilpv{\u0083\u0088"+
		"\u00a5\u00a8\u00b4\u00b7\u00c2\u00c7\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}