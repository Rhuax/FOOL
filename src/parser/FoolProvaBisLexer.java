// Generated from /home/crow/git/FOOL/src/parser/FoolProvaBis.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoolProvaBisLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, ASM=5, PLUS=6, MINUS=7, TIMES=8, DIV=9, 
		LESS=10, GREATER=11, LEQ=12, GEQ=13, AND=14, OR=15, NOT=16, TRUE=17, FALSE=18, 
		LPAR=19, RPAR=20, CLPAR=21, CRPAR=22, IF=23, THEN=24, ELSE=25, LET=26, 
		IN=27, VAR=28, FUN=29, INT=30, BOOL=31, FLOAT=32, CLASS=33, IMPLEMENTS=34, 
		THIS=35, NEW=36, DOT=37, INTEGER=38, FLOATER=39, ID=40, WS=41, LINECOMENTS=42, 
		BLOCKCOMENTS=43, ERR=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMIC", "COLON", "COMMA", "EQ", "ASM", "PLUS", "MINUS", "TIMES", "DIV", 
		"LESS", "GREATER", "LEQ", "GEQ", "AND", "OR", "NOT", "TRUE", "FALSE", 
		"LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "LET", "IN", "VAR", 
		"FUN", "INT", "BOOL", "FLOAT", "CLASS", "IMPLEMENTS", "THIS", "NEW", "DOT", 
		"DIGIT", "INTEGER", "FLOATER", "CHAR", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
		"ERR"
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
		"INTEGER", "FLOATER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", "ERR"
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


	   //there is a much better way to do this, check the ANTLR guide
	   //I will leave it like this for now just becasue it is quick
	   //but it doesn't work well
	   public int lexicalErrors=0;


	public FoolProvaBisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FoolProvaBis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Invalid char: "+ getText()); lexicalErrors++; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3(\6(\u00e4\n(\r(\16(\u00e5\3)\6)\u00e9\n)\r)\16"+
		")\u00ea\3)\3)\6)\u00ef\n)\r)\16)\u00f0\3*\3*\3+\3+\3+\7+\u00f8\n+\f+\16"+
		"+\u00fb\13+\3,\3,\3,\3,\3-\3-\3-\3-\7-\u0105\n-\f-\16-\u0108\13-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0115\n.\f.\16.\u0118\13.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O(Q)S\2U*W+Y,[-].\3\2\b"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61"+
		"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2"+
		"\2\2\te\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21n\3\2\2\2\23p\3\2"+
		"\2\2\25r\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33y\3\2\2\2\35|\3\2\2\2\37\177"+
		"\3\2\2\2!\u0082\3\2\2\2#\u0086\3\2\2\2%\u008b\3\2\2\2\'\u0091\3\2\2\2"+
		")\u0093\3\2\2\2+\u0095\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61\u009c"+
		"\3\2\2\2\63\u00a1\3\2\2\2\65\u00a6\3\2\2\2\67\u00aa\3\2\2\29\u00ad\3\2"+
		"\2\2;\u00b1\3\2\2\2=\u00b5\3\2\2\2?\u00b9\3\2\2\2A\u00be\3\2\2\2C\u00c4"+
		"\3\2\2\2E\u00ca\3\2\2\2G\u00d5\3\2\2\2I\u00da\3\2\2\2K\u00de\3\2\2\2M"+
		"\u00e0\3\2\2\2O\u00e3\3\2\2\2Q\u00e8\3\2\2\2S\u00f2\3\2\2\2U\u00f4\3\2"+
		"\2\2W\u00fc\3\2\2\2Y\u0100\3\2\2\2[\u010b\3\2\2\2]\u011e\3\2\2\2_`\7="+
		"\2\2`\4\3\2\2\2ab\7<\2\2b\6\3\2\2\2cd\7.\2\2d\b\3\2\2\2ef\7?\2\2fg\7?"+
		"\2\2g\n\3\2\2\2hi\7?\2\2i\f\3\2\2\2jk\7-\2\2k\16\3\2\2\2lm\7/\2\2m\20"+
		"\3\2\2\2no\7,\2\2o\22\3\2\2\2pq\7\61\2\2q\24\3\2\2\2rs\7>\2\2s\26\3\2"+
		"\2\2tu\7@\2\2u\30\3\2\2\2vw\7>\2\2wx\7?\2\2x\32\3\2\2\2yz\7@\2\2z{\7?"+
		"\2\2{\34\3\2\2\2|}\7(\2\2}~\7(\2\2~\36\3\2\2\2\177\u0080\7~\2\2\u0080"+
		"\u0081\7~\2\2\u0081 \3\2\2\2\u0082\u0083\7p\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7v\2\2\u0085\"\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7w\2\2\u0089\u008a\7g\2\2\u008a$\3\2\2\2\u008b\u008c\7h\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2"+
		"\u0090&\3\2\2\2\u0091\u0092\7*\2\2\u0092(\3\2\2\2\u0093\u0094\7+\2\2\u0094"+
		"*\3\2\2\2\u0095\u0096\7}\2\2\u0096,\3\2\2\2\u0097\u0098\7\177\2\2\u0098"+
		".\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b\60\3\2\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\62\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7"+
		"u\2\2\u00a4\u00a5\7g\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4<\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7n\2\2\u00bd@\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"B\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00c9\7u\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7o\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf\u00d0\7o\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7v\2\2\u00d3\u00d4\7u\2\2\u00d4F\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7u\2\2\u00d9H\3\2\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7y\2\2\u00ddJ\3\2\2\2\u00de\u00df"+
		"\7\60\2\2\u00dfL\3\2\2\2\u00e0\u00e1\4\62;\2\u00e1N\3\2\2\2\u00e2\u00e4"+
		"\5M\'\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6P\3\2\2\2\u00e7\u00e9\5M\'\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00ef\5M\'\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1R\3\2\2\2"+
		"\u00f2\u00f3\t\2\2\2\u00f3T\3\2\2\2\u00f4\u00f9\5S*\2\u00f5\u00f8\5S*"+
		"\2\u00f6\u00f8\5M\'\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faV\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\t\3\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b,"+
		"\2\2\u00ffX\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7\61\2\2\u0102\u0106"+
		"\3\2\2\2\u0103\u0105\n\4\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u010a\b-\2\2\u010aZ\3\2\2\2\u010b\u010c\7\61\2\2\u010c\u010d"+
		"\7,\2\2\u010d\u0116\3\2\2\2\u010e\u0115\n\5\2\2\u010f\u0110\7\61\2\2\u0110"+
		"\u0115\n\6\2\2\u0111\u0112\7,\2\2\u0112\u0115\n\7\2\2\u0113\u0115\5[."+
		"\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7,\2\2\u011a\u011b\7\61"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b.\2\2\u011d\\\3\2\2\2\u011e\u011f"+
		"\13\2\2\2\u011f\u0120\b/\3\2\u0120\u0121\3\2\2\2\u0121\u0122\b/\4\2\u0122"+
		"^\3\2\2\2\13\2\u00e5\u00ea\u00f0\u00f7\u00f9\u0106\u0114\u0116\5\b\2\2"+
		"\3/\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}