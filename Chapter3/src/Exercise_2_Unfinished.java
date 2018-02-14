
public class Exercise_2_Unfinished {
	public static void main (String [] args) {
		double newDeposit = 100;
		double currentBalance = 1000 + newDeposit;
		double interest = currentBalance*6.5/100;
		double newBalance = currentBalance+interest+newDeposit;
		
		System.out.println("CurrentBalance\t\tNewDeposit\tInterest\tNewBalance");
		System.out.println("1000.0\t\t\t0.0\t\t65.0\t\t1065.0");
		for (int a = 1; a <= 24; a++) {
	    System.out.println(currentBalance+"\t\t\t"+newDeposit+"\t\t"+interest+"\t\t"+newBalance);
		}
		currentBalance = newBalance;
	}
}
