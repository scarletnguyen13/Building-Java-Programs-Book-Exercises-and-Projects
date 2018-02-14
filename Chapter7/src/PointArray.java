import java.awt.*;
import java.util.Arrays;

public class PointArray {
	public static void main(String[] args) {
		Point[] points = new Point[3];
		points[0] = new Point(3, 7);
		points[1] = new Point(4, 5);
		points[2] = new Point(6, 2);
		/*
		 * SHORTER WAY OF INITAILIZING THIS ARRAY
		 * Point[] points = {new Point(3, 7), new Point(4, 5), new Point(6, 2)};
		 */
		System.out.println(Arrays.toString(points));
	}
}
