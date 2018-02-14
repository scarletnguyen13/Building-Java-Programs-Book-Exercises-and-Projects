import java.util.*;

 /*
  * Write a program that prompts for a number 
  * and displays it in Roman numerals
  */

public class Ex_1_RomanNumerals {
	public static void main (String [] args) {
		System.out.print("Choose a number from 1 - 1000: ");
		Scanner console = new Scanner (System.in);
		int num = console.nextInt();
		System.out.println(romanNumerals(num));
	}
	public static String romanNumerals(int num) {
		String roman = "";
		int temp = num;
		
		if (num < 1 || num > 1000) {
			throw new IllegalArgumentException("Invalid Number");
		}
		
		if (num >= 100 && num < 500) {
			roman += "C";
			int temp1 = num;
			temp1 = (temp1 - (temp1%100))/100;
			if (temp1 == 4) {
				roman += "D";
			}
			else if (temp1 >= 1 && temp1 <= 3) {
				for (int a = 1; a <= temp1-1; a++) {
					roman += "C";
				}
			}
		}
		else if (num >= 500 && num < 900) {
			roman += "D";
			int temp2 = num;
			temp2 = (temp2-(temp%100)) / 100;
			for (int a = 1; a <= temp2 - 5; a++) {
				roman += "C";
			}
		}
		else if (num >= 900 && num < 1000) {
			roman += "CM";
		}
		else if (num == 1000) {
			num %= 1000;
			roman += "M";
		}
		
		num -= (num - (num%100));
		
		if (num >= 10 && num < 50) {
			roman += "X";
			num /= 10;
			if (num == 4) {
				roman += "L";
			}
			else {
			for (int a = 1; a <= num-1; a++) {
				roman += "X";
				}
			}
		}
		else if (num >= 50 && num < 90) {
			roman += "L";
			num /= 10;
			for (int a = 1; a <= num-5; a++) {
				roman += "X";
				}
		}
		else if (num >= 90 && num < 100) {
			roman += "XC";
		}
		
		temp %= 10;
		if (temp >= 1 && temp <= 4) {
			roman += "I";
			if (temp == 4) {
				roman += "V";
			}
			else {
				for (int a = 1; a <= temp-1; a++) {
					roman += "I";
				}
			}
		}
		else if (temp >= 5 && temp <= 8) {
			roman += "V";
			for (int a = 1; a <= temp - 5; a++) {
				roman += "I";
			}
		}
		else if (temp == 9){
			roman += "IX";
		}
		return roman;
	}
}