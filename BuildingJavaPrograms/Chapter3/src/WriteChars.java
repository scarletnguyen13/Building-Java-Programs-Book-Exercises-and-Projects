
public class WriteChars {
	public static void main (String [] args) {
		writeChars('=', 20);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
		writeChars('>', i);
		writeChars(' ', 20 - 2 * i);
		writeChars('<', i);
		System.out.println();
		}
	}
	
	public static void writeChars(char symbol, int number) {
		for (int count = 1; count <= number; count++) {
			System.out.print(symbol);
		}
	}
}
