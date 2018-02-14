import java.util.*;
public class SmallerDivisor {
	public static void main (String [] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("What is your number? ");
		int number = console.nextInt();
		int divisor = 2;
		while (number % divisor != 0) {
		divisor++;
		}
		System.out.println(divisor);
	}
}
