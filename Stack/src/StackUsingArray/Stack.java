package StackUsingArray;

public class Stack {

	private int arr[];
	private int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
		System.out.println("Stack is created successfully");
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(top == arr.length-1) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}
	
	public void push(int value) {
		if(this.isFull()) {
			return;
		}
		arr[top+1] = value;
		top++;
		System.out.println("Value : " + value + " is Pushed successfully.");
	}
	
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		}
		int value = arr[top];
		top--;
		return value;
	}
	
	public int peek() {
		if(this.isEmpty()) {
			return -1;
		}
		return arr[top];
	}
	
	public void delete() {
		arr = null;
		System.out.println("Stack is deleted successfully.");
	}
}
