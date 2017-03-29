package ds.linkedlist;

public class App {
	public static void main(String[] args) {
		// Test isEmpty
		System.out.println("***********Test isEmpty**************");
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		boolean isempty = myLinkedList.isEmpty();
		System.out.println(isempty);
		
		System.out.println("***********Test addFirst**************");
		myLinkedList.addFirst(1);
		myLinkedList.addFirst(2);
		myLinkedList.addFirst(3);
		myLinkedList.addFirst(4);
		myLinkedList.addFirst(5);
		System.out.println(myLinkedList);
		
		System.out.println("***********Test addLast**************");
		myLinkedList.addLast(6);
		myLinkedList.addLast(7);
		myLinkedList.addLast(8);
		System.out.println(myLinkedList);
		
		System.out.println("***********Test removeFirst**************");
		myLinkedList.removeFirst();
		myLinkedList.removeFirst();
		myLinkedList.removeFirst();
		myLinkedList.removeFirst();
		myLinkedList.removeFirst();
		myLinkedList.removeFirst();
		myLinkedList.addLast(4);
		myLinkedList.addLast(5);
		System.out.println(myLinkedList);
		
		System.out.println("***********Test removeLast**************");
		myLinkedList.removeLast();
		myLinkedList.removeLast();
		System.out.println(myLinkedList);
		
		System.out.println("************Misc Tests***************");
		myLinkedList.addLast(10);
		myLinkedList.addFirst(5);
		myLinkedList.addFirst(11);
		myLinkedList.removeFirst();
		myLinkedList.removeLast();
		myLinkedList.addLast(22);
		myLinkedList.addFirst(55);
		myLinkedList.addFirst(67);
		myLinkedList.addFirst(99);
		System.out.println(myLinkedList);
		
		System.out.println("************Test insertAfter***************");
		myLinkedList.insertAfter(55, 9);
		System.out.println(myLinkedList);
		
		System.out.println("************Test insertAfter***************");
		myLinkedList.insertBefore(22, 10);
		myLinkedList.insertBefore(99, 98);
		myLinkedList.insertBefore(9, 8);
		
		
		System.out.println(myLinkedList);
	}
}
