// Generated from /home/egor/Загрузки/untitled/grammar/MyParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParser extends Parser {
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
	public static final int
		RULE_from_file = 0, RULE_fun_def = 1, RULE_parameters = 2, RULE_param = 3, 
		RULE_statement = 4, RULE_newline = 5, RULE_indent = 6, RULE_dedent = 7, 
		RULE_simple_statement = 8, RULE_expression = 9, RULE_augassign = 10, RULE_return_statement = 11, 
		RULE_local_var = 12, RULE_if_statement = 13, RULE_while_statement = 14, 
		RULE_for_statement = 15, RULE_body = 16, RULE_or_record = 17, RULE_and_record = 18, 
		RULE_not_record = 19, RULE_comparison = 20, RULE_comp_op = 21, RULE_expr = 22, 
		RULE_and_expr = 23, RULE_arithmetic_expr = 24, RULE_term = 25, RULE_factor = 26, 
		RULE_power = 27, RULE_atom_expr = 28, RULE_number = 29, RULE_string = 30, 
		RULE_none = 31, RULE_bool = 32, RULE_atom = 33, RULE_parentheses = 34, 
		RULE_expr_list = 35, RULE_list = 36, RULE_record_list = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"from_file", "fun_def", "parameters", "param", "statement", "newline", 
			"indent", "dedent", "simple_statement", "expression", "augassign", "return_statement", 
			"local_var", "if_statement", "while_statement", "for_statement", "body", 
			"or_record", "and_record", "not_record", "comparison", "comp_op", "expr", 
			"and_expr", "arithmetic_expr", "term", "factor", "power", "atom_expr", 
			"number", "string", "none", "bool", "atom", "parentheses", "expr_list", 
			"list", "record_list"
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

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class From_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public From_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFrom_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFrom_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFrom_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_fileContext from_file() throws RecognitionException {
		From_fileContext _localctx = new From_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_from_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << FUN) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << NONE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NEWLINE) | (1L << NAME) | (1L << STRING) | (1L << ADD) | (1L << MINUS) | (1L << OPEN_BRACK))) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(76);
					match(NEWLINE);
					}
					break;
				case NUMBER:
				case FUN:
				case RETURN:
				case TRUE:
				case FALSE:
				case NONE:
				case IF:
				case WHILE:
				case FOR:
				case NOT:
				case NAME:
				case STRING:
				case ADD:
				case MINUS:
				case OPEN_BRACK:
					{
					setState(77);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(EOF);
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(MyParser.FUN, 0); }
		public TerminalNode NAME() { return getToken(MyParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFun_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFun_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FUN);
			setState(86);
			match(NAME);
			setState(87);
			parameters();
			setState(88);
			match(COLON);
			setState(89);
			body();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MyParser.CLOSE_PAREN, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(OPEN_PAREN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NONE) | (1L << NOT) | (1L << NAME) | (1L << STRING) | (1L << ADD) | (1L << MINUS) | (1L << OPEN_BRACK))) != 0)) {
				{
				setState(92);
				param();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					param();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(CLOSE_PAREN);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MyParser.NAME, 0); }
		public Or_recordContext or_record() {
			return getRuleContext(Or_recordContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(104);
				or_record();
				}
				break;
			}
			setState(107);
			match(NAME);
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

	public static class StatementContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case RETURN:
			case TRUE:
			case FALSE:
			case NONE:
			case NOT:
			case NAME:
			case STRING:
			case ADD:
			case MINUS:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				simple_statement();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				fun_def();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				for_statement();
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MyParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NEWLINE);
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

	public static class IndentContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(MyParser.INDENT, 0); }
		public IndentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIndent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIndent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIndent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndentContext indent() throws RecognitionException {
		IndentContext _localctx = new IndentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_indent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(INDENT);
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

	public static class DedentContext extends ParserRuleContext {
		public TerminalNode DEDENT() { return getToken(MyParser.DEDENT, 0); }
		public DedentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dedent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDedent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDedent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDedent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DedentContext dedent() throws RecognitionException {
		DedentContext _localctx = new DedentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dedent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(DEDENT);
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

	public static class Simple_statementContext extends ParserRuleContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case NOT:
			case NAME:
			case STRING:
			case ADD:
			case MINUS:
			case OPEN_BRACK:
				{
				setState(122);
				expression();
				}
				break;
			case RETURN:
				{
				setState(123);
				return_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			newline();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Or_recordContext> or_record() {
			return getRuleContexts(Or_recordContext.class);
		}
		public Or_recordContext or_record(int i) {
			return getRuleContext(Or_recordContext.class,i);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public Record_listContext record_list() {
			return getRuleContext(Record_listContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(MyParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(MyParser.ASSIGN, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			or_record();
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case POW_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
				{
				setState(129);
				augassign();
				{
				setState(130);
				record_list();
				}
				}
				break;
			case NEWLINE:
			case ASSIGN:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(132);
					match(ASSIGN);
					{
					setState(133);
					or_record();
					}
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AugassignContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(MyParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(MyParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(MyParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(MyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(MyParser.MOD_ASSIGN, 0); }
		public TerminalNode POW_ASSIGN() { return getToken(MyParser.POW_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(MyParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(MyParser.OR_ASSIGN, 0); }
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAugassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAugassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MULT_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << POW_ASSIGN) | (1L << AND_ASSIGN) | (1L << OR_ASSIGN))) != 0)) ) {
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public Record_listContext record_list() {
			return getRuleContext(Record_listContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(RETURN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NONE) | (1L << NOT) | (1L << NAME) | (1L << STRING) | (1L << ADD) | (1L << MINUS) | (1L << OPEN_BRACK))) != 0)) {
				{
				setState(144);
				record_list();
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

	public static class Local_varContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MyParser.NAME, 0); }
		public Local_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLocal_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLocal_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLocal_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_varContext local_var() throws RecognitionException {
		Local_varContext _localctx = new Local_varContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_local_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(NAME);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyParser.IF, 0); }
		public Or_recordContext or_record() {
			return getRuleContext(Or_recordContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(MyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyParser.COLON, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IF);
			setState(150);
			or_record();
			setState(151);
			match(COLON);
			setState(152);
			body();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(153);
				match(ELSE);
				setState(154);
				match(COLON);
				setState(155);
				body();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyParser.WHILE, 0); }
		public Or_recordContext or_record() {
			return getRuleContext(Or_recordContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WHILE);
			setState(159);
			or_record();
			setState(160);
			match(COLON);
			setState(161);
			body();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyParser.FOR, 0); }
		public Local_varContext local_var() {
			return getRuleContext(Local_varContext.class,0);
		}
		public TerminalNode IN() { return getToken(MyParser.IN, 0); }
		public Record_listContext record_list() {
			return getRuleContext(Record_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FOR);
			setState(164);
			local_var();
			setState(165);
			match(IN);
			setState(166);
			record_list();
			setState(167);
			match(COLON);
			setState(168);
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_body);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case RETURN:
			case TRUE:
			case FALSE:
			case NONE:
			case NOT:
			case NAME:
			case STRING:
			case ADD:
			case MINUS:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				simple_statement();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				newline();
				setState(172);
				indent();
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					statement();
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << FUN) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << NONE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NAME) | (1L << STRING) | (1L << ADD) | (1L << MINUS) | (1L << OPEN_BRACK))) != 0) );
				setState(178);
				dedent();
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

	public static class Or_recordContext extends ParserRuleContext {
		public List<And_recordContext> and_record() {
			return getRuleContexts(And_recordContext.class);
		}
		public And_recordContext and_record(int i) {
			return getRuleContext(And_recordContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MyParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MyParser.OR, i);
		}
		public Or_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOr_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOr_record(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOr_record(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_recordContext or_record() throws RecognitionException {
		Or_recordContext _localctx = new Or_recordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_or_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			and_record();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(183);
				match(OR);
				setState(184);
				and_record();
				}
				}
				setState(189);
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

	public static class And_recordContext extends ParserRuleContext {
		public List<Not_recordContext> not_record() {
			return getRuleContexts(Not_recordContext.class);
		}
		public Not_recordContext not_record(int i) {
			return getRuleContext(Not_recordContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MyParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MyParser.AND, i);
		}
		public And_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAnd_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAnd_record(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAnd_record(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_recordContext and_record() throws RecognitionException {
		And_recordContext _localctx = new And_recordContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_and_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			not_record();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(191);
				match(AND);
				setState(192);
				not_record();
				}
				}
				setState(197);
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

	public static class Not_recordContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MyParser.NOT, 0); }
		public Not_recordContext not_record() {
			return getRuleContext(Not_recordContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNot_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNot_record(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNot_record(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_recordContext not_record() throws RecognitionException {
		Not_recordContext _localctx = new Not_recordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_not_record);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(NOT);
				setState(199);
				not_record();
				}
				break;
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case NAME:
			case STRING:
			case ADD:
			case MINUS:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expr();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT) | (1L << EQUALS) | (1L << NEQ) | (1L << LESS) | (1L << GREATER) | (1L << GEQ) | (1L << LEQ))) != 0)) {
				{
				{
				setState(204);
				comp_op();
				setState(205);
				expr();
				}
				}
				setState(211);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MyParser.EQUALS, 0); }
		public TerminalNode NEQ() { return getToken(MyParser.NEQ, 0); }
		public TerminalNode LESS() { return getToken(MyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(MyParser.GREATER, 0); }
		public TerminalNode LEQ() { return getToken(MyParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(MyParser.GEQ, 0); }
		public TerminalNode IN() { return getToken(MyParser.IN, 0); }
		public TerminalNode NOT() { return getToken(MyParser.NOT, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comp_op);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(EQUALS);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(NEQ);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(LESS);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(GREATER);
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(LEQ);
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(GEQ);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				match(NOT);
				setState(220);
				match(IN);
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

	public static class ExprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> OR_OP() { return getTokens(MyParser.OR_OP); }
		public TerminalNode OR_OP(int i) {
			return getToken(MyParser.OR_OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			and_expr();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(224);
				match(OR_OP);
				setState(225);
				and_expr();
				}
				}
				setState(230);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public List<TerminalNode> AND_OP() { return getTokens(MyParser.AND_OP); }
		public TerminalNode AND_OP(int i) {
			return getToken(MyParser.AND_OP, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			arithmetic_expr();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(232);
				match(AND_OP);
				setState(233);
				arithmetic_expr();
				}
				}
				setState(238);
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(MyParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(MyParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MyParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MyParser.MINUS, i);
		}
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArithmetic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArithmetic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArithmetic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arithmetic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			term();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				term();
				}
				}
				setState(246);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(MyParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(MyParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MyParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MyParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(MyParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(MyParser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			factor();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				factor();
				}
				}
				setState(254);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MyParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(MyParser.MINUS, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				factor();
				}
				break;
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case NAME:
			case STRING:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode POWER() { return getToken(MyParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			atom_expr();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(261);
				match(POWER);
				setState(262);
				factor();
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

	public static class Atom_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<ParenthesesContext> parentheses() {
			return getRuleContexts(ParenthesesContext.class);
		}
		public ParenthesesContext parentheses(int i) {
			return getRuleContext(ParenthesesContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			atom();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAREN || _la==OPEN_BRACK) {
				{
				{
				setState(266);
				parentheses();
				}
				}
				setState(271);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(NUMBER);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MyParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyParser.STRING, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				match(STRING);
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class NoneContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(MyParser.NONE, 0); }
		public NoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_none; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoneContext none() throws RecognitionException {
		NoneContext _localctx = new NoneContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_none);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(NONE);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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

	public static class AtomContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NAME() { return getToken(MyParser.NAME, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NoneContext none() {
			return getRuleContext(NoneContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACK:
				{
				setState(283);
				list();
				}
				break;
			case NAME:
				{
				setState(284);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				setState(285);
				number();
				}
				break;
			case STRING:
				{
				setState(286);
				string();
				}
				break;
			case NONE:
				{
				setState(287);
				none();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(288);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MyParser.CLOSE_PAREN, 0); }
		public Record_listContext record_list() {
			return getRuleContext(Record_listContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(MyParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(MyParser.CLOSE_BRACK, 0); }
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parentheses);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(OPEN_PAREN);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NONE) | (1L << NOT) | (1L << NAME) | (1L << STRING) | (1L << ADD) | (1L << MINUS) | (1L << OPEN_BRACK))) != 0)) {
					{
					setState(292);
					record_list();
					}
				}

				setState(295);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(OPEN_BRACK);
				setState(297);
				record_list();
				setState(298);
				match(CLOSE_BRACK);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			expr();
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(COMMA);
					{
					setState(304);
					expr();
					}
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(310);
				match(COMMA);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(MyParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(MyParser.CLOSE_BRACK, 0); }
		public Record_listContext record_list() {
			return getRuleContext(Record_listContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(OPEN_BRACK);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NONE) | (1L << NOT) | (1L << NAME) | (1L << STRING) | (1L << ADD) | (1L << MINUS) | (1L << OPEN_BRACK))) != 0)) {
				{
				setState(314);
				record_list();
				}
			}

			setState(317);
			match(CLOSE_BRACK);
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

	public static class Record_listContext extends ParserRuleContext {
		public List<Or_recordContext> or_record() {
			return getRuleContexts(Or_recordContext.class);
		}
		public Or_recordContext or_record(int i) {
			return getRuleContext(Or_recordContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParser.COMMA, i);
		}
		public Record_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterRecord_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitRecord_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRecord_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_listContext record_list() throws RecognitionException {
		Record_listContext _localctx = new Record_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_record_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			or_record();
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					match(COMMA);
					setState(321);
					or_record();
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(327);
				match(COMMA);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u014d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4b\n\4\f\4\16"+
		"\4e\13\4\5\4g\n\4\3\4\3\4\3\5\5\5l\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"u\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\177\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\5\13\u008e\n"+
		"\13\3\f\3\f\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u00b1\n\22\r\22\16\22\u00b2\3"+
		"\22\3\22\5\22\u00b7\n\22\3\23\3\23\3\23\7\23\u00bc\n\23\f\23\16\23\u00bf"+
		"\13\23\3\24\3\24\3\24\7\24\u00c4\n\24\f\24\16\24\u00c7\13\24\3\25\3\25"+
		"\3\25\5\25\u00cc\n\25\3\26\3\26\3\26\3\26\7\26\u00d2\n\26\f\26\16\26\u00d5"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e0\n\27\3"+
		"\30\3\30\3\30\7\30\u00e5\n\30\f\30\16\30\u00e8\13\30\3\31\3\31\3\31\7"+
		"\31\u00ed\n\31\f\31\16\31\u00f0\13\31\3\32\3\32\3\32\7\32\u00f5\n\32\f"+
		"\32\16\32\u00f8\13\32\3\33\3\33\3\33\7\33\u00fd\n\33\f\33\16\33\u0100"+
		"\13\33\3\34\3\34\3\34\5\34\u0105\n\34\3\35\3\35\3\35\5\35\u010a\n\35\3"+
		"\36\3\36\7\36\u010e\n\36\f\36\16\36\u0111\13\36\3\37\3\37\3 \6 \u0116"+
		"\n \r \16 \u0117\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0124\n#\3$\3$\5$"+
		"\u0128\n$\3$\3$\3$\3$\3$\5$\u012f\n$\3%\3%\3%\7%\u0134\n%\f%\16%\u0137"+
		"\13%\3%\5%\u013a\n%\3&\3&\5&\u013e\n&\3&\3&\3\'\3\'\3\'\7\'\u0145\n\'"+
		"\f\'\16\'\u0148\13\'\3\'\5\'\u014b\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\3\2*\61\3\2\34\35"+
		"\3\2\36 \3\2\b\t\2\u0155\2R\3\2\2\2\4W\3\2\2\2\6]\3\2\2\2\bk\3\2\2\2\n"+
		"t\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22~\3\2\2\2\24\u0082\3\2"+
		"\2\2\26\u008f\3\2\2\2\30\u0091\3\2\2\2\32\u0095\3\2\2\2\34\u0097\3\2\2"+
		"\2\36\u00a0\3\2\2\2 \u00a5\3\2\2\2\"\u00b6\3\2\2\2$\u00b8\3\2\2\2&\u00c0"+
		"\3\2\2\2(\u00cb\3\2\2\2*\u00cd\3\2\2\2,\u00df\3\2\2\2.\u00e1\3\2\2\2\60"+
		"\u00e9\3\2\2\2\62\u00f1\3\2\2\2\64\u00f9\3\2\2\2\66\u0104\3\2\2\28\u0106"+
		"\3\2\2\2:\u010b\3\2\2\2<\u0112\3\2\2\2>\u0115\3\2\2\2@\u0119\3\2\2\2B"+
		"\u011b\3\2\2\2D\u0123\3\2\2\2F\u012e\3\2\2\2H\u0130\3\2\2\2J\u013b\3\2"+
		"\2\2L\u0141\3\2\2\2NQ\7\23\2\2OQ\5\n\6\2PN\3\2\2\2PO\3\2\2\2QT\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\2\2\3V\3\3\2\2\2WX\7\6\2"+
		"\2XY\7\24\2\2YZ\5\6\4\2Z[\7\32\2\2[\\\5\"\22\2\\\5\3\2\2\2]f\7\62\2\2"+
		"^c\5\b\5\2_`\7\31\2\2`b\5\b\5\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2f^\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\63\2\2i\7\3\2"+
		"\2\2jl\5$\23\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\24\2\2n\t\3\2\2\2ou\5"+
		"\22\n\2pu\5\4\3\2qu\5\34\17\2ru\5\36\20\2su\5 \21\2to\3\2\2\2tp\3\2\2"+
		"\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\13\3\2\2\2vw\7\23\2\2w\r\3\2\2\2xy\7"+
		"\3\2\2y\17\3\2\2\2z{\7\4\2\2{\21\3\2\2\2|\177\5\24\13\2}\177\5\30\r\2"+
		"~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\5\f\7\2\u0081\23\3"+
		"\2\2\2\u0082\u008d\5$\23\2\u0083\u0084\5\26\f\2\u0084\u0085\5L\'\2\u0085"+
		"\u008e\3\2\2\2\u0086\u0087\7\30\2\2\u0087\u0089\5$\23\2\u0088\u0086\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u008a\3\2"+
		"\2\2\u008e\25\3\2\2\2\u008f\u0090\t\2\2\2\u0090\27\3\2\2\2\u0091\u0093"+
		"\7\7\2\2\u0092\u0094\5L\'\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\31\3\2\2\2\u0095\u0096\7\24\2\2\u0096\33\3\2\2\2\u0097\u0098\7\13\2\2"+
		"\u0098\u0099\5$\23\2\u0099\u009a\7\32\2\2\u009a\u009e\5\"\22\2\u009b\u009c"+
		"\7\f\2\2\u009c\u009d\7\32\2\2\u009d\u009f\5\"\22\2\u009e\u009b\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2"+
		"\5$\23\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5\"\22\2\u00a4\37\3\2\2\2\u00a5"+
		"\u00a6\7\16\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9"+
		"\5L\'\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\5\"\22\2\u00ab!\3\2\2\2\u00ac"+
		"\u00b7\5\22\n\2\u00ad\u00ae\5\f\7\2\u00ae\u00b0\5\16\b\2\u00af\u00b1\5"+
		"\n\6\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b7\3"+
		"\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00bd"+
		"\5&\24\2\u00b9\u00ba\7\20\2\2\u00ba\u00bc\5&\24\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be%\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c5\5(\25\2\u00c1\u00c2\7\21\2\2\u00c2"+
		"\u00c4\5(\25\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\7\22\2\2\u00c9\u00cc\5(\25\2\u00ca\u00cc\5*\26\2\u00cb\u00c8\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00d3\5.\30\2\u00ce\u00cf\5"+
		",\27\2\u00cf\u00d0\5.\30\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4+\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00e0\7$\2\2\u00d7\u00e0\7%\2\2\u00d8\u00e0"+
		"\7&\2\2\u00d9\u00e0\7\'\2\2\u00da\u00e0\7)\2\2\u00db\u00e0\7(\2\2\u00dc"+
		"\u00e0\7\17\2\2\u00dd\u00de\7\22\2\2\u00de\u00e0\7\17\2\2\u00df\u00d6"+
		"\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0-\3\2\2\2\u00e1\u00e6\5\60\31\2\u00e2\u00e3\7\"\2\2\u00e3\u00e5"+
		"\5\60\31\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7/\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ee\5"+
		"\62\32\2\u00ea\u00eb\7#\2\2\u00eb\u00ed\5\62\32\2\u00ec\u00ea\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\61"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f6\5\64\33\2\u00f2\u00f3\t\3\2\2"+
		"\u00f3\u00f5\5\64\33\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\63\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fe\5\66\34\2\u00fa\u00fb\t\4\2\2\u00fb\u00fd\5\66\34\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\65\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\t\3\2\2\u0102\u0105\5\66\34"+
		"\2\u0103\u0105\58\35\2\u0104\u0101\3\2\2\2\u0104\u0103\3\2\2\2\u0105\67"+
		"\3\2\2\2\u0106\u0109\5:\36\2\u0107\u0108\7!\2\2\u0108\u010a\5\66\34\2"+
		"\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a9\3\2\2\2\u010b\u010f\5"+
		"D#\2\u010c\u010e\5F$\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110;\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7\5\2\2\u0113=\3\2\2\2\u0114\u0116\7\25\2\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118?\3"+
		"\2\2\2\u0119\u011a\7\n\2\2\u011aA\3\2\2\2\u011b\u011c\t\5\2\2\u011cC\3"+
		"\2\2\2\u011d\u0124\5J&\2\u011e\u0124\7\24\2\2\u011f\u0124\5<\37\2\u0120"+
		"\u0124\5> \2\u0121\u0124\5@!\2\u0122\u0124\5B\"\2\u0123\u011d\3\2\2\2"+
		"\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0122\3\2\2\2\u0124E\3\2\2\2\u0125\u0127\7\62\2\2\u0126"+
		"\u0128\5L\'\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012f\7\63\2\2\u012a\u012b\7\64\2\2\u012b\u012c\5L\'\2\u012c"+
		"\u012d\7\65\2\2\u012d\u012f\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012a\3"+
		"\2\2\2\u012fG\3\2\2\2\u0130\u0135\5.\30\2\u0131\u0132\7\31\2\2\u0132\u0134"+
		"\5.\30\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7\31"+
		"\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013aI\3\2\2\2\u013b\u013d"+
		"\7\64\2\2\u013c\u013e\5L\'\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\7\65\2\2\u0140K\3\2\2\2\u0141\u0146\5$\23\2"+
		"\u0142\u0143\7\31\2\2\u0143\u0145\5$\23\2\u0144\u0142\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014b\7\31\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014bM\3\2\2\2$PRcfkt~\u008a\u008d\u0093\u009e\u00b2\u00b6\u00bd"+
		"\u00c5\u00cb\u00d3\u00df\u00e6\u00ee\u00f6\u00fe\u0104\u0109\u010f\u0117"+
		"\u0123\u0127\u012e\u0135\u0139\u013d\u0146\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}