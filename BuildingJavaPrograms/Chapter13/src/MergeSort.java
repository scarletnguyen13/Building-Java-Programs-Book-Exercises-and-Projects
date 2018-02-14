import java.util.*;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = {14, 32, 67, 76, 23, 41, 58, 85};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	// Places the elements of the given array into sorted order
	// using the merge sort algorithm.
	// post: array is in sorted (nondecreasing) order
	public static void mergeSort(int[] a) {
		// at start of mergeSort method
		System.out.println("sorting " + Arrays.toString(a));
		if (a.length > 1) {
			// split array into two halves
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			// recursively sort the two halves
			mergeSort(left);
			mergeSort(right);
			// merge the sorted halves into a sorted whole
			merge(a, left, right);
		}
	}
	
	// Merges the given left and right arrays into the given
	// result array. Second, working version.
	// pre : result is empty; left/right are sorted
	// post: result contains result of merging sorted lists.
	public static void merge(int[] result, int[] left, int[] right) {
		// at start of merge method
		System.out.println("merging " + Arrays.toString(left) +
		" and " + Arrays.toString(right));
		int i1 = 0; // index into left array
		int i2 = 0; // index into right array
		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length &&
				left[i1] <= right[i2])) {
				result[i] = left[i1]; // take from left
				i1++;
			} else {
				result[i] = right[i2]; // take from right
				i2++;
			}
		}
	}
}
