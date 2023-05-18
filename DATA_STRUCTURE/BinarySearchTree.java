package DATA_STRUCTURE;

	import java.io.*;

	public class BinarySearchTree {

	 
	    class Node {
	        int key;
	        Node left, right;

	        public Node(int item)
	        {
	            key = item;
	            left = right = null;
	        }
	    }

	 
	    Node root;
	    BinarySearchTree() { root = null; }

	    BinarySearchTree(int value)
	    { root = new Node(value);
	    }
	    void insert(int key) {
	    	root = insertVal(root, key); 
	    	}

	
	    Node insertVal(Node root, int key)
	    {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }

	        else if (key < root.key)
	            root.left = insertVal(root.left, key);
	        else if (key > root.key)
	            root.right = insertVal(root.right, key);
	        return root;
	    }
	    void inorder(Node root)
	    {
	        if (root != null) {
	            inorder(root.left);
	            System.out.print(root.key + " ");
	            inorder(root.right);
	        }
	    }
	    public static void main(String[] args)
	    {
	        BinarySearchTree tree = new BinarySearchTree();

	        tree.insert(8);
	        tree.insert(3);
	        tree.insert(1);
	        tree.insert(6);
	        tree.insert(4);
	        tree.insert(7);
	        tree.insert(10);
	        tree.insert(14);
	        tree.inorder(tree.root);
	    }
	}