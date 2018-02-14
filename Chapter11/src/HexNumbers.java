import java.util.Map;
import java.util.TreeMap;

public class HexNumbers {
	public static void main(String[] args) {
		System.out.println(getHexNumber(590));
	}
	public static String getHexNumber(int number) {
		String result = "";
        Map<Integer,String> hex = new TreeMap<Integer, String>();
        hex.put(10,"A"); hex.put(11,"B"); hex.put(12,"C");
        hex.put(13,"D"); hex.put(14,"E"); hex.put(15,"F");
        if (number <= 0) {
            return "";
        } else {
            int a = number % 16;
            result += a >= 10 ? hex.get(a) : a;
            return getHexNumber(number / 16) + result;
        }
    }
}
