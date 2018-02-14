import java.util.*;

 public class Pick {
	 public static void main(String[] args) {
		 System.out.println("This program picks numbers from");
		 System.out.println("1 to 10 until a particular");
		 System.out.println("number comes up.");
		 System.out.println();

		 Scanner console = new Scanner(System.in);
		 Random r = new Random();

		 System.out.print("Pick a number between 1 and 10——> ");
		 int number = console.nextInt();

		 int result = -1; // set to –1 to make sure we enter the loop
		 int count = 0;
		 while (result != number) {
			 result = r.nextInt(10) + 1; // random number from 1–10
			 System.out.println("next number = " + result);
			 count++;
		 }
		 System.out.println("Your number came up after " +
				 count + " times");
	 }
 }
