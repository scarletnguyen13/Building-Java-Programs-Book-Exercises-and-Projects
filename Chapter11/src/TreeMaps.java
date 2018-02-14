import java.util.*;

public class TreeMaps {
	public static void main(String[] args) {
		Map<Integer, String> ssnMap = new TreeMap<Integer, String>();
		ssnMap.put(867530912, "Jenny");
		ssnMap.put(239876305, "Stuart Reges");
		ssnMap.put(504386382, "Marty Stepp");
		System.out.println(ssnMap);
	}
}
