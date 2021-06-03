/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : python3-parser; an ANTLR4 grammar for Python 3
 *                https://github.com/bkiers/python3-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
parser grammar MyParser;

options {
    tokenVocab=MyLexer;
}

from_file: (NEWLINE | statement)* EOF;

fun_def: 'fun' NAME parameters ':' body;

parameters: '(' (param (',' param)*)? ')';
param: (or_record)? NAME;

statement: simple_statement | fun_def | if_statement | while_statement | for_statement;

newline: NEWLINE;
indent: INDENT;
dedent: DEDENT;
simple_statement: (expression | return_statement) newline;
expression: or_record (augassign or_record | ('=' or_record)*);
augassign: ('+=' | '-=' | '*=' | '/=' | '%=' | '**=' | '&=' | '|=');
return_statement: 'return' (or_record)?;

local_var: NAME;


if_statement: 'if' or_record ':' body ('else' ':' body)?;
while_statement: 'while' or_record ':' body;
for_statement: 'for' local_var 'in' record_list ':' body;

body: simple_statement | newline indent statement+ dedent;

or_record: and_record ('or' and_record)*;
and_record: not_record ('and' not_record)*;
not_record: 'not' not_record | comparison;
comparison: expr (comp_op expr)*;
comp_op: '=='|'!='|'<'|'>'|'<='|'>='|'in'|'not' 'in';
expr: and_expr ('|' and_expr)*;
and_expr: arithmetic_expr ('&' arithmetic_expr)*;
arithmetic_expr: term (('+'|'-') term)*;
term: factor (('*'|'/'|'%') factor)*;
factor: ('+'|'-') factor | power;
power: atom_expr ('**' factor)?;
atom_expr: atom parentheses*;
number: NUMBER;
string: STRING+;
none : 'None';
bool: 'True' | 'False';
atom: (NAME | number | string | none | bool | list);
parentheses: '(' (record_list)? ')' | '[' record_list ']';
list: '[' (record_list)? ']';
record_list: or_record (',' or_record)* (',')?;
