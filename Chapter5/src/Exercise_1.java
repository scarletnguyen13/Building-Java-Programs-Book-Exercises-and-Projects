//INCOMPLETED
import java.util.*;
public class Exercise_1 {
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("This program translate English to Pig Latin.");
		System.out.println("Type DONE to terminate the program :)");
		System.out.print("English (type a word / sentence) --> ");
		String text = console.nextLine();
		while (!text.equalsIgnoreCase("DONE") && !text.equalsIgnoreCase("")) {
			System.out.println("Pig Latin --> " + pigLatin(text));
			System.out.print("English (type a word / sentence) --> ");
			text = console.nextLine();
		}
	}
	public static String pigLatin(String text) {
			return text;
	}
}
