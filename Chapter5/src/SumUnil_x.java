import java.util.*;
public class SumUnil_x {
	public static void main (String [] args) {
		Scanner console = new Scanner(System.in);
		int sum = 0;
		System.out.print("next integer (-1 to quit)? ");
		int number = console.nextInt();
		while (number != -1) {
			sum += number;
			System.out.print("next integer (-1 to quit)? ");
			number = console.nextInt();
		}
		System.out.println("sum = " + sum);
	}
}
