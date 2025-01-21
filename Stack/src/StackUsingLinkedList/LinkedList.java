package StackUsingLinkedList;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;

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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void insertElement(int value) {
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public Node deleteNode() {
		Node node = head;
		head = head.getNext();
		size--;
		return node;
	}
	
	public void traversal() {
		Node temp = head;
		int i = 0;
		while(temp.getNext() != null) {
			System.out.print(temp.getValue());
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp = temp.getNext();
			i++;
		}
		System.out.println();
	}
	
}
