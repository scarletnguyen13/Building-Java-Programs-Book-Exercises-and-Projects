import java.util.*;

// compares String objects by length
public class LengthComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
 		return s1.length() - s2.length();
 	}
}