package queueUsingArray;

public class Queue {
	
	private int[] queue;
	private int front;
	private int end;
	
	public Queue(int size) {
		queue = new int[size];
		front = -1;
		end = -1;
		System.out.println("Queue is created");
	}
	
	public boolean isEmpty() {
		if(front == -1 || front == queue.length) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(end == queue.length-1) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		if(this.isEmpty()) {
			front = 0;
			end++;
			queue[end] = value;
			System.out.println("Value : " + queue[end] + " is inserted successfully.");
		}
		else {
			end++;
			queue[end] = value;
			System.out.println("Value : " + queue[end] + " is inserted successfully.");
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;		
		}
		int value = queue[front];
		front++;
		if(front > end) {
			front = end = -1;
		}
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;		
		}
		
		return queue[front];
	}
	
	public void deleteQueue() {
		queue = null;
		System.out.println("Queue is deleted successfully");
	}
}
