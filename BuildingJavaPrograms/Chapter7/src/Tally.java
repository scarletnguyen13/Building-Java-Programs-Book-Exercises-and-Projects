// Reads a series of values and reports the frequency of
// occurrence of each value.

import java.io.*;
import java.util.*;

public class Tally {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("tally.dat"));
		int[] count = new int[5];
		while (input.hasNextInt()) {
			int next = input.nextInt();
			count[next]++;
		}
		System.out.println("Value\tOccurrences");
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "\t" + count[i]);
		}
	}
}