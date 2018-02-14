
public class SearchTreeNode<E> {
	public E data;
	public SearchTreeNode<E> left;
	public SearchTreeNode<E> right;
	
	public SearchTreeNode(E data) {
		this(data,null,null);
	}
	
	public SearchTreeNode(E data, SearchTreeNode<E> left, SearchTreeNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
