import java.util.*;
import java.awt.*;
import java.awt.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Comparator;

public class CaseStudy_VocabTest {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in1 = new Scanner(new File("test1.txt"));
		Scanner in2 = new Scanner(new File("test2.txt"));
		
		ArrayList<String> list1 = getWords(in1);
		ArrayList<String> list2 = getWords(in2);	
		
		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		
		//ArrayList<String> common = getOverLap(list1, list2);
	}
	
	public static ArrayList<String> getWords(Scanner scanner) {
		scanner.useDelimiter("[^a-zA-Z']+");
		ArrayList<String> collection = new ArrayList<String>();
		while(scanner.hasNext()) {
			collection.add(scanner.next().toLowerCase());
		}
		Collections.sort(collection);
		
		ArrayList<String> result = new ArrayList<String>();
		if (collection.size() > 0) {
			result.add(collection.get(0));
			for (int a = 1; a < collection.size(); a++) {
				if (!collection.get(a).equals(collection.get(a-1))) {
					result.add(collection.get(a));
				}
			}
		}
		return result;
	}
/*	
	public static ArrayList<String> getOverLap(ArrayList list1, ArrayList list2) {
		ArrayList<String> result = new ArrayList<String>();
		int i1 = 0;
		int i2 = 0;
		while (i1 < list1.size() && i2 < list2.size()) {
			int num = list1.get(i1).compareTo(list2.get(i2));
			if (num == 0) {
				result.add(list1.get(i1));
				i1++;
				i2++;
			} else if (num < 0) {
				i1++;
			} else { // num > 0
				i2++;
			}
		}
		return result;
	}
*/
}	
