
public class MedianOf3 {
	public static void main (String [] args) {
		System.out.println(medianOf3(3,4,1));
	}
	
	public static int medianOf3 (int n1, int n2, int n3) {
		if (n1 < n2) {
			if (n2 < n3) {
				return n2;
			}
			else if (n3 < n1) {
				return n1;
			}
			else {
				return n3;
			}
		}
		else {
			if (n1 < n3) {
				return n1;
			}
			else {
				return n3;
			}
		}
	}
}
