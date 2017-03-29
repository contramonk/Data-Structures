package ds.stack;

public class Node<T> {
	public Node<T> next;
	public Node<T> previous;
	public T data;
	
	public String toString() {
		return data + " ";
	}
}
