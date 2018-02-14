// Finds the sum of a sequence of numbers.

 import java.util.*;
import java.util.*;
 public class ExamineNumbers1 {
 public static void main(String[] args) {
 System.out.println("This program adds a sequence of");
 System.out.println("numbers.");
 System.out.println();

 Scanner console = new Scanner(System.in);

 System.out.print("How many numbers do you have? ");
 int totalNumber = console.nextInt();

 double sum = 0.0;
 for (int i = 1; i <= totalNumber; i++) {
 System.out.print(" #" + i + "? ");
 double next = console.nextDouble();
 sum += next;
 }
 System.out.println();

 System.out.println("sum = " + sum);
 }
 }