
public class Exercise_5 {
	public static final int SIZE = 3;
	public static void main (String [] args) {
		roof();
		
		for (int a = 1; a <= SIZE - 1; a++) {
			lines();
		upperClass();
		lowerClass();
		}
		
		lines ();
		roof();
	}
	
	public static void roof() {
		for (int a = SIZE + 2; a >= 1; a--) {
				for (int b = SIZE-(SIZE-1); b <= a; b++) {
					System.out.print(" ");
					}
			
				for (int b = SIZE + 2; b >= a; b--) {
					System.out.print("/");
					}
				
				for (int d = 1; d <= SIZE*2-4; d++) {
					System.out.print("*");
				}
				
			
				for (int b = SIZE + 2; b >= a; b--) {
					System.out.print("\\");
					} 
				
				System.out.println();
			}
	}
		
	public static void lines() {
		System.out.print("+");
		for (int c = 1; c <= SIZE*2; c++) {
			System.out.print("=*");
		}
		System.out.print("+");
		System.out.println();
	}
		
	public static void upperClass() {
		
		for (int a = SIZE; a >= 1; a--) {
			System.out.print("|");
			
			for (int b = 0; b <= a-2; b++) {
				System.out.print(".");
				
			}
			
			
			for (int c = SIZE; c >= a-0; c--) {
				System.out.print("/\\");
			}
			
			for (int b = 0; b <= a*2-3; b++) {
				System.out.print(".");
			}
			
			for (int c = SIZE; c >= a-0; c--) {
				System.out.print("/\\");
			}
			
			for (int b = 0; b <= a-2; b++) {
				System.out.print(".");
			}
			System.out.print("|");
			
			System.out.println();
		}
	}
	
public static void lowerClass() {
		
		for (int a = SIZE; a >= 1; a--) {
			System.out.print("|");
			for (int b = SIZE - 1 ; b >= a; b--) {
				System.out.print(".");
				
			}
			
			
			for (int c = 0; c <= a-1; c++) {
				System.out.print("\\/");
			}
			
			for (int b = SIZE ; b >= a*2-SIZE+1; b--) {
				System.out.print(".");
				
			}
			
			for (int c = 0; c <= a-1; c++) {
				System.out.print("\\/");
			}
			
			for (int b = SIZE - 1; b >= a; b--) {
				System.out.print(".");
				
			}
			
			System.out.print("|");
			
			System.out.println();
		}
	}

}






