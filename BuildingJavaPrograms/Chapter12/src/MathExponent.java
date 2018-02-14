
public class MathExponent {
	public static void main(String[] args) {
		System.out.println(pow(2,5));
		System.out.println(gcd(132,60));
	}
	
	// pre : y >= 0
	// post: returns x∧y
	public static int pow(int x, int y) {
		if (y < 0) {
			throw new IllegalArgumentException("negative exponent: " + y);
		} else if (y == 0) {
			return 1;
		} else if (y % 2 == 0) {
			return pow(x * x, y / 2);
		} else {
			return pow(x,y-1)*x;
		}
	}
	
	// pre: x >= 0, y >= 0
	// post: returns the greatest common divisor of x and y
	public static int gcd(int x, int y) {
		if (x < 0 || y < 0) {
			// recursive case with negative value(s)
			return gcd(Math.abs(x), Math.abs(y));
		} else if (y == 0) {
			//base case
			return x;
			
		} else {
			//recursive case
			return gcd(y, x%y);
		}
	}
}
