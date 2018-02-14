// This program constructs a jagged two-dimensional array
// that stores Pascal's Triangle. It takes advantage of the
// fact that each value other than the 1s that appear at the
// beginning and end of each row is the sum of two values
// from the previous row.

public class PascalsTriangle {
	public static void main(String[] args) {
		int[][] triangle = new int[11][];
		fillIn(triangle);
		print(triangle);
	}

	public static void fillIn(int[][] triangle) {
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1]
						+ triangle[i - 1][j];
			}
		}
	}

	public static void print(int[][] triangle) {
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}