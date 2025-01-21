package CircularQueue;

public class CircularQueue {
	
	private int arr[];
	private int front;
	private int end;
	private int size;
	
	public CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
		front = end = -1;
		System.out.println("Circular Queue is created with size: " + size);
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if(front == -1 || end == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(end+1 == front) {
			return true;
		}
		if(front == 0 && end == size-1) {
			return true;
		}
		return false;
	}

	public void enQueue(int value) {
		if(this.isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if(this.isEmpty()) {
			front = 0;
			end++;
			arr[end] = value;
			System.out.println("Value : " + value + " is inserted successfully in Queue.");
		}
		else {
			if(end+1 == size) {
				end = 0;
			}
			else {
				end++;
			}
			arr[end] = value;
			System.out.println("Value : " + value + " is inserted successfully in Queue.");
		}
		
	}
	
	public int deQueue() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int temp = arr[front];
		arr[front] = Integer.MIN_VALUE;
		if(front == end) {
			front = end = -1;
		}
		if(front == arr.length-1) {
			front = 0;
		}
		else {
			front++;
		}
		return temp;
	}
	
	public int peek() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	public void deleteQueue() {
		arr = null;
		System.out.println("Circular Queue is Deleted successfully.");
	}
}
