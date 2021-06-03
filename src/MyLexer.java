// Generated from /home/egor/Загрузки/untitled/grammar/MyLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLexer extends MyLexerBase {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NUMBER=3, FUN=4, RETURN=5, TRUE=6, FALSE=7, NONE=8, 
		IF=9, ELSE=10, WHILE=11, FOR=12, IN=13, OR=14, AND=15, NOT=16, NEWLINE=17, 
		NAME=18, STRING=19, INTEGER=20, FLOAT=21, ASSIGN=22, COMMA=23, COLON=24, 
		SEMICOLON=25, ADD=26, MINUS=27, MULT=28, DIV=29, MOD=30, POWER=31, OR_OP=32, 
		AND_OP=33, EQUALS=34, NEQ=35, LESS=36, GREATER=37, GEQ=38, LEQ=39, ADD_ASSIGN=40, 
		SUB_ASSIGN=41, MULT_ASSIGN=42, DIV_ASSIGN=43, MOD_ASSIGN=44, POW_ASSIGN=45, 
		AND_ASSIGN=46, OR_ASSIGN=47, OPEN_PAREN=48, CLOSE_PAREN=49, OPEN_BRACK=50, 
		CLOSE_BRACK=51, SKIP_=52, UNKNOWN_CHAR=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "FUN", "RETURN", "TRUE", "FALSE", "NONE", "IF", "ELSE", "WHILE", 
			"FOR", "IN", "OR", "AND", "NOT", "NEWLINE", "NAME", "STRING", "INTEGER", 
			"FLOAT", "ASSIGN", "COMMA", "COLON", "SEMICOLON", "ADD", "MINUS", "MULT", 
			"DIV", "MOD", "POWER", "OR_OP", "AND_OP", "EQUALS", "NEQ", "LESS", "GREATER", 
			"GEQ", "LEQ", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "POW_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", "SKIP_", "UNKNOWN_CHAR", 
			"DIGIT", "SPACES", "COMMENT", "LINE_JOINING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'fun'", "'return'", "'True'", "'False'", "'None'", 
			"'if'", "'else'", "'while'", "'for'", "'in'", "'or'", "'and'", "'not'", 
			null, null, null, null, null, "'='", "','", "':'", "';'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'**'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", 
			"'>='", "'<='", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'&='", 
			"'|='", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NUMBER", "FUN", "RETURN", "TRUE", "FALSE", 
			"NONE", "IF", "ELSE", "WHILE", "FOR", "IN", "OR", "AND", "NOT", "NEWLINE", 
			"NAME", "STRING", "INTEGER", "FLOAT", "ASSIGN", "COMMA", "COLON", "SEMICOLON", 
			"ADD", "MINUS", "MULT", "DIV", "MOD", "POWER", "OR_OP", "AND_OP", "EQUALS", 
			"NEQ", "LESS", "GREATER", "GEQ", "LEQ", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "POW_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", "SKIP_", "UNKNOWN_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLexer.g4"; }

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
		case 14:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			newLine();
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			open();
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			close();
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			open();
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			close();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return start();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0162\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\5\2t\n\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20"+
		"\5\20\u00b9\n\20\3\20\5\20\u00bc\n\20\5\20\u00be\n\20\3\20\3\20\3\21\3"+
		"\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21\3\22\3\22\7\22\u00cb\n\22\f"+
		"\22\16\22\u00ce\13\22\3\22\3\22\3\23\3\23\7\23\u00d4\n\23\f\23\16\23\u00d7"+
		"\13\23\3\23\5\23\u00da\n\23\3\24\6\24\u00dd\n\24\r\24\16\24\u00de\5\24"+
		"\u00e1\n\24\3\24\3\24\6\24\u00e5\n\24\r\24\16\24\u00e6\3\24\6\24\u00ea"+
		"\n\24\r\24\16\24\u00eb\3\24\3\24\5\24\u00f0\n\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\5\63\u0143\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\6\66\u014c\n\66\r\66\16\66\u014d\3\67\3\67\7\67\u0152\n\67\f\67\16\67"+
		"\u0155\13\67\38\38\58\u0159\n8\38\38\58\u015d\n8\38\38\58\u0161\n8\2\2"+
		"9\3\5\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r\25\16\27\17\31\20\33\21\35"+
		"\22\37\23!\24#\25%\26\'\27)\30+\31-\32/\33\61\34\63\35\65\36\67\379 ;"+
		"!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W/Y\60[\61]\62_\63a\64c\65e\66g\67i\2k\2"+
		"m\2o\2\3\2\t\4\2C\\c|\5\2\62;C\\c|\6\2\f\f\16\17$$^^\3\2\63;\3\2\62;\4"+
		"\2\13\13\"\"\4\2\f\f\16\17\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\3s\3\2\2\2\5u\3\2\2\2\7y\3\2\2\2\t\u0080\3\2\2\2\13\u0085\3\2\2\2\r"+
		"\u008b\3\2\2\2\17\u0090\3\2\2\2\21\u0093\3\2\2\2\23\u0098\3\2\2\2\25\u009e"+
		"\3\2\2\2\27\u00a2\3\2\2\2\31\u00a5\3\2\2\2\33\u00a8\3\2\2\2\35\u00ac\3"+
		"\2\2\2\37\u00bd\3\2\2\2!\u00c1\3\2\2\2#\u00c8\3\2\2\2%\u00d9\3\2\2\2\'"+
		"\u00ef\3\2\2\2)\u00f1\3\2\2\2+\u00f3\3\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2"+
		"\2\2\61\u00f9\3\2\2\2\63\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2"+
		"\29\u0101\3\2\2\2;\u0103\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a"+
		"\3\2\2\2C\u010d\3\2\2\2E\u0110\3\2\2\2G\u0112\3\2\2\2I\u0114\3\2\2\2K"+
		"\u0117\3\2\2\2M\u011a\3\2\2\2O\u011d\3\2\2\2Q\u0120\3\2\2\2S\u0123\3\2"+
		"\2\2U\u0126\3\2\2\2W\u0129\3\2\2\2Y\u012d\3\2\2\2[\u0130\3\2\2\2]\u0133"+
		"\3\2\2\2_\u0136\3\2\2\2a\u0139\3\2\2\2c\u013c\3\2\2\2e\u0142\3\2\2\2g"+
		"\u0146\3\2\2\2i\u0148\3\2\2\2k\u014b\3\2\2\2m\u014f\3\2\2\2o\u0156\3\2"+
		"\2\2qt\5%\23\2rt\5\'\24\2sq\3\2\2\2sr\3\2\2\2t\4\3\2\2\2uv\7h\2\2vw\7"+
		"w\2\2wx\7p\2\2x\6\3\2\2\2yz\7t\2\2z{\7g\2\2{|\7v\2\2|}\7w\2\2}~\7t\2\2"+
		"~\177\7p\2\2\177\b\3\2\2\2\u0080\u0081\7V\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u0084\7g\2\2\u0084\n\3\2\2\2\u0085\u0086\7H\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2"+
		"\u008a\f\3\2\2\2\u008b\u008c\7P\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p"+
		"\2\2\u008e\u008f\7g\2\2\u008f\16\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7h\2\2\u0092\20\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7g\2\2\u0097\22\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a"+
		"\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d"+
		"\24\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7f\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7v\2\2\u00af\36\3\2\2\2\u00b0\u00b1\6\20\2\2"+
		"\u00b1\u00be\5k\66\2\u00b2\u00b9\7\17\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\7\f\2\2\u00b7"+
		"\u00b9\7\16\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5k\66\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b0\3\2\2\2\u00bd\u00b8\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\20\2\2\u00c0 \3\2\2\2\u00c1\u00c5"+
		"\t\2\2\2\u00c2\u00c4\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\"\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c8\u00cc\7$\2\2\u00c9\u00cb\n\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0$\3\2\2\2\u00d1\u00d5\t\5\2\2\u00d2"+
		"\u00d4\5i\65\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00da\7\62\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da&\3\2\2\2"+
		"\u00db\u00dd\5i\65\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7\60\2\2\u00e3\u00e5\5"+
		"i\65\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00f0\3\2\2\2\u00e8\u00ea\5i\65\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e0\3"+
		"\2\2\2\u00ef\u00e9\3\2\2\2\u00f0(\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2*\3"+
		"\2\2\2\u00f3\u00f4\7.\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6.\3\2"+
		"\2\2\u00f7\u00f8\7=\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7-\2\2\u00fa\62\3"+
		"\2\2\2\u00fb\u00fc\7/\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\66"+
		"\3\2\2\2\u00ff\u0100\7\61\2\2\u01008\3\2\2\2\u0101\u0102\7\'\2\2\u0102"+
		":\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\7,\2\2\u0105<\3\2\2\2\u0106\u0107"+
		"\7~\2\2\u0107>\3\2\2\2\u0108\u0109\7(\2\2\u0109@\3\2\2\2\u010a\u010b\7"+
		"?\2\2\u010b\u010c\7?\2\2\u010cB\3\2\2\2\u010d\u010e\7#\2\2\u010e\u010f"+
		"\7?\2\2\u010fD\3\2\2\2\u0110\u0111\7>\2\2\u0111F\3\2\2\2\u0112\u0113\7"+
		"@\2\2\u0113H\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2\2\u0116J\3\2"+
		"\2\2\u0117\u0118\7>\2\2\u0118\u0119\7?\2\2\u0119L\3\2\2\2\u011a\u011b"+
		"\7-\2\2\u011b\u011c\7?\2\2\u011cN\3\2\2\2\u011d\u011e\7/\2\2\u011e\u011f"+
		"\7?\2\2\u011fP\3\2\2\2\u0120\u0121\7,\2\2\u0121\u0122\7?\2\2\u0122R\3"+
		"\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125\7?\2\2\u0125T\3\2\2\2\u0126\u0127"+
		"\7\'\2\2\u0127\u0128\7?\2\2\u0128V\3\2\2\2\u0129\u012a\7,\2\2\u012a\u012b"+
		"\7,\2\2\u012b\u012c\7?\2\2\u012cX\3\2\2\2\u012d\u012e\7(\2\2\u012e\u012f"+
		"\7?\2\2\u012fZ\3\2\2\2\u0130\u0131\7~\2\2\u0131\u0132\7?\2\2\u0132\\\3"+
		"\2\2\2\u0133\u0134\7*\2\2\u0134\u0135\b/\3\2\u0135^\3\2\2\2\u0136\u0137"+
		"\7+\2\2\u0137\u0138\b\60\4\2\u0138`\3\2\2\2\u0139\u013a\7]\2\2\u013a\u013b"+
		"\b\61\5\2\u013bb\3\2\2\2\u013c\u013d\7_\2\2\u013d\u013e\b\62\6\2\u013e"+
		"d\3\2\2\2\u013f\u0143\5k\66\2\u0140\u0143\5m\67\2\u0141\u0143\5o8\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\b\63\7\2\u0145f\3\2\2\2\u0146\u0147\13\2\2\2\u0147h\3"+
		"\2\2\2\u0148\u0149\t\6\2\2\u0149j\3\2\2\2\u014a\u014c\t\7\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"l\3\2\2\2\u014f\u0153\7%\2\2\u0150\u0152\n\b\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154n\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u0158\7^\2\2\u0157\u0159\5k\66\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0160\3\2\2\2\u015a\u0161\7\17\2\2"+
		"\u015b\u015d\7\17\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u0161\7\f\2\2\u015f\u0161\7\16\2\2\u0160\u015a\3\2\2\2"+
		"\u0160\u015c\3\2\2\2\u0160\u015f\3\2\2\2\u0161p\3\2\2\2\27\2s\u00b4\u00b8"+
		"\u00bb\u00bd\u00c5\u00cc\u00d5\u00d9\u00de\u00e0\u00e6\u00eb\u00ef\u0142"+
		"\u014d\u0153\u0158\u015c\u0160\b\3\20\2\3/\3\3\60\4\3\61\5\3\62\6\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}