// Generated from /home/egor/Загрузки/untitled/grammar/MyParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#from_file}.
	 * @param ctx the parse tree
	 */
	void enterFrom_file(MyParser.From_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#from_file}.
	 * @param ctx the parse tree
	 */
	void exitFrom_file(MyParser.From_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(MyParser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(MyParser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MyParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MyParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(MyParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(MyParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(MyParser.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(MyParser.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#dedent}.
	 * @param ctx the parse tree
	 */
	void enterDedent(MyParser.DedentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#dedent}.
	 * @param ctx the parse tree
	 */
	void exitDedent(MyParser.DedentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(MyParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(MyParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(MyParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(MyParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(MyParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(MyParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#local_var}.
	 * @param ctx the parse tree
	 */
	void enterLocal_var(MyParser.Local_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#local_var}.
	 * @param ctx the parse tree
	 */
	void exitLocal_var(MyParser.Local_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MyParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MyParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MyParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MyParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MyParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MyParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MyParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MyParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#or_record}.
	 * @param ctx the parse tree
	 */
	void enterOr_record(MyParser.Or_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#or_record}.
	 * @param ctx the parse tree
	 */
	void exitOr_record(MyParser.Or_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#and_record}.
	 * @param ctx the parse tree
	 */
	void enterAnd_record(MyParser.And_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#and_record}.
	 * @param ctx the parse tree
	 */
	void exitAnd_record(MyParser.And_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#not_record}.
	 * @param ctx the parse tree
	 */
	void enterNot_record(MyParser.Not_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#not_record}.
	 * @param ctx the parse tree
	 */
	void exitNot_record(MyParser.Not_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(MyParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(MyParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(MyParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(MyParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(MyParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(MyParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(MyParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(MyParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MyParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MyParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(MyParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(MyParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(MyParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(MyParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MyParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MyParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MyParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#none}.
	 * @param ctx the parse tree
	 */
	void enterNone(MyParser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#none}.
	 * @param ctx the parse tree
	 */
	void exitNone(MyParser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MyParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MyParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MyParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MyParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MyParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MyParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(MyParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(MyParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#record_list}.
	 * @param ctx the parse tree
	 */
	void enterRecord_list(MyParser.Record_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#record_list}.
	 * @param ctx the parse tree
	 */
	void exitRecord_list(MyParser.Record_listContext ctx);
}