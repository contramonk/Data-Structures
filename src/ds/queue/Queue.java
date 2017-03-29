package ds.queue;

public class Queue<T> {
	private Node<T> front;
	private Node<T> back;
	private int nItems;

	// enqueue
	public void enqueue(T addToBack) {
		nItems++;
		Node<T> newNode = new Node<>();
		newNode.data = addToBack;

		if (this.isEmpty()) {
			front = newNode;
			back = newNode;
		} else {
			Node<T> temp = back;
			back = newNode;
			temp.next = back;
			back.previous = temp;
		}
	}

	// dequeue
	public Node<T> dequeue() {
		Node<T> temp = front;
		if (!this.isEmpty()) {
			if (front.next != null) {
				nItems--;
				front = front.next;
				front.previous = null;
			} else {
				nItems--;
				front = null;
			}
		} else {
			System.out.println("Cannot dequeue: Queue is empty.");
		}

		return temp;
	}
	
	public Node<T> peek() {
		return front;
	}

	public int size() {
		return nItems;
	}
	
	public boolean isEmpty() {
		return front == null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> current = front;
		while (current != null) {
			sb.append(current + " ");
			current = current.next;
		}

		return sb.toString();

	}
}
