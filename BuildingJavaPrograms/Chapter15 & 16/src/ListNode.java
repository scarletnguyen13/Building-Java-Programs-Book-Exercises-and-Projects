// ListNode is a class for storing a single node of a linked
// list. This node class is for a list of integer values.

public class ListNode<E> {
	public E data; // data stored in this node
	public ListNode<E> next; // link to next node in the list
	public ListNode<E> prev;
	
	// post: constructs a node with data 0 and null link
	public ListNode() {
		this(null,null);
	}
	
	// post: constructs a node with given data and null link
	public ListNode(E data) {
		this(data,null);
	}
	
	// post: constructs a node with given data and given link
	public ListNode(E data, ListNode<E> next) {
		this.data = data;
		this.next = next;
	}
}
