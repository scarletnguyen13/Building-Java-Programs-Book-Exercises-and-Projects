// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder, or postorder traversal. The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree. The
// documentation refers to these as "sequential trees."

public class IntTree {
	private IntTreeNode overallRoot;

	public IntTree(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("max: " + max);
		}
		overallRoot = buildTree(1, max);
	}
	
	// returns a sequential tree with n as its root unless n is
	// greater than max, in which case it returns an empty tree
	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max),
					buildTree(2 * n + 1, max));
		}
	}
	
	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot);
		System.out.println();
	}
	
	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left); // then print left subtree in a preorder manner
			printPreorder(root.right); // then print right subtree in a preorder manner
			
		}
	}
	
	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot);
		System.out.println();
	}
	
	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left); 
			System.out.print(" " + root.data);
			printInorder(root.right); 
			
		}
	}
	
	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot);
		System.out.println();
	}
	
	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left); 
			printPostorder(root.right); 
			System.out.print(" " + root.data);
		}
	}
	
	public int sum() {
		return sum(overallRoot);
	}
	
	private int sum(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return root.data + sum(root.left) + sum(root.right);
		}
	}
	
	public int countLevels() {
		return countLevels(overallRoot);
	}
	
	private int countLevels(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(countLevels(root.left), countLevels(root.right));
		}
	}
	
	public int countLeaves() {
		return countLeaves(overallRoot);
	}
	
	private int countLeaves(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null){
			return 1;
		} else {
			return countLeaves(root.left) + countLeaves(root.right);
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
}
