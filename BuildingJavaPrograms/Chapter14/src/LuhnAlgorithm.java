/*
 * Visa card numbers always begin with 4, and a valid Visa card
 * number always passes a digit-sum test known as the Luhn checksum 
 * algorithm.
 * Luhn’s algorithm states that if you add the digits of any valid 
 * credit card number in a certain way, the sum will be a multiple of 10. 
 * Systems that accept credit cards perform a Luhn test before they 
 * contact the credit card company for final verification of the number. 
 * This test allows them to filter out fake or mistyped credit card
 * numbers.
 * 
 * The algorithm for adding the digits can be described as follows: 
 * Consider each digit of the credit card number to have a zero-based 
 * index: The first is at index 0, and the last is at index 15. 
 * Start from the rightmost digit and process each digit one at a time. 
 * For each digit at an odd-numbered index (the 15th digit, 13th digit, etc.), 
 * simply add that digit to the cumulative sum. For each digit at an 
 * even-numbered index (the 14th, 12th, etc.), 
 * double the digit’s value. If that doubled value is less than 10, 
 * add it to the sum; if the doubled value is 10 or greater, add each 
 * of its digits separately into the sum.
 */
public class LuhnAlgorithm {
	public static void main(String[] args) {
		System.out.println(isValidCC("4408041274369853"));
	}
	
	// returns whether the given string can be a valid Visa
	// card number according to the Luhn checksum algorithm
	public static boolean isValidCC(String text) {
		int sum = 0;
		for (int i = text.length() - 1; i >= 0; i--) {
			int digit = Integer.parseInt(text.substring(i, i + 1));
			if (i % 2 == 0) { // double even digits
				digit *= 2;
			}
			sum += (digit / 10) + (digit % 10);
		}
		// valid numbers add up to a multiple of 10
		return sum % 10 == 0 && text.startsWith("4");
	}	
}
