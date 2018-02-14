import java.io.*;
import java.util.*;

public class StudyCase {
	public static final double RADIUS = 3956.6;
	private static Scanner console;
	private static Scanner input;

	public static void main (String[] args) throws FileNotFoundException {
		console = new Scanner(System.in);
		String target = console.next();
		input = new Scanner(new File("zipcode.txt"));
		String targetCoordinates = find(target,input);
		input = new Scanner(new File("zipcode.txt"));
		showMatches(targetCoordinates, input, miles);
	}
	
	public static String find(String target, Scanner input) {
		while (input.hasNextLine()) {
			String zip = input.nextLine();
			String city = input.nextLine();
			String coordinates = input.nextLine();
			if (zip.equals(target)) {
				System.out.println(zip + ": " + city);
				return coordinates;
			}
		}
		// at this point we know the zip code isn't in the file
		// we return fictitious (no match) coordinates
		return "0 0";
	}
	
	public static void showMatches(String targetCoordinates, Scanner input, double miles) 
								throws FileNotFoundException {
		Scanner data = new Scanner(targetCoordinates);
		double lat1 = data.nextDouble();
		double long1 = data.nextDouble();
		System.out.println("Zipcode within " + miles + "miles: ");
		while (input.hasNextLine()) {
			String zip = input.nextLine();
			String city = input.nextLine();
			String coordinates = input.nextLine();
			data = new Scanner(coordinates);
			double lat2 = data.nextDouble();
			double long2 = data.nextDouble();
			double distance = distance(lat1, long1, lat2, long2);
			if (distance <= miles) {
				System.out.printf(" %s %s, %3.2f miles\n",zip, city, distance);
			}
		}
	}
	
	public static double distance(double lat1, double long1, double lat2, double long2) {
		return 0;
	}
}
