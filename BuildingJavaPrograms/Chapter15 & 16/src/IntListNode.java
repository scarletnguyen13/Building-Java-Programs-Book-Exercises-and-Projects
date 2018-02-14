// ListNode is a class for storing a single node of a linked
// list. This node class is for a list of integer values.

public class IntListNode {
	public int data; // data stored in this node
	public IntListNode next; // link to next node in the list
	
	// post: constructs a node with data 0 and null link
	public IntListNode() {
		this(0,null);
	}
	
	// post: constructs a node with given data and null link
	public IntListNode(int data) {
		this(data,null);
	}
	
	// post: constructs a node with given data and given link
	public IntListNode(int data, IntListNode next) {
		this.data = data;
		this.next = next;
	}
}
