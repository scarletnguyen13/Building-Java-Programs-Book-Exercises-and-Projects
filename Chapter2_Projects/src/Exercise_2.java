
public class Exercise_2 {
	public static void main (String [] args) {
		lines();
		upperPart();
		lines();
		lowerPart();
		lines();
	}
		
	public static void lines () {
		System.out.print("+");
			for (int b = 1; b <= 6; b++) {
				System.out.print("-");
			}
			System.out.print("+");
			
			System.out.println();
	}
	
	
	public static void upperPart () {
		for (int a = 1; a <= 2; a++) {
			
			
			for (int d = 0; d <= 2; d++) {
				System.out.print("|");
								
					for (int j = 1; j <= 2 - d; j++) {
						System.out.print(" ");
					}
					System.out.print("^");
					
					for (int j = 0; j <= 2 * d - 1; j++) {
						System.out.print(" ");
					}
					System.out.print("^");
					
					for (int j = 1; j <= 2 - d; j++) {
						System.out.print(" ");
					}
			System.out.print("|");
			
			System.out.println();
			
			}
			
			}
	
	}
		
	public static void lowerPart () {
		for (int a = 1; a <= 2; a++) {
			
			
			for (int d = 2; d >= 0; d--) {
				System.out.print("|");
								
					for (int j = 1; j <= 2 - d; j++) {
						System.out.print(" ");
					}
					System.out.print("v");
					
					for (int j = 0; j <= 2 * d - 1; j++) {
						System.out.print(" ");
					}
					System.out.print("v");
					
					for (int j = 1; j <= 2 - d; j++) {
						System.out.print(" ");
					}
			System.out.print("|");
			
			System.out.println();
			
			}
			
			}
	
	}
		
	}

