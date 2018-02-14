public class Exercise_4 {
	
	public static final int SIZE = 5;
	
	public static void main (String [] args) {
		
		for (int a = SIZE; a >= 1; a--) {
			for (int b = 1; b <= a*5-3; b++) {
				System.out.print(" ");
			}
			System.out.print("o");
			System.out.print("  ");
			for ( int c = 1; c <= 6; c++) {
				System.out.print("*");
			}
			
			
			for (int f = SIZE * 5 ; f >= a*5+1; f--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			System.out.println();
			
			for (int d = 1; d <= a*5-4; d++) {
				System.out.print(" ");
			}
			System.out.print("/|\\");
			System.out.print(" ");
			System.out.print("*");
			
			for (int f = SIZE*5 ; f >= a*5-4; f--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			System.out.println();
			
			for (int e = 1; e <= a*5-4; e++) {
				System.out.print(" ");
			}
			System.out.print("/ \\");
			System.out.print(" ");
			System.out.print("*");
			
			for (int f = SIZE * 5 ; f >= a*5-4; f--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			System.out.println();
			
			
		}
		
		for (int f = 1; f <= SIZE * 5 + 7; f++) {
				System.out.print("*");
			}
			System.out.println();
		
	}
}
