package ds.queue;

public class Node<T> {
	T data;
	Node<T> next;
	Node<T> previous;
	
	public String toString() {
		return data + " ";

	}
}
