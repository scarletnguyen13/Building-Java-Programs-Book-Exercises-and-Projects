// Variation of ShowSum2 that prompts for a file name.
import java.io.*;
import java.util.*;

public class ShowSum4 {
public static void main(String[] args) throws FileNotFoundException {
	System.out.println("of numbers from a file.");
	System.out.println();
	
	Scanner console = new Scanner(System.in);
	System.out.print("What is the file name? ");
	String name = console.nextLine();
	Scanner input = new Scanner(new File(name));
	System.out.println();
	
	double sum = 0.0;
	int count = 0;
	while (input.hasNextDouble()) {
		double next = input.nextDouble();
		count++;
		System.out.println("number " + count + " = " + next);
		sum += next;
	}
	System.out.println("Sum = " + sum);
	}
}