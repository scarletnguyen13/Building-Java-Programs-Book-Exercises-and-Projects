public class CauseException {
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(-3));
	}
	// pre : n >= 0
	// post: returns n factorial (n!)
	public static int factorial(int n) {
	if (n < 0) {
		throw new IllegalArgumentException("negative n: " + n);
	}
	int product = 1;
	for (int i = 2; i <= n; i++) {
		product *= i;
		}
	return product;
	}
}
