import java.util.List;
import java.util.Collections;
import java.util.*;
import java.awt.*;

public class Sieve_of_Eratosthenes {
	public static void main(String[] args) {
		System.out.println("This program will tell you all prime");
		System.out.println("numbers up to a given maximum.\n");
		Scanner console = new Scanner(System.in);
		System.out.print("Max: ");
		int max = console.nextInt();
		System.out.println("Result: " + sieve(max));
	}
	
	public static List<Integer> sieve(int max) {
		List<Integer> numbers = new LinkedList<Integer>();
		List<Integer> primes = new LinkedList<Integer>();
		
		primes.add(2);
		for (int a = 3; a <= max; a++) {
			if (a % 2 == 1) {
				numbers.add(a);
			}
		}
		int front = numbers.get(0);
		while(!numbers.isEmpty() && front <= Math.sqrt(max)) {
			front = numbers.remove(0);
			primes.add(front);
			Iterator<Integer> itr = numbers.iterator();
			while (itr.hasNext()) {
				int current = itr.next();
				if (current % front == 0) {
					itr.remove();
				}
			}
		}
		primes.addAll(numbers);
		return primes;
 	}
}
