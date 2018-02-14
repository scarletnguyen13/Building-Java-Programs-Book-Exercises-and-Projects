
public class CountLetters {
	public static void main (String [] args) {
		System.out.println(countLetters("gr8 JoB!"));
	}
	public static int countLetters(String phrase) {
		int count = 0;
		for (int i = 0; i < phrase.length(); i++) {
		char ch = phrase.charAt(i);
		if (Character.isLetter(ch)) {
			count++;
			}
		}
		return count;
	}
}
