import javax.print.attribute.standard.PrinterLocation;
import java.util.Arrays;

public class testing {
	public static void main (String[] args) {
		int[] list = {1,4,6,2,62,5};
		for (int n : list) {
			System.out.println(n);
		}
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
	}
}
