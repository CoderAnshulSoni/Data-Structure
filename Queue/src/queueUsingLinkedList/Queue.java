package queueUsingLinkedList;

public class Queue {

	LinkedList queue;
	
	public Queue() {
		queue = new LinkedList();
		System.out.println("Queue is created successfully.");
	}
	
	public boolean isEmpty() {
		if(queue.getHead() == null) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int value) {
		if(this.isEmpty()) {
			queue.createLinkedList(value);
			System.out.println("Value : " + value + " is inserted successfully.");
			return;
		}
		queue.insert(value);
		System.out.println("Value : " + value + " is inserted successfully.");
	}
	
	public int deQueue() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue.deleteNode();
	}
	
	public int peek() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue.peek();
	}
	
	public void deleteQueue() {
		queue.delete();
		System.out.println("Queue is deleted successfully.");
	}
}
