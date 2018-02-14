import java.util.*;
public class HailstoneSequence {
	public static void main (String[] args) {
		System.out.println("This program computes a \nHailstone Sequence");
		System.out.println();
		System.out.print("What is your first value? ");
		Scanner console = new Scanner (System.in);
		int value = console.nextInt();
		System.out.print("What is your length of sequence? ");
		int length = console.nextInt();
		System.out.println();
		printHailstoneMaxMin(value,length);
	}
	
	public static void printHailstoneMaxMin (int value, int length) {
		int min = value;
		int max = value;
		
		System.out.print(value + " ");
		for (int a = 1; a <= length - 1; a++) {		
			if (value % 2 == 0) {
				
				value /= 2;
			}
			else if (value % 2 == 1) {
				value = 3*value+1; 
			}
			
			if (value > max) {
				max = value;
			}
			else if (value < min) {
				min = value;
			}
			System.out.print(value + " ");
		}
		
		for (int b = 1; b <= 2; b++) {
		System.out.println();
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}
}
