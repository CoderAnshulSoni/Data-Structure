package StackUsingLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		
		System.out.println(st.isEmpty());
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		System.out.println("Stack : " + st.peek() + " is Peeked successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
		System.out.println("Stack : " + st.pop() + " is Peeked successfully.");
		st.deleteStack();
		
		System.out.println("Stack : " + st.peek() + " is Peeked successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
		
		System.out.println("Stack size : " + st.getSize());
		
	}

}
