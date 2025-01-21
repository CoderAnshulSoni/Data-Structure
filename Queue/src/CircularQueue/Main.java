package CircularQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue cq = new CircularQueue(3);
		System.out.println("Circular Queue is Empty : " + cq.isEmpty());
		System.out.println("Circular Queue is Full : " + cq.isFull());
		
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);

		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		cq.enQueue(4);
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		cq.enQueue(5);
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
		System.out.println("Value : " + cq.peek() + " is Peeked successfully from Queue");
	
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		cq.deleteQueue();
		System.out.println("Value : " + cq.deQueue() + " is deleted successfully from Queue");
		
		
	}

}
