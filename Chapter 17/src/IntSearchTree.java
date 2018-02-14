
public class IntSearchTree {
	
	private IntTreeNode overallRoot;
	
	public IntSearchTree() {
		overallRoot = null;
	}
	
	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}
	
	private IntTreeNode add(IntTreeNode root, int value) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (value <= root.data) {
			root.left = add(root.left, value);
		} else /*value > root.data*/ { 
			root.right = add(root.right, value);
		}
		return root;
	}
	
	public boolean contains(int value) {
		return contains(overallRoot,value);
	}
	
	private boolean contains(IntTreeNode root, int value) {
		if (root == null) {
			return false;
		} else if (value == root.data) {
			return true;
		} else if (value > root.data) {
			return contains(root.right, value);
		} else /*value < root.data*/ {
			return contains(root.left, value);
		}
	}
	
	public void printSideways() {
		printSideways(overallRoot, 0);
	}
	private void printSideways(IntTreeNode root, int level) {
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
	
	private void print(IntTreeNode root) {
		if (root != null) {
			print(root.left); 
			System.out.print(root.data + " ");
			print(root.right); 
			
		}
	}
}
