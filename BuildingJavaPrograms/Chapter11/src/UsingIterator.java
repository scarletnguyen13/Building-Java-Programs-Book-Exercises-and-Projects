import java.util.ArrayList;
import java.util.*;

public class UsingIterator {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Scarlet");
		list.add("Nguyen");
		list.add("BAbebola");
		removeEvenLength(list);
		System.out.println(list);
	}
	
	// removes all strings of even length from the given linked list
	public static void removeEvenLength(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String element = i.next();
			if (element.length() % 2 == 0) {
				i.remove();
			}
		}
	}
}
