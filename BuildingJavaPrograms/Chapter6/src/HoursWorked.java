// This program reads an input file of hours worked by various
// employees and reports the total hours worked by each.

import java.io.*;
import java.util.*;

public class HoursWorked {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("hours.txt"));
		process(input);
	}	

	public static void process(Scanner input) {
		while (input.hasNext()) {
			String name = input.next();
			double sum = 0.0;
			while (input.hasNextDouble()) {
				sum += input.nextDouble();
			}
			System.out.println("Total hours worked by " + name
					+ " = " + sum);
		}
	}
 }