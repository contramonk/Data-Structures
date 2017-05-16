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
		bst.insert(3);
		bst.insert(4);
		bst.insert(9);
		bst.insert(7);
		bst.insert(20);
		bst.insert(-5);
		bst.display(bst.root);
		System.out.println();
		
		System.out.println(bst.find(13));
		System.out.println(bst.find(10));
		System.out.println(bst.find(14));
		System.out.println(bst.find(9));
		System.out.println(bst.find(3));
		System.out.println(bst.find(5));
		System.out.println(bst.find(15));
		System.out.println(bst.find(0));
		System.out.println(bst.find(11));
		System.out.println(bst.find(99));
		bst.remove(6);
		bst.display(bst.root);
		System.out.println();
		bst.remove(10);
		bst.display(bst.root);
		System.out.println();
		System.out.println(bst.root.data);
		
		BinarySearchTree newTree = new BinarySearchTree();
		newTree.insert(6);
//		newTree.display(newTree.root);
		newTree.remove(6);
		newTree.display(newTree.root);
		
	}
}
