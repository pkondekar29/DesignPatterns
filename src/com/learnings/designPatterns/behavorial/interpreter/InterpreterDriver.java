package com.learnings.designPatterns.behavorial.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Interpreter is used to represent as grammar. This goes hand in hand to interpret a sentence. Also, can be used for parsing.
 * It is used to describe an abstract syntax tree.
 * Ex. - java.util.Pattern, java.text.Format
 * 
 * Design - 
 * 1. AbstractExpression -> declares interface for executing the operation
 * 2. Interpret -> opration is an interpret method.
 * 3. TerminalExpression -> The expression is then used broken down into terminal expression
 * 4. NonterminalExpression -> The intermediate expressions are the compound expressions which can be used to again brek down recurssively till they become terminal expression.
 * 
 * UML -
 * Context, AbstractExpression, TerminalExpression, NonTerminalExpression, Client 
 * 
 */
public class InterpreterDriver {

	/**
	 * <b>Regex patterns -</b><br><br>
	 * 
	 * abc… Letters<br>
	 * 123…	Digits<br>
	 * \d	Any Digit<br>
	 * \D	Any Non-digit character<br>
	 * .	Any Character<br>
	 * \.	Period<br>
	 * [abc]	Only a, b, or c<br>
	 * [^abc]	Not a, b, nor c<br>
	 * [a-z]	Characters a to z<br>
	 * [0-9]	Numbers 0 to 9<br>
	 * \w	Any Alphanumeric character<br>
	 * \W	Any Non-alphanumeric character<br>
	 * {m}	m Repetitions<br>
	 * {m,n}	m to n Repetitions<br>
	 * *	Zero or more repetitions<br>
	 * +	One or more repetitions<br>
	 * ?	Optional character<br>
	 * \s	Any Whitespace<br>
	 * \S	Any Non-whitespace character<br>
	 * ^…$	Starts and ends. <i>Note that this is different than the hat used inside a set of bracket [^...] for excluding characters</i><br>
	 * (…)	Capture Group<br>
	 * (a(bc))	Capture Sub-group<br>
	 * (.*)	Capture all<br>
	 * (abc|def)	Matches abc or def<br>
	 * 
	 */
	public static void main(String[] args) {
		String input = "Hello world! How are you?";
		Pattern pattern = Pattern.compile("Hello|How");		// grammar which we want to find
		Matcher mather = pattern.matcher(input);
		
		while(mather.find()) {
			System.out.println(mather.group());
		}
	}
	
}
