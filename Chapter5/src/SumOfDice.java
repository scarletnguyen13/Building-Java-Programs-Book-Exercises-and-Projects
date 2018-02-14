import java.util.*;
public class SumOfDice {
	public static void main (String [] args) {
		Random r = new Random();
		int sum = 0; // set to 0 to make sure we enter the loop
		while (sum != 7) {
		// roll the dice once
		int roll1 = r.nextInt(6) + 1;
		int roll2 = r.nextInt(6) + 1;
		sum = roll1 + roll2;
		System.out.println(roll1 + " + " + roll2 + " = " + sum);
		}
	}
}
