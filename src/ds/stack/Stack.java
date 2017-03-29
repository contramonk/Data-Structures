package ds.stack;

public class Stack<T> {
	private Node<T> top;
	private Node<T> bottom;

	public void push(T pushValue) {
		Node<T> newNode = new Node<>();
		newNode.data = pushValue;

		if (this.isEmpty()) {
			top = newNode;
			bottom = newNode;
		} else {
			Node<T> temp = top;
			top = newNode;
			temp.next = top;
			top.previous = temp;
		}
	}

	public Node<T> pop() {
		Node<T> temp = top;
		if (top != null) {
			if (temp.previous != null) {
				top = temp.previous;
				top.next = null;
			} else {
				top = null;
				bottom = null;
			}
		} else {
			System.out.println("Stack is empty, cannot pop");
		}
		return temp;
	}

	public Node<T> peek() {
		return top;
	}

	public boolean isEmpty() {
		return top == null;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> current = bottom;
		while (current != null) {
			sb.append(current + " ");
			current = current.next;
		}

		return sb.toString();
	}
}
