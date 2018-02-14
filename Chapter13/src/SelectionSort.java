import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers = {3,27,1,7,1,4,71,3,6,32};
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length-1;i++) {
			int smallest = i;
			for (int j = i + 1;j < numbers.length;j++) {
				if (numbers[j] < numbers[smallest]) {
					smallest = j;
				}
			}
			swap(numbers,i,smallest);
		}
	}
	
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
