// Generated from /home/egor/Загрузки/untitled/grammar/MyParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#from_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_file(MyParser.From_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#fun_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_def(MyParser.Fun_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MyParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(MyParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#indent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndent(MyParser.IndentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#dedent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedent(MyParser.DedentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(MyParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(MyParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(MyParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#local_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_var(MyParser.Local_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MyParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MyParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(MyParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MyParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#or_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_record(MyParser.Or_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#and_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_record(MyParser.And_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#not_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_record(MyParser.Not_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(MyParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(MyParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(MyParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(MyParser.Arithmetic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MyParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MyParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MyParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(MyParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MyParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MyParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#none}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone(MyParser.NoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MyParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MyParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(MyParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(MyParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MyParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#record_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_list(MyParser.Record_listContext ctx);
}