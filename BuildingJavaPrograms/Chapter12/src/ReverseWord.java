import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReverseWord {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("Reverse.txt"));
		System.out.println("Original Version:");
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		System.out.println("\nReversed Version:");
		Scanner in2 = new Scanner(new File("Reverse.txt"));
		reverse(in2);
	}
	
	public static void reverse(Scanner input) {
		if (input.hasNextLine()) {
			// recursive case (nonempty file)
			String line = input.nextLine();
			reverse(input);
			System.out.println(line);
		}
	}
}
