import java.util.*;

public class CollectionsBinarySearch {
	public static void main(String[] args) {
		// binary search on an array
		int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
		int index = Arrays.binarySearch(numbers, 29);
		System.out.println("29 is found at index " + index);
		
		// binary search on an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-3);
		list.add(2);
		list.add(8);
		list.add(12);
		list.add(17);
		list.add(29);
		list.add(44);
		list.add(58);
		list.add(79);
		int index2 = Collections.binarySearch(list, 29);
		System.out.println("29 is found at index " + index2);
		
		// demonstrate the Arrays.sort method
		String[] strings = {"c", "b", "g", "h", "d", "f", "e", "a"};
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		String[] strings2 = {"Foxtrot", "alpha", "echo", "golf",
				"bravo", "hotel", "Charlie", "DELTA"};
		//Sort based on First Letter
		Arrays.sort(strings2, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Before Reversed: " + Arrays.toString(strings2));
		
		Arrays.sort(strings2, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("After Reversed:  " + Arrays.toString(strings2));
	}
}
