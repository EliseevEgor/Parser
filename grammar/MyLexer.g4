lexer grammar MyLexer;

tokens { INDENT, DEDENT }

options {
    superClass=MyLexerBase;
}


NUMBER
 : INTEGER
 | FLOAT
 ;

FUN : 'fun';
RETURN : 'return';

TRUE : 'True';
FALSE : 'False';
NONE : 'None';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';

OR : 'or';
AND : 'and';
NOT : 'not';

NEWLINE
 : ( {start()}?   SPACES
   | ( '\r' | '\r'? '\n' | '\f' ) SPACES?
   )
   {newLine();}
 ;

NAME
 : ([a-zA-Z]) [a-zA-Z0-9]*
 ;

STRING
 : '"' (~[\\\r\n\f"])* '"'
 ;

INTEGER
 : [1-9] DIGIT*
 | '0'
 ;

FLOAT
 : (DIGIT+)? '.' DIGIT+
 | (DIGIT+) '.'
 ;


ASSIGN : '=';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';

ADD : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POWER : '**';

OR_OP : '|';
AND_OP : '&';

EQUALS : '==';
NEQ : '!=';
LESS : '<';
GREATER : '>';
GEQ : '>=';
LEQ : '<=';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MULT_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
POW_ASSIGN : '**=';

AND_ASSIGN : '&=';
OR_ASSIGN : '|=';

OPEN_PAREN : '(' {open();};
CLOSE_PAREN : ')' {close();};
OPEN_BRACK : '[' {open();};
CLOSE_BRACK : ']' {close();};

SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;

UNKNOWN_CHAR
 : .
 ;

fragment DIGIT
 : [0-9]
 ;

fragment SPACES
 : [\t ]+
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : '\\' SPACES? ('\r' | '\r'? '\n' | '\f')
 ;
