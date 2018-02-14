
public class RationalNumber {
	private int numerator;
	private int denominator;
	
	public RationalNumber(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException();
		}
		int gcf = gcf(numerator,denominator);
		this.numerator = (int) numerator / gcf;
		this.denominator = (int) denominator / gcf;
	}
	
	public RationalNumber() {
		this(0,1);
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public String toString() {
		if (denominator == 1) {
			return "" + numerator;
		} 
		if (numerator == 0) {
			return "0";
		}
		return "" + numerator + "/" + denominator;
	}
	
	public int gcf(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public int lcm(int a, int b)
	{
	    return a * (b / gcf(a, b));
	}
	
	public RationalNumber add(RationalNumber other) {
		int lcm = lcm(this.denominator,other.denominator);
		RationalNumber result = new RationalNumber();
		result.denominator = lcm;
		result.numerator = this.numerator * (lcm / this.denominator) + 
						   other.numerator * (lcm / other.denominator);
		int gcf = gcf(result.numerator,result.denominator);
		result.numerator = result.numerator / gcf;
		result.denominator = result.denominator / gcf;
		return result;
	}
	
	public RationalNumber subtract(RationalNumber other) {
		int lcm = lcm(this.denominator,other.denominator);
		RationalNumber result = new RationalNumber();
		result.denominator = lcm;
		result.numerator = this.numerator * (lcm / this.denominator) - 
						   other.numerator * (lcm / other.denominator);
		int gcf = gcf(result.numerator,result.denominator);
		result.numerator = result.numerator / gcf;
		result.denominator = result.denominator / gcf;
		return result;
	}
	
	public RationalNumber multiply(RationalNumber other) {
		RationalNumber result = new RationalNumber();
		result.numerator = this.numerator * other.numerator;
		result.denominator = this.denominator * other.denominator;
		int gcf = gcf(result.numerator,result.denominator);
		result.numerator = result.numerator / gcf;
		result.denominator = result.denominator / gcf;
		return result;
	}
	
	public RationalNumber divide(RationalNumber other) {
		int temp = other.numerator;
		other.numerator = other.denominator;
		other.denominator = temp;
		return multiply(other);
	}
}
