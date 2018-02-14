// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList implements IntList {
	private IntListNode front; // first value in the list
	
	// post: constructs an empty list
	public LinkedIntList() {
		front = null;
	}
	
	// pre : 0 <= i < size()
	// post: returns a reference to the node at the given index
	private IntListNode nodeAt(int index) {
		IntListNode current = front;
		for (int a = 0; a < index; a++) {
			current = current.next;
		}
		return current;
	}
	
	// post: returns the current number of elements in the list
	public int length() {
		int count = 0;
		IntListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	// post: appends the given value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new IntListNode(value);
		} else {
			IntListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new IntListNode(value);
		}	
	}
	
	// pre: 0 <= index <= size()
	// post: inserts the given value at the given index
	public void add(int index, int value) {
		if (index == 0) {
			front = new IntListNode(value, front);
		} else {
			IntListNode current = nodeAt(index-1);
			current.next = new IntListNode(value,current.next);
		}
	}
	
	// pre : 0 <= index < size()
	// post: removes value at the given index
	public void remove (int index) {
		if (index == 0) {
			front = front.next;
		} else {
			IntListNode current = nodeAt(index-1);
			current.next = current.next.next;
		}
	}
	
	// pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}
	
	// post: returns the position of the first occurrence of the
	// given value (-1 if not found)
	public int indexOf(int value) {
		int index = 0;
		IntListNode current = front;
		while (current != null) {
			if (current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}
	
	// pre : list is in sorted (nondecreasing) order
	// post: given value is added to the list so as to preserve sorted
	// (nondecreasing) order, duplicates allowed
	public void addSorted(int value) {
		if (front == null || front.data >= value) {
			front = new IntListNode(value,front);
		} else {
			IntListNode current = front;
			while (current.next != null && current.next.data < value) {
				current = current.next;
			}
			current.next = new IntListNode(value, current.next);
		}
	}
	
	// post: returns comma-separated, bracketed version of list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			IntListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			return result += "]";
		}
	}
}
