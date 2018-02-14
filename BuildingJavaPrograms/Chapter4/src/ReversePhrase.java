import java.util.*;
public class ReversePhrase {
	public static void main (String [] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("This program will reverse \nyour input word");
		System.out.println();
		System.out.print("Input Word: ");
		String phrase = console.next();
		System.out.println(reverse(phrase));
	}
	public static String reverse(String phrase) {
		String result = "";
		for (int i = 0; i < phrase.length(); i++) {
		result = phrase.charAt(i) + result;
		}
		return result;
		}
}
