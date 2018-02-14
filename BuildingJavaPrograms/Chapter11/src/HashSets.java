import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HashSets {
	public static void main(String[] args) throws FileNotFoundException {
		Set<String> words = new HashSet<String>();
		Scanner input = new Scanner(new File("hamlet.txt"));
		while(input.hasNext()) {
			words.add(input.next().toLowerCase());
		}
		
		System.out.println("Number of unique words = " + words.size());
		
		Iterator<String> itr = words.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
	}
	
	// returns true if the given list contains any duplicate elements
	public static boolean hasDuplicates(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>(list);
		return set.size() < list.size();
	}
}
