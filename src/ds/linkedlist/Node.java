package ds.linkedlist;

public class Node<T> {
	Node<T> next;
	Node<T> previous;
	T data;
	
	public String toString() {
		return data + ""; 
	}
	
}
