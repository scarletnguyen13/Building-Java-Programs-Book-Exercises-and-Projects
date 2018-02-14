
public class Inversions {
	public static void main(String[] args) {
		int[] data = {4,3,2,1};
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					System.out.println("(" + data[i] + ", " + data[j] + ")");
				}
			}
		}
	}
}
