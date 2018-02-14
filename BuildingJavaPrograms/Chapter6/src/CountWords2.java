// Variation of CountWords that prompts for a file name.

import java.io.*;
import java.util.*;

public class CountWords2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner input = getInput(console);

		// and count words
		int count = 0;
		while (input.hasNext()) {
			String word = input.next();
			count++;
		}
		System.out.println("total words = " + count);
	}

// Prompts the user for a legal file name; creates and
// returns a Scanner tied to the file
	public static Scanner getInput(Scanner console) throws FileNotFoundException {
		System.out.print("input file name? ");
		File f = new File(console.nextLine());
		while (!f.canRead()) {
			System.out.println("File not found. Try again.");
			System.out.print("input file name? ");
			f = new File(console.nextLine());
		}
// now we know that f is a file that can be read
		return new Scanner(f);
	}
}