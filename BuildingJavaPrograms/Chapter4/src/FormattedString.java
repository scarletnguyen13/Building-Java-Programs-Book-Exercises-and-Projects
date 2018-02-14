
public class FormattedString {
	public static void main (String [] args) {
		int score = 87;
	double gpa = 3.18652;
	String name = "Jessica";
	System.out.printf("student name: %10s\n", name);
	System.out.printf("exam score  : %10d\n", score);
	System.out.printf("GPA         : %10.2f\n", gpa);
	//Notice that the student’s GPA rounds to 3.19, 
	//because of the 2 in that variable’s format specifier. 
	//The specifier 10.2 makes the value fit into an area 
	//10 character wide with exactly 2 digits after the decimal point.
	
	System.out.println();
	
	for (int i = 1; i <= 10; i++) {
		for (int j = 1; j <= 10; j++) {
			System.out.printf("%5d", i * j);
			}
		System.out.println();
		}	
	}
}
