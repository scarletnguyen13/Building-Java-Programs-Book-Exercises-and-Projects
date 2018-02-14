
public class Exercise_1 {
	public static void main (String[]args) {
		tree(3,4);
	}
	
	public static void tree(int segs, int height) {
		for (int d = 1; d <= segs; d++) {
			for (int a = 1; a <= height; a++) {
				for (int b = d-2; b <= height - a+1; b++) {
					System.out.print(" ");
			}
				for (int b = height+d*2-2; b >= height -(a*2-2); b--) {
					System.out.print("*");
			}
			System.out.println();
			}
		}
		
		for (int a = 1; a<=2; a++) {
			for (int b = 1 ; b<=height+2;b++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int g = 1; g<=height-1; g++) {
			System.out.print(" ");
		}
		
		for (int a = 1; a<=7; a++) {
			System.out.print("*");
		}
	}
}

