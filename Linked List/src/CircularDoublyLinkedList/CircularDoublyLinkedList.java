package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
	
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
	
	public Node createCircularDoublyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.setValue(nodeValue);
		node.setNext(node);
		node.setPrevious(node);
		size = 1;
		head = tail = node;
		return head;
	}
	
	public void insertElement(int nodeValue, int location) {
		if(head == null) {
			createCircularDoublyLinkedList(nodeValue);
			return;
		}
		Node node = new Node();
		node.setValue(nodeValue);
		if(location == 0) {
			node.setNext(head);
			node.setPrevious(tail);
			head.setPrevious(node);
			tail.setNext(node);
			head = node;
		}
		else if(location >= size) {
			node.setNext(head);
			node.setPrevious(tail);
			tail.setNext(node);
			head.setPrevious(node);
			tail = node;
		}
		else {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < location-1;i++) {
				temp = temp.getNext();
			}
			node.setPrevious(temp);
			node.setNext(temp.getNext());
			temp.setNext(node);
			node.getNext().setPrevious(node);
		}
		size++;
	}
	
	public void traverseList() {
		if(head == null) {
			System.out.println("Linked List is not present");
			return;
		}
		Node temp = new Node();
		temp = head;
		for(int i = 0;i < size;i++) {
			System.out.print(temp.getValue());
			if(i < size-1) {
				System.out.print(" -> ");
			}
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public void reverseTraverseList() {
		if(tail == null) {
			System.out.println("Linked List is not present");
			return;
		}
		Node temp = new Node();
		temp = tail;
		for(int i = 0;i < size;i++) {
			System.out.print(temp.getValue());
			if(i < size-1) {
				System.out.print(" <- ");
			}
			temp = temp.getPrevious();
		}
		System.out.println();
	}
	
	public boolean searchNode(int targetValue) {
		if(head == null) {
			System.out.println("Linked List is not present");
			return false;
		}
		Node temp = new Node();
		temp = head;
		for(int i = 0;i < size;i++) {
			if(temp.getValue() == targetValue) {
				System.out.println("Found value at " + i +" postion from head");
				return true;
			}
			temp = temp.getNext();
		}
		System.out.println("Value not found in linked list");
		return false;
	}
	
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("Linked List is not present");
			return;
		}
		if(location == 0) {
			if(size == 1) {
				head.setNext(null);
				head.setPrevious(null);
				head = tail = null;
				size--;
				return;
			}
			head = head.getNext();
			head.setPrevious(tail);
			tail.setNext(head);
		}
		else if(location >= size) {
			if(size == 1) {
				head.setNext(null);
				head.setPrevious(null);
				head = tail = null;
				size--;
				return;
			}
			tail = tail.getPrevious();
			tail.setNext(head);
			head.setPrevious(tail);
		}
		else {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < location-1;i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			temp.getNext().setPrevious(temp);
		}
		size--;
	}
	
	public void deleteList() {
		if(head == null) {
			System.out.println("Linked List is not present");
			return;
		}
		Node temp = new Node();
		temp = head;
		for(int i = 0;i < size;i++) {
			temp.setPrevious(null);
			temp = temp.getNext();
		}
		head = tail = null;
		System.out.println("Linked List is successfully deleted.");
	}

}
