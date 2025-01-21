package queueUsingLinkedList;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public Node createLinkedList(int value) {
		head = new Node();
		Node node = new Node();
		node.setValue(value);
		node.setNext(null);
		head = tail = node;
		size = 1; 
		return head;
	}
	
	public void insert(int value) {
		if(head == null) {
			this.createLinkedList(value);
		}
		Node node = new Node();
		node.setValue(value);
		node.setNext(null);
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public int deleteNode() {
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return -1;
		}
		int temp = head.getValue();
		head = head.getNext();
		size--;
		if(size == 0) {
			tail = null;
		}
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return -1;
		}
		int temp = head.getValue();
		return temp;
	}
	
	public void delete() {
		head = null;
		tail = null;
		System.out.println("Linked list is deleted successfully.");
	}

}
