// Generated from /home/crow/git/FOOL/src/parser/SVM.g4 by ANTLR 4.7
package parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVMLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            PUSH = 1, POP = 2, ADD = 3, SUB = 4, MULT = 5, DIV = 6, STOREW = 7, LOADW = 8, BRANCH = 9,
            BRANCHEQ = 10, BRANCHGREATER = 11, BRANCHLESS = 12, BRANCHGREATEREQ = 13, BRANCHLESSEQ = 14,
            JS = 15, LOADRA = 16, STORERA = 17, LOADRV = 18, STORERV = 19, LOADFP = 20, STOREFP = 21,
            COPYFP = 22, LOADHP = 23, STOREHP = 24, PRINT = 25, HALT = 26, COL = 27, LABEL = 28,
            NUMBER = 29, WHITESP = 30, ERR = 31;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "PUSH", "POP", "ADD", "SUB", "MULT", "DIV", "STOREW", "LOADW", "BRANCH",
            "BRANCHEQ", "BRANCHGREATER", "BRANCHLESS", "BRANCHGREATEREQ", "BRANCHLESSEQ",
            "JS", "LOADRA", "STORERA", "LOADRV", "STORERV", "LOADFP", "STOREFP", "COPYFP",
            "LOADHP", "STOREHP", "PRINT", "HALT", "COL", "LABEL", "NUMBER", "WHITESP",
            "ERR"
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


    public int lexicalErrors = 0;


    public SVMLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "SVM.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 30:
                ERR_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }

    private void ERR_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0:
                System.err.println("Invalid char: " + getText());
                lexicalErrors++;
                break;
        }
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00cb\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2" +
                    "\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3" +
                    "\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3" +
                    "\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3" +
                    "\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3" +
                    "\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3" +
                    "\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3" +
                    "\35\3\35\7\35\u00ae\n\35\f\35\16\35\u00b1\13\35\3\36\3\36\5\36\u00b5\n" +
                    "\36\3\36\3\36\7\36\u00b9\n\36\f\36\16\36\u00bc\13\36\5\36\u00be\n\36\3" +
                    "\37\6\37\u00c1\n\37\r\37\16\37\u00c2\3\37\3\37\3 \3 \3 \3 \3 \2\2!\3\3" +
                    "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21" +
                    "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!" +
                    "\3\2\5\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00cf\2\3\3\2\2\2\2" +
                    "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2" +
                    "\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2" +
                    "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2" +
                    "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2" +
                    "\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2" +
                    "\2\2?\3\2\2\2\3A\3\2\2\2\5F\3\2\2\2\7J\3\2\2\2\tN\3\2\2\2\13R\3\2\2\2" +
                    "\rW\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27g\3\2\2" +
                    "\2\31j\3\2\2\2\33m\3\2\2\2\35r\3\2\2\2\37w\3\2\2\2!z\3\2\2\2#~\3\2\2\2" +
                    "%\u0082\3\2\2\2\'\u0086\3\2\2\2)\u008a\3\2\2\2+\u008e\3\2\2\2-\u0092\3" +
                    "\2\2\2/\u0096\3\2\2\2\61\u009a\3\2\2\2\63\u009e\3\2\2\2\65\u00a4\3\2\2" +
                    "\2\67\u00a9\3\2\2\29\u00ab\3\2\2\2;\u00bd\3\2\2\2=\u00c0\3\2\2\2?\u00c6" +
                    "\3\2\2\2AB\7r\2\2BC\7w\2\2CD\7u\2\2DE\7j\2\2E\4\3\2\2\2FG\7r\2\2GH\7q" +
                    "\2\2HI\7r\2\2I\6\3\2\2\2JK\7c\2\2KL\7f\2\2LM\7f\2\2M\b\3\2\2\2NO\7u\2" +
                    "\2OP\7w\2\2PQ\7d\2\2Q\n\3\2\2\2RS\7o\2\2ST\7w\2\2TU\7n\2\2UV\7v\2\2V\f" +
                    "\3\2\2\2WX\7f\2\2XY\7k\2\2YZ\7x\2\2Z\16\3\2\2\2[\\\7u\2\2\\]\7y\2\2]\20" +
                    "\3\2\2\2^_\7n\2\2_`\7y\2\2`\22\3\2\2\2ab\7d\2\2b\24\3\2\2\2cd\7d\2\2d" +
                    "e\7g\2\2ef\7s\2\2f\26\3\2\2\2gh\7d\2\2hi\7i\2\2i\30\3\2\2\2jk\7d\2\2k" +
                    "l\7n\2\2l\32\3\2\2\2mn\7d\2\2no\7i\2\2op\7g\2\2pq\7s\2\2q\34\3\2\2\2r" +
                    "s\7d\2\2st\7n\2\2tu\7g\2\2uv\7s\2\2v\36\3\2\2\2wx\7l\2\2xy\7u\2\2y \3" +
                    "\2\2\2z{\7n\2\2{|\7t\2\2|}\7c\2\2}\"\3\2\2\2~\177\7u\2\2\177\u0080\7t" +
                    "\2\2\u0080\u0081\7c\2\2\u0081$\3\2\2\2\u0082\u0083\7n\2\2\u0083\u0084" +
                    "\7t\2\2\u0084\u0085\7x\2\2\u0085&\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088" +
                    "\7t\2\2\u0088\u0089\7x\2\2\u0089(\3\2\2\2\u008a\u008b\7n\2\2\u008b\u008c" +
                    "\7h\2\2\u008c\u008d\7r\2\2\u008d*\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090" +
                    "\7h\2\2\u0090\u0091\7r\2\2\u0091,\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094" +
                    "\7h\2\2\u0094\u0095\7r\2\2\u0095.\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098" +
                    "\7j\2\2\u0098\u0099\7r\2\2\u0099\60\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c" +
                    "\7j\2\2\u009c\u009d\7r\2\2\u009d\62\3\2\2\2\u009e\u009f\7r\2\2\u009f\u00a0" +
                    "\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3" +
                    "\64\3\2\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7" +
                    "\u00a8\7v\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa8\3\2\2\2\u00ab" +
                    "\u00af\t\2\2\2\u00ac\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2" +
                    "\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0:\3\2\2\2\u00b1\u00af" +
                    "\3\2\2\2\u00b2\u00be\7\62\2\2\u00b3\u00b5\7/\2\2\u00b4\u00b3\3\2\2\2\u00b4" +
                    "\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\4\63;\2\u00b7\u00b9\4\62" +
                    ";\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba" +
                    "\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b2\3\2" +
                    "\2\2\u00bd\u00b4\3\2\2\2\u00be<\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf" +
                    "\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3" +
                    "\u00c4\3\2\2\2\u00c4\u00c5\b\37\2\2\u00c5>\3\2\2\2\u00c6\u00c7\13\2\2" +
                    "\2\u00c7\u00c8\b \3\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b \2\2\u00ca@\3" +
                    "\2\2\2\b\2\u00af\u00b4\u00ba\u00bd\u00c2\4\2\3\2\3 \2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}