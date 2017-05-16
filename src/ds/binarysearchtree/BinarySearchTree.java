package ds.binarysearchtree;

public class BinarySearchTree {
	Node root;
	
	/**
	 * This method inserts an integer into the binary 
	 * search tree
	 * 
	 * @param data an integer to insert
	 * @return void
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = new Node(data);
		} else {
			Node current = root;
			while (!(current.left == null && current.right == null)) {
				if (data <= current.data) {
					if (current.left == null) {
						current.left = newNode;
						break;
					} else {
						current = current.left;
					}
				} else if (data >= current.data) {
					if (current.right == null) {
						current.right = newNode;
						break;
					}
					current = current.right;
				}
			}
			if (data <= current.data) {
				current.left = newNode;
			} else {
				current.right = newNode;
			}
		}
	}
	/**
	 * This method will place a Node into the
	 * binary search tree.
	 * 
	 * @param node a Node to place in the tree
	 * @return void
	 */
	public void insert(Node node) {
		if (root == null) {
			root = node;
		} else {
			Node current = root;
			while (!(current.left == null && current.right == null)) {
				if (node.data <= current.data) {
					if (current.left == null) {
						current.left = node;
						break;
					} else {
						current = current.left;
					}
				} else if (node.data >= current.data) {
					if (current.right == null) {
						current.right = node;
						break;
					}
					current = current.right;
				}
			}
			if (node.data <= current.data) {
				current.left = node;
			} else {
				current.right = node;
			}
		}
	}
	/**
	 * This method will find a given integer in the
	 * binary search tree.
	 * 
	 * @param data an integer
	 * @return true if the integer belongs to the BST,
	 * false if it does not.
	 */

	public boolean find(int data) {
		if (root == null) return false;
		
		Node current = root;
		while (!(current.left == null && current.right == null)) {
			if (current.data == data) return true;

			if (data < current.data) {
				if (current.left == null) break;
				current = current.left;
			} else if (data > current.data) {
				if (current.right == null) break;
				current = current.right;
			}
		}
		if (current.data == data) return true;

		return false;
	}
	/**
	 * This method will remove a Node from the BST with
	 * the given data.
	 * @param data an integer to search for and remove
	 * @return the Node that has been removed.
	 */
	public Node remove(int data) {
		if (root == null) {
			System.out.println("Binary Search Tree is empty");
			return null;
		}
		
		Node current = root;
		Node smallNode = null;
		Node previous = null;
		Node value = null;
		
		while (!(current.left == null && current.right == null)) {
			if (current.data == data) {
				if (previous == null) {
					root = current.right;
				} else if (current.data <= previous.data) {
					previous.left = current.right;
				} else {
					previous.right = current.right;
				}
				smallNode = current.left;
				value = current;
				break;
			}
			if (data < current.data) {
				if (current.left == null) break;
				previous = current;
				current = current.left;
			} else if (data > current.data) {
				if (current.right == null) break;
				previous = current;
				current = current.right;
			}
		}
		if (current.data == data) {
			if (previous == null) {
				root = current.right;
			} else if (current.data <= previous.data) {
				previous.left = current.right;
			} else {
				previous.right = current.right;
			}
			smallNode = current.left;
			value = current;
		}
		if (smallNode != null) {
			insert(smallNode);
		}
		return value;
	}
	/**
	 * This method will display the binary search tree in
	 * ascending order.
	 * @param root the first Node of the subtree to display
	 */
	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
}
