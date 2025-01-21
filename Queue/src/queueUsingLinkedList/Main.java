package queueUsingLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue cq = new Queue();
		System.out.println("Circular Queue is Empty : " + cq.isEmpty());
		
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);

		cq.enQueue(4);
		cq.enQueue(5);
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
	
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
		cq.deleteQueue();
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		
		
	}

}
