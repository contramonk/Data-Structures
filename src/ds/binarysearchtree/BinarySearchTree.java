package ds.binarysearchtree;

public class BinarySearchTree {
	Node root;

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

	public boolean find(int data) {
		if (root == null) {
			return false;
		}
		Node current = root;
		while (!(current.left == null && current.right == null)) {
			if (current.data == data)
				return true;

			if (data < current.data) {
				if (current.left == null) break;
				current = current.left;
			} else if (data > current.data) {
				if (current.right == null) break;
				current = current.right;
			}
		}
		if (current.data == data)
			return true;

		return false;
	}

	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
}