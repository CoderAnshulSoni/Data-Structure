
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeStackClass stack = new ThreeStackClass(3);
		
		System.out.println(stack.isEmpty(0));
		System.out.println(stack.isFull(2));
		
		stack.push(0, 1);
		stack.push(0, 2);
		stack.push(0, 3);
		
		stack.push(1, 4);
		stack.push(1, 5);
		stack.push(1, 6);
		
		stack.push(2, 7);
		stack.push(2, 8);
		stack.push(2, 9);
		
		System.out.println("Peek stack1 : " + stack.peek(0));
		System.out.println("Peek stack2 : " + stack.peek(1));
		System.out.println("Peek stack3 : " + stack.peek(2));
		
		System.out.println("Pop stack1 : " + stack.pop(0));
		System.out.println("Peek stack1 : " + stack.peek(0));
		System.out.println("Pop stack2 : " + stack.pop(1));
		System.out.println("Peek stack2 : " + stack.peek(1));
		System.out.println("Pop stack3 : " + stack.pop(2));
		System.out.println("Peek stack3 : " + stack.peek(2));}

}
