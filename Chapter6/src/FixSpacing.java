// This program removes excess spaces in an input file.
import java.io.*;
import java.util.*;

public class FixSpacing {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("words.txt"));
		PrintStream output = new PrintStream(new File("words2.txt"));
		while (input.hasNextLine()) {
			String text = input.nextLine();
			echoFixed(text, output);
			echoFixed(text, System.out);
		}
	}

	public static void echoFixed(String text, PrintStream output) {
		Scanner data = new Scanner(text);
		if (data.hasNext()) {
			output.print(data.next());
			while (data.hasNext()) {
				output.print(" " + data.next());
			}
		}
		output.println();
	}
}