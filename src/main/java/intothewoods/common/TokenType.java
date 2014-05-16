package intothewoods.common;

/**
 * Type of a token.
 * 
 * See language specification.
 */
public enum TokenType {

	BOOL_LITERAL,
	BYTE_LITERAL,
	INT_LITERAL,
	FLOAT_LITERAL,
	STRING_LITERAL,
	NAME,
	TYPE,
	VOID,
	FUNCTION_KEYWORD,
	RETURN_KEYWORD,
	IF_KEYWORD,
	ELSE_KEYWORD,
	END_KEYWORD,
	WHILE_KEYWORD,
	COMMENT,
	LEFT_PARENTHESIS,
	RIGHT_PARENTHESIS,
	COMMA,
	NEW_LINE,
	EQUAL_SIGN,
	COLLON,
	EOF,

	/* Types of imaginary tokens */
	NIL,
	LITERAL

}
