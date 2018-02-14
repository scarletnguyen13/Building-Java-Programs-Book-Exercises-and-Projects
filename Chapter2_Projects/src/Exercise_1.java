
public class Exercise_1 {
	public static void main (String [] args) {
		
		for (int i = 0; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			
			for (int j = 6; j >= 6 - i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 12 - i*2; j++) {
				System.out.print("/");
			}
			
			for (int j = 12; j >= 12 - i*2; j--) {
				System.out.print("\\");
			}
			
			for (int j = 6; j >= 6 - i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
