import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CaseStudy_Maps_WordCount {
	
	public static final int OCCURENCES = 500;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(new File("hamlet.txt"));
		Map<String,Integer> wordCountMap = getCountMap(console);
		
		for (String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			if (count > OCCURENCES) {
				System.out.println(word + " occurs " + count + " times.");
			}
		}
	}
	
	public static Map<String,Integer> getCountMap(Scanner console) {
		Map<String,Integer> wordCountMap = new TreeMap<String,Integer>();
		while(console.hasNext()) {
			String word = console.next().toLowerCase();
			if (wordCountMap.containsKey(word)) {
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count+1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		return wordCountMap;
	}
} 
