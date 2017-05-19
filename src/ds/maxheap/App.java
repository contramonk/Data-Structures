package ds.maxheap;

public class App {
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap();
		
		// Test Insertion
		heap.insert(5);
		heap.insert(13);
		heap.insert(17);
		heap.insert(10);
		heap.insert(3);
		heap.insert(20);
		heap.insert(10);
		heap.insert(11);
		heap.insert(9);
		heap.insert(2);
		heap.insert(5);
		heap.insert(9);
		System.out.println("******Testing Insertion******");
		System.out.println("Expecting: [ 20 11 17 10 5 13 10 5 9 2 3 9 ] Root: 20");
		System.out.println("Getting: " + heap.toString() + " Root: " + heap.getRoot());
		if(heap.toString().equals("[ 20 11 17 10 5 13 10 5 9 2 3 9 ]") && heap.getRoot() == 20) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		// Test Deletion
		heap.delete();
		System.out.println("******Testing Deletion******");
		System.out.println("Expecting: [ 17 11 13 10 5 9 10 5 9 2 3 ] Root: 17");
		System.out.println("Getting: " + heap.toString() + " Root: " + heap.getRoot());
		if(heap.toString().equals("[ 17 11 13 10 5 9 10 5 9 2 3 ]") && heap.getRoot() == 17) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
	}
}
