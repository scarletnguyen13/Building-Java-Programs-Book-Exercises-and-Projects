
public class Exercise_7 {
	public static final int SIZE = 10;
	public static void main (String [] args) {
		lines();
		top();
		front();
	}
	
	public static void lines () {
		for (int a = 1; a <= SIZE+1; a++) {
			System.out.print(" ");
		}
		System.out.print("+");
		for (int a = 1; a<=SIZE*3; a++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
	
	public static void top () {
		for (int a = 1; a <= SIZE; a++) {
			for (int b = 1; b <= SIZE+1-a; b++) {
				System.out.print(" ");
			}
			System.out.print("/");
			
			for (int c = SIZE*3-3; c >= a*3-2; c--) {
					System.out.print(" ");
			}
			
				System.out.print("___/");
			for (int d = 0; d <= a-2; d++) {
				System.out.print("__/");
			}
			
			for (int d = 0; d <= a-2; d++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
	
	public static void front () {
		System.out.print("+");
		for (int a = 1; a<=SIZE*3; a++) {
			System.out.print("-");
		}
		System.out.print("+");
		
		for (int a = 1; a <= SIZE; a++) {
			System.out.print("/");
		}
		System.out.println();
		
		for (int b = 1; b <= SIZE/2; b++) {
			System.out.print("|");
			 
			for (int c = 1; c <= 4; c++) {
				System.out.print(" ");
			}
			System.out.print("Building Java Programs");
			
			for (int c = 1; c <= SIZE*3-26; c++) {
				System.out.print(" ");
			}
			System.out.print("|");
			
			for (int d = SIZE+1; d >= b*2; d--) {
				System.out.print("/");
			}
			
			
			System.out.println();
		}
		System.out.print("+");
		for (int a = 1; a<=SIZE*3; a++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
}
