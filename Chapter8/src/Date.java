import java.util.*;
import java.awt.*;
public class Date {
	
	private int year;
	private int month;
	private int day;
	private int[] daysInMonths = {0,31,59,90,120,151,181,212,243,273,304,334};
	
	public Date(int year, int month, int day) {
		if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
			throw new IllegalArgumentException();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//DayAccessor
	public int getDay() {
		return day;
	}
	
	//MonthAccessor
	public int getMonth() {
		return month;
	}
	
	////YearAccessor
	public int getYear() {
		return year;
	}
	
	//Moves this Date object forward in time by the given number of days.
	//Pre: days >= 0 
	public void addDays(int days) {
		if (days < 0) {
			throw new IllegalArgumentException();
		}
        int totalDays = daysInMonths[this.month - 1] + this.day + days;
        
    	while (totalDays > 365) {
    		if (this.isLeapYear() == true) {
    			totalDays -= 366;
    		} else {
    			totalDays -= 365;
    		}
    		this.year++;
    	}
    	
    	if (this.isLeapYear() == true) {
    		for (int a = 2; a < daysInMonths.length; a++) {
    			daysInMonths[a]++;
    		}
    	}	
    	
    	int smallestGap = Math.abs(totalDays - daysInMonths[0]);
    	this.month = 1;
    	for (int a = 1; a < daysInMonths.length; a++) {
    		int temp = Math.abs(totalDays - daysInMonths[a]);
    		if (temp < smallestGap) {
    			smallestGap = temp;
    			this.month = a;
    		}
    	}
    	
    	//this.day = daysInMonths[4];
    	this.day = Math.abs(totalDays - daysInMonths[this.month-1]) + 1;
    	
    	int dayInThisMonth = daysInMonths[this.month] - daysInMonths[this.month-1];
    	if (this.day > dayInThisMonth) {
    		this.month++;
    		this.day -= dayInThisMonth;  
    	}
    	
    }
	
	//Moves this Date object forward in time by the given number of seven-day weeks.
	//Pre: weeks >= 0
	public void addWeeks(int weeks) {
		if (weeks < 0) {
			throw new IllegalArgumentException();
		}
		addDays(weeks*7);
	}
	
	//Returns the number of days that this Date must be adjusted to make it equal to the given other Date.
	public int daysTo(Date other) {
		if (this.equals(other)) {
			return 0;
		}
		int leapYear = 0;
		int remainder = 0;
		if (other.year > this.year) {
			for (int a = this.year; a <= other.year; a++) {
				Date temp = new Date(a,1,1);
				if (temp.isLeapYear() == true) {
					leapYear++;
				}
			}
			remainder = (daysInMonths[this.month - 1] + this.day)
					- (daysInMonths[other.month - 1] + other.day);
		} else {
			for (int a = other.year; a <= this.year; a++) {
				Date temp = new Date(a,1,1);
				if (temp.isLeapYear() == true) {
					leapYear++;
				}
			}
			remainder = (daysInMonths[other.month - 1] + other.day)
					- (daysInMonths[this.month - 1] + this.day);
		}
		int totalDays = 365*Math.abs(other.year - this.year) + leapYear;
	    return totalDays -= remainder + 1;	
	}

	public boolean isLeapYear() {
		if (Math.abs(1956 - year) % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				return false;
			} else { return true; }			
		}
		return false;
	}
	
	// returns whether the two Dates have the same (YY/MM/DD) values
	public boolean equals(Object o) {
		if (o instanceof Date) {
			Date other = (Date) o; //IMPORTANT! NEVER DELETE THIS LINE
			// THE COMPILER DOESN'T ALLOW THE CODE TO COMPILE WITHOUT THIS
			return this.year == other.year 
			    && this.month == other.month
			    && this.day == other.day;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String result = year + "/";
		if (month > 9) { result += month + "/"; } 
		else { result += "0" + month + "/"; }
		if (day < 10) {	result += "0" + day; } 
		else { result += day + ""; }		
		return result;
	}
}