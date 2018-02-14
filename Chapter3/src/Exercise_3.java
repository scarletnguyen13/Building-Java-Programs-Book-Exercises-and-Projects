
public class Exercise_3 {
	public static void main (String [] args) {
		System.out.println("Day\tPresents Received\tTotal Presents");
		System.out.println("1\t\t1\t\t\t1");
		int n = 1;
		for (int a = 2; a <= 12; a++) {
			n += a;
			System.out.println(a+"\t\t"+a+"\t\t\t"+n);
		}
	}
}
