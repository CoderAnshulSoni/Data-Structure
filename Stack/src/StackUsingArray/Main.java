package StackUsingArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack(5);
		
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		
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
		System.out.println("Stack : " + st.peek() + " is Peeked successfully.");
		st.delete();
		System.out.println("Stack : " + st.peek() + " is Peeked successfully.");
		System.out.println("Value : " + st.pop() + " is Popped successfully.");
	}

}
