package ds.queue;

public class App {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new Queue<>();
		
		// Test isEmpty()
		System.out.println("***********Test isEmpty***********");
		System.out.println(myQueue.isEmpty());
				
				
		// Test Enqueue
		System.out.println("***********Test Enqueue***********");
		myQueue.enqueue(8);
		myQueue.enqueue(9);
		myQueue.enqueue(10);
		myQueue.enqueue(11);
		System.out.println(myQueue);
		
		// Test Dequeue
		System.out.println("***********Test Dequeue************");
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		System.out.println(myQueue);
		
		// Test Size
		System.out.println("************Test Size**************");
		System.out.println(myQueue.size());
	}
}
