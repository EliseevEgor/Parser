import org.antlr.v4.runtime.*;

import java.util.LinkedList;
import java.util.Stack;


abstract class MyLexerBase extends Lexer {

    private final LinkedList<Token> tokens = new LinkedList<>();
    private final Stack<Integer> indents = new Stack<>();
    private Token current;
    private int opened = 0;

    protected MyLexerBase(CharStream input) {
        super(input);
    }

    void open(){
        this.opened++;
    }

    void close(){
        this.opened--;
    }

    boolean start() {
        return getCharPositionInLine() == 0 && getLine() == 1;
    }

    @Override
    public Token nextToken() {
        if (_input.LA(1) == EOF && !indents.isEmpty()) {
            for (int i = tokens.size() - 1; i >= 0; i--) {
                if (tokens.get(i).getType() == EOF) {
                    tokens.remove(i);
                }
            }
            emit(commonToken(MyLexer.NEWLINE, "\n"));
            while (!indents.isEmpty()) {
                emit(createDedent());
                indents.pop();
            }
            emit(commonToken(EOF, "<EOF>"));
        }
        Token next = super.nextToken();
        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
            current = next;
        }
        return tokens.isEmpty() ? next : tokens.poll();
    }

    @Override
    public void emit(Token t) {
        setToken(t);
        tokens.add(t);
    }

    private Token createDedent() {
        CommonToken dedent = commonToken(MyLexer.DEDENT, "");
        dedent.setLine(current.getLine());
        return dedent;
    }

    private CommonToken commonToken(int type, String text) {
        int stop = getCharIndex() - 1;
        int start = text.isEmpty() ? stop : stop - text.length() + 1;
        return new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }

    static int getIndentationCount(String spaces) {
        int count = 0;
        for (char ch : spaces.toCharArray()) {
            if (ch == '\t') {
                count += 8 - (count % 8);
            } else {
                count++;
            }
        }
        return count;
    }

    void newLine(){
        String newLine = getText().replaceAll("[^\r\n\f]+", "");
        String spaces = getText().replaceAll("[\r\n\f]+", "");

        int next = _input.LA(1);
        int nextNext = _input.LA(2);
        if (opened > 0 || ((next == '\r' || next == '\n' || next == '\f' || next == '#') && nextNext != -1)) {
            skip();
        }
        else {
            emit(commonToken(MyLexer.NEWLINE, newLine));
            int indent = getIndentationCount(spaces);
            int previous = indents.isEmpty() ? 0 : indents.peek();
            if (indent == previous) {
                skip();
            }
            else if (indent > previous) {
                indents.push(indent);
                emit(commonToken(MyLexer.INDENT, spaces));
            }
            else {
                while(!indents.isEmpty() && indents.peek() > indent) {
                    emit(createDedent());
                    indents.pop();
                }
            }
        }
    }
}