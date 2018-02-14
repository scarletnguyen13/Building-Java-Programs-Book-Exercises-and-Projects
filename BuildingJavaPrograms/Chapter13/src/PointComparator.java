import java.awt.*;
import java.util.*;

public class PointComparator implements Comparator<Point>{
	public int compare(Point p1, Point p2) {
		int dx = p1.x - p2.x;
		if (dx == 0) {
			return p1.y - p2.y;
		} else {
			return dx;
		}
	}
}
