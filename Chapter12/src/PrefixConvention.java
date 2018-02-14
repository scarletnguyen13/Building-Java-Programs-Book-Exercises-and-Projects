import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class PrefixConvention {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.println("This program evaluates prefix");
	    System.out.println("expressions that include the");
		System.out.println("operators +, –, *, / and %");
		System.out.println();
		System.out.print("expression? ");
		double value = evaluate(console);
		System.out.println("value = " + value);
	}
	
	// pre : input contains a legal prefix expression
	// post: expression is consumed and the result is returned
	public static double evaluate(Scanner input) {
		if (input.hasNextDouble()) {
			// base case with a simple number
			return input.nextDouble();
		} else {
			// recursive case with an operator and two operands
			String operator = input.next();
			double operand1 = evaluate(input);
			double operand2 = evaluate(input);
			return apply(operator, operand1, operand2);
		}
	}
	
	// pre : operator is one of +, –, *, / or %
	// post: returns the result of applying the given operator
	// to the given operands
	public static double apply(String operator, double operand1, double operand2) {
		if (operator.equals("+")) {
			return operand1 + operand2;
		} else if (operator.equals("-")) {
			return operand1 - operand2;
		} else if (operator.equals("*")) {
			return operand1 * operand2;
		} else if (operator.equals("/")) {
			return operand1 / operand2;
		} else if (operator.equals("%")) {
			return operand1 % operand2;
		} else {
			throw new IllegalArgumentException("bad operator: " + operator);
		}
	}
}
