public class Exercise_3 {
	public static void main (String [] args) {
		lines();
		upperPart();
		lowerPart();
		lines();
		lowerPart();
		upperPart();
		lines();
	}
		
	public static void lines () {
		System.out.print("+");
			for (int b = 1; b <= 9; b++) {
				System.out.print("-");
			}
			System.out.print("+");
			
			System.out.println();
	}
	
	
	public static void upperPart () {
		for (int d = 0; d <= 3; d++) {
			System.out.print("|");
							
				for (int j = 1; j <= 4 - d; j++) {
					System.out.print(" ");
				}
				

				for (int f = 0; f <= d-1; f++) {
					System.out.print("/");
				}
				
				System.out.print("*");
				
				for (int f = 0; f <= d-1; f++) {
					System.out.print("\\");
				}
				
				for (int j = 1; j <= 4 - d; j++) {
					System.out.print(" ");
				}
				
		System.out.print("|");
		
		System.out.println();
		
		}
		
		}
	

		
	public static void lowerPart () {
		for (int d = 3; d >= 0; d--) {
			System.out.print("|");
							
				for (int j = 1; j <= 4 - d; j++) {
					System.out.print(" ");
				}
				

				for (int f = 0; f <= d-1; f++) {
					System.out.print("\\");
				}
				
				System.out.print("*");
				
				for (int f = 0; f <= d-1; f++) {
					System.out.print("/");
				}
				
				for (int j = 1; j <= 4 - d; j++) {
					System.out.print(" ");
				}
				
		System.out.print("|");
		
		System.out.println();
		
		}
	}
		
	}

