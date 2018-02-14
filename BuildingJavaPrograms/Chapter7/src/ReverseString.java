
public class ReverseString {
	public static void main(String[] args) {
		String word = "Mississippi";
		String result = "";
		for (int a = word.length()-1; a >= 0; a--) {
			result += word.charAt(a);
		}
		System.out.println(result);
	}
}
