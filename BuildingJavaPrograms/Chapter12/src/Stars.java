
public class Stars {
	public static void main(String[] args) {
		writeStars(10);
		writeStars2(3);
	}
	
	public static void writeStars(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void writeStars2(int n) {
		if (n == 0) {
			System.out.println();
		} else {
			System.out.print("*");
			writeStars2(n-1);
		}
	}
}
