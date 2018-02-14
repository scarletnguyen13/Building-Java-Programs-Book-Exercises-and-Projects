import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		RationalNumber num1 = new RationalNumber(8,9);
		RationalNumber num2 = new RationalNumber(9,12);
		System.out.println(num1.add(num2));
		System.out.println();
		Date date1 = new Date(2017,7,24);
		Date date2 = new Date(2017,7,24);
		System.out.println(date2.isLeapYear());
		System.out.println(date2.daysTo(date1));
		System.out.println(date2.equals(date1));
		
		System.out.println();
		System.out.println(date1);
		date1.addDays(950);
		System.out.println(date1);
		
		System.out.println();
		
		DateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd");

		Calendar c = Calendar.getInstance();    
		c.add(Calendar.DATE, 6);
		System.out.println(dateFormat.format(c.getTime()));
	}
}
