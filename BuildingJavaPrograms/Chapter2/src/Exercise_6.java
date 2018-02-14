
public class Exercise_6 {
	public static final int SIZE = 4;
	public static void main (String [] args) {
		columns();
		upTop();
		downTop();
		columns();
		mid();
		upTop();
	}
	
	public static void columns() {
		for (int a = 1; a <= SIZE; a++) {
			for (int b = 1; b <= SIZE*3; b++) {
				System.out.print(" ");
			}
			System.out.print("||");
			
			System.out.println();
		}
	}
	
	public static void upTop() {
		for (int a = SIZE; a >= 1; a--) {
			for (int b = 1; b <= a*3-3; b++) {
				System.out.print(" ");
			}
			System.out.print("__/");
			
			for (int c = SIZE*3-3; c >= a*3-2; c--) {
				System.out.print(":");
			}
			System.out.print("||");
			
			for (int c = SIZE*3-3; c >= a*3-2; c--) {
				System.out.print(":");
			}
			
			System.out.print("\\__");
			
			System.out.println();

		}
		
		System.out.print("|");
		for (int f = 1; f <= SIZE*6; f++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
	}
	
	public static void downTop() {
		for (int a = SIZE; a >= 1; a--) {
			for (int b = SIZE+1; b >= a*2-(SIZE-2); b--) {
				System.out.print(" ");
			}
			System.out.print("\\_");
			
			for (int c = SIZE+1; c <= a*2+(SIZE*2-1); c++) {
				System.out.print("/\\");
			}
			System.out.print("_/");
			
			System.out.println();
		}
	}
	
	public static void mid() {
		for (int a = 1; a <= SIZE*SIZE; a++) {
			for (int b = 1; b <= SIZE*3-3; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 2; c++) {
				System.out.print("|%%|");
			}
			System.out.println();
		}
	}
}
