package ds.linkedlist;

public class LinkedList<T> {
	private Node<T> first;
	private Node<T> last;

	public void addFirst(T addToFront) {
		Node<T> newNode = new Node<>();
		newNode.data = addToFront;
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			Node<T> oldFirst = first;
			first = newNode;
			first.next = oldFirst;
			oldFirst.previous = first;
		}

	}

	public void addLast(T addToBack) {
		Node<T> newNode = new Node<>();
		newNode.data = addToBack;
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			Node<T> oldLast = last;
			last = newNode;
			last.previous = oldLast;
			oldLast.next = last;
		}
	}

	public Node<T> removeFirst() {
		if(isEmpty()) {
			System.out.println("Cannot remove: LinkedList is empty.");
			return null;
		}
		Node<T> temp = first;
		if(first.next == null) {
			first = null;
			last = null;
		} else {
			first = first.next;
			first.previous = null;
		}
		return temp;
	}

	public Node<T> removeLast() {
		if(isEmpty()) {
			System.out.println("Cannot remove: LinkedList is empty.");
			return null;
		}
		Node<T> temp = last;
		if(last.previous == null) {
			last = null;
			first = null;
		} else {
			last = last.previous;
			last.next = null;
		}
		return temp;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> current = first;
		while (current != null) {
			sb.append(current + " ");
			current = current.next;
		}
		return sb.toString();
	}
}
