 public class Client2 {
	 public static void main(String[] args) {
		 // construct and print list
		 int[] data = {13, 4, 85, 13, 40, -8, 17, -5};
		 ArrayIntList list = new ArrayIntList();
		 for (int n : data) {
			 list.add(n);
		 }
		 System.out.println("list = " + list);
		
		 // obtain an iterator to find the product of the list
		 ArrayIntListIterator i = list.iterator();
		 int product = 1;
		 while (i.hasNext()) {
			 int n = i.next();
			 product *= n;
		 }
		 System.out.println("product = " + product);
	 }
 }