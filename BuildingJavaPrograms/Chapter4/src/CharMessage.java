
public class CharMessage {
	public static void main (String [] args) {
		printVertical("I Love You");
	}
	public static void printVertical(String message) {
		for (int i = 0; i < message.length(); i++) {
		char ch = message.charAt(i);
		System.out.println(ch);
		}
		}
}
