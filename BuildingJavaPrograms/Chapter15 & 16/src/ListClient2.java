public class ListClient2 {
	public static void main(String[] args) {
		IntList list1 = new ArrayIntList();
		processList(list1);
		
		IntList list2 = new LinkedIntList();
		processList(list2);
	}
	
	public static void processList(IntList list) {
		list.add(18);
		list.add(27);
		list.add(93);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}
}