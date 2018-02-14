
public class TextLength {
	public static void main (String [] args) {
		//padString("hello",8);
		System.out.println("hello there!".length());
	    }
	
	
	
	public static String padString (String text, int length) {
		
		for (int a = 0; a <= length-text.length(); a++) {
			System.out.print(" ");
		}
		System.out.print(text);
	     return text;
	}
}
