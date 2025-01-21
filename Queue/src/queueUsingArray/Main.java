package queueUsingArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new Queue(2);
		
		queue.enQueue(1);
		queue.enQueue(2);
		
		System.out.println("Value : " + queue.peek() + " is peeked successfully.");
	
		System.out.println("Value : " + queue.deQueue() + " is removed successfully.");
		System.out.println("Value : " + queue.deQueue() + " is removed successfully.");

		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		queue.deleteQueue();
	}

}
