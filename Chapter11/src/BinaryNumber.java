import java.util.Map;
import java.util.TreeMap;

public class BinaryNumber {
	public static void main(String[] args) {
		System.out.println(getBinaryNumber(13));
	}
	public static String getBinaryNumber(int number) {
		String answer = "";
        if (number == 1) {
            return "1";
        } else {
            answer += number % 2 == 1 ? "1" : "0";
            return getBinaryNumber((int) number / 2) + answer; 
        }
    }
}
