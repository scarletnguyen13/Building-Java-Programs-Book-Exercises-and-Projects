
public class SearchTree<E extends Comparable<E>> {
	
	private SearchTreeNode<E> overallRoot;
	
	public SearchTree() {
		overallRoot = null;
	}
	
	public void add(E value) {
		overallRoot = add(overallRoot, value);
	}
	
	private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
		if (root == null) {
			root = new SearchTreeNode<E>(value);
		} else if (value.compareTo(root.data) <= 0) {
			root.left = add(root.left, value);
		} else /*value > root.data*/ { 
			root.right = add(root.right, value);
		}
		return root;
	}
	
	public boolean contains(E value) {
		return contains(overallRoot,value);
	}
	
	private boolean contains(SearchTreeNode<E> root, E value) {
		if (root == null) {
			return false;
		} else if (value.compareTo(root.data) == 0) {
			return true;
		} else if (value.compareTo(root.data) > 0) {
			return contains(root.right, value);
		} else /*value.compareTo(root.data) < 0*/ {
			return contains(root.left, value);
		}
	}
	
	public void printSideways() {
		printSideways(overallRoot, 0);
	}
	private void printSideways(SearchTreeNode<E> root, int level) {
		if (root != null) {
			printSideways(root.right, level+1);
			for (int i = 0; i < level; i++) {
				System.out.print("	");
			}
			System.out.println(root.data);
			printSideways(root.left, level+1);
		}
	}
	
	public void print() {
		print(overallRoot);
		System.out.println();
	}
	
	private void print(SearchTreeNode<E> root) {
		if (root != null) {
			print(root.left); 
			System.out.print(root.data + " ");
			print(root.right); 
			
		}
	}
}
