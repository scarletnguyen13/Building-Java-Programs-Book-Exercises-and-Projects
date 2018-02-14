import java.util.*;
public class CharCounts {
	public static void main (String [] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("This program will define the \nnumber of times a character \noccurs in a string");
		System.out.println();
		System.out.print("Your String: ");
		String text = console.next();
		System.out.print("Your Unicode Number: ");
		int code = console.nextInt();
		char character = (char) code;
		int found = count(text, character);
		System.out.println(found);
	}
	
	public static int count(String text, char c) {
		int found = 0;
		for (int i = 0; i < text.length(); i++) {
		if (text.charAt(i) == c) {
		found++;
		}
		}
		return found;
		}
}
