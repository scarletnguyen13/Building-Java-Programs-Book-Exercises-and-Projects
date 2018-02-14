
public class FixingRoundOffError {
	// Uses System.out.printf to correct roundoff errors.
	 public static void main(String[] args) {
	 double n = 1.0;
	 for (int i = 1; i <= 10; i++) {
	 n += 0.1;
	 System.out.printf("%3.1f\n", n);
	 	}
	}
}
