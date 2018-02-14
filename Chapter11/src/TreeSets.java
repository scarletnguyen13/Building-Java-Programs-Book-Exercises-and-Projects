import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TreeSets {
	public static void main (String[] args) throws FileNotFoundException {
		Set<String> words = new TreeSet<String>();
		Scanner in = new Scanner(new File("hamlet.txt"));
		while(in.hasNext()) {
			String word = in.next().toLowerCase();
			if (word.startsWith("a") && word.length() == 3) {
				words.add(word);
			}
		}
		System.out.println(words);
	}
}
