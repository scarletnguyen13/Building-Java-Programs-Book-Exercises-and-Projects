import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		Map<String,Integer> familyMap = new HashMap<String,Integer>();
		familyMap.put("Dad", 49);
		familyMap.put("Mom", 46);
		familyMap.put("Brother", 19);
		familyMap.put("Me", 16);
		System.out.println(familyMap);
		
		int momAge = familyMap.get("Mom");
		System.out.println("Mom's age is " + momAge);
		if (familyMap.containsKey("Me")) {
			System.out.println("My age is " + familyMap.get("Me"));
		}
		
		//ORDER WILL BE RANDOM
		Set<String> nameKey = familyMap.keySet();
		for (String name : nameKey) {
			System.out.println("Family Member Name: " + name);
		}
		
		Collection<Integer> valueCollection = familyMap.values();
		for (int a : valueCollection) {
			System.out.println("Age: " + a);
		}
		
		for (String name : familyMap.keySet()) {
			int age = familyMap.get(name);
			System.out.println(name + " is " + age + " years old");
		}
	}
}
