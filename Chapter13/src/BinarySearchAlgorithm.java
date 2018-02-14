
public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		
	}
	
	// Binary search algorithm that works with int.
	// Returns an index at which the target
	// appears in the given input array, or insertion point-1 if not found.
	// pre: array is sorted.
	public static int binarySearch(int[] numbers, int target) {
		int min = 0;
		int max = numbers.length - 1;
		while (min <= max) {
			int mid = (max + min) / 2;
			if (numbers[mid] == target) {
				return mid; // found it!
			} else if (numbers[mid] < target) {
				min = mid + 1; // too small
			} else { // numbers[mid] > target
				max = mid - 1; // too large
			}
		}
		return -min - 1; // not found
	}
	
	// Recursive binary search algorithm that works with int recursively.
	// Returns an index at which the target
	// appears in the given input array, or insertion point-1 if not found.
	// pre: array is sorted.
	public static int binarySearchR(int[] numbers, int target) {
		return binarySearchR(numbers, target, 0, numbers.length - 1);
	}
	
	// private recursive helper to implement binary search
	private static int binarySearchR(int[] numbers, int target,
										int min, int max) {
		if (min > max) {
			//base case
			return -min - 1;
		} else {
			//recursive case
			int mid = (min + max) /2;
			if (numbers[mid] == target) {
				return mid;
			} else if (numbers[mid] < target) {
				return binarySearchR(numbers,target,mid + 1, max);
			} else {
				return binarySearchR(numbers,target,min, mid-1);
			}
		}
	}
	
	// Binary search algorithm that works with Strings.
	// Returns the index at which the given target String
	// appears in the given input array, or insertion point–1 if not found.
	// pre: array is sorted
	public static int binarySearch(String[] strings, String target) {
		int min = 0;
		int max = strings.length - 1;
		while (min <= max) {
			int mid = (max + min) / 2;
			int compare = strings[mid].compareTo(target);
			if (compare == 0) {
				return mid; // found it!
			} else if (compare < 0) {
				min = mid + 1; // too small
			} else { // compare > 0
				max = mid - 1; // too large
			}
		}
		return -min-1; // not found
	}
}
