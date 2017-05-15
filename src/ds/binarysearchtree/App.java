package ds.binarysearchtree;

public class App {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(15);
		bst.insert(5);
		bst.insert(3);
		bst.insert(6);
		bst.insert(13);
		bst.insert(14);
		bst.display(bst.root);
		
	}
}
