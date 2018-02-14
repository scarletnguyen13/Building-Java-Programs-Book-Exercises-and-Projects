import java.util.Arrays;
import java.util.*;
import java.awt.*;

public class ComparatorsCases {
	public static void main(String[] args) {
		String[] strings2 = {"Foxtrot", "alpha", "echo", "golf",
				"bravo", "hotel", "Charlie", "DELTA"};
		//Sort based on a string's length
		// sort array of strings by length using Comparator
		Arrays.sort(strings2, new LengthComparator());
		System.out.println(Arrays.toString(strings2));
		System.out.println();
		//Point Comparator
		Point[] points = {	new Point(4, -2),
							new Point(3, 9),
							new Point(-1, 15),
							new Point(3, 7) };
		Arrays.sort(points, new PointComparator());
		System.out.println(Arrays.toString(points));
		
		Arrays.sort(points, Collections.reverseOrder(new PointComparator()));
		System.out.println(Arrays.toString(points));
	}
}
