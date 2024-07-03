package trees;

public class Trees {
	
	static class Node {
	    int data;
	    Node left, right;

	    public Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}

	static class BinaryTree {

	    Node root;

	    public BinaryTree() {
	        root = null;
	    }

	    // Method to insert a new node in the tree
	    public void insert(int data) {
	        root = insertRec(root, data);
	    }

	    // Recursive function to insert a new node
	    private Node insertRec(Node root, int data) {
	        if (root == null) {
	            root = new Node(data);
	            return root;
	        }

	        if (data < root.data) {
	            root.left = insertRec(root.left, data);
	        } else if (data > root.data) {
	            root.right = insertRec(root.right, data);
	        }

	        return root;
	    }

	    // Method to print the inorder traversal of the tree
	    public void inorderTraversal() {
	        inorderTraversalRec(root);
	    }

	    // Recursive function for inorder traversal
	    private void inorderTraversalRec(Node root) {
	        if (root != null) {
	            inorderTraversalRec(root.left);
	            System.out.print(root.data + " ");
	            inorderTraversalRec(root.right);
	        }
	    }

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(12);
        tree.insert(1);
        tree.insert(15);
        tree.insert(20);

        System.out.println("Inorder traversal of binary tree:");
        tree.inorderTraversal();

	}

}
}