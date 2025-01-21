package StackUsingLinkedList;

public class Stack {
	
	private LinkedList stack;
	public Stack() {
		stack = new LinkedList();
	}
	
	public void push(int value) {
		stack.insertElement(value);
		System.out.println("Inserted : " + value + " in Stack");
	}
	
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		}
		int temp = stack.deleteNode().getValue();
		return temp;
	}
	
	public int peek() {
		if(this.isEmpty()) {
			return -1;
		}
		return stack.getHead().getValue();
	}
	
	public boolean isEmpty() {
		if(stack.getHead() == null) {
			System.out.println("Stack is Empty");
			return true;
		}
		return false;
	}
	
	public void deleteStack() {
		stack.setHead(null);
		System.out.println("Stack is deleted successfully");
	}
	
	public int getSize() {
		return stack.getSize();
	}
	
}
