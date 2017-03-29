package ds.stack;

public class App {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		
		// Push Test
		System.out.println("Push Test");
		myStack.push(7);
		myStack.push(9);
		myStack.push(10);
		myStack.push(15);
		System.out.println(myStack);
		
		// Pop Test
		System.out.println("Pop Test");
		System.out.println("Popped: " + myStack.pop());
		System.out.println(myStack);
		
		// Peek Test
		System.out.println("Peeked: " + myStack.peek());
		
		// Is Empty Test
		System.out.println("Is it empty: " + myStack.isEmpty());
		System.out.println(myStack);
		myStack.pop();
		myStack.pop();
		System.out.println(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.isEmpty());
		myStack.pop();
		System.out.println(myStack.isEmpty());
		
		myStack.push(99);
		myStack.push(55);
		System.out.println(myStack);
		
		//String Stack Test
		System.out.println("String Stack");
		Stack<String> myStack2 = new Stack<>();
		myStack2.push("Hello");
		myStack2.push("Nice to meet you");
		myStack2.push("Goodbye");
		System.out.println(myStack2);
	}
}
