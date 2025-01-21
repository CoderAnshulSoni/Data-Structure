package DoublyLinkedList;

public class DoublyLinkedList {
	
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

	public Node createDoublyLinkedList(int nodeValue) {
		
		head = new Node();
		Node node = new Node();
		node.setValue(nodeValue);
		node.setNext(null);
		node.setPrevious(null);
		head = tail = node;
		size = 1;
		return head;
	}
	
	public void insertNode(int nodeValue, int location) {
		if(head == null) {
			createDoublyLinkedList(nodeValue);
			return;
		}
		
		Node newNode = new Node();
		newNode.setValue(nodeValue);
		
		if(location == 0) {
			head.setPrevious(newNode);
			newNode.setNext(head);
			newNode.setPrevious(null);
			head = newNode; 
		}
		else if(location >= size) {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			newNode.setNext(null);
			tail = newNode;
		}
		else {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < location-1;i++) {
				temp = temp.getNext();
			}
			newNode.setPrevious(temp);
			newNode.setNext(temp.getNext());
			temp.getNext().setPrevious(newNode);
			temp.setNext(newNode);
		}
		size++;
	}
	
	public void traverseList() {
		if(head == null) {
			System.out.print("Linked List not created");
			return;
		}
		Node temp = new Node();
		temp = head;
		for(int i = 0;i < size;i++) {
			System.out.print(temp.getValue());
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp = temp.getNext();
		}
		System.out.print("\n");
	}
	
	public void reverseTraverseList() {
		if(tail == null) {
			System.out.println("Linked List not created");
			return;
		}
		Node temp = new Node();
		temp = tail;
		for(int i = 0;i < size;i++) {
			System.out.print(temp.getValue());
			if(i != size-1) {
				System.out.print(" <- ");
			}
			temp = temp.getPrevious();
		}
		System.out.print("\n");
	}
	
	public boolean searchNode(int targetValue) {
		if(head == null) {
			System.out.println("Linked List not created");
			return false;
		}
		Node temp = new Node();
		temp = head;
		for(int i = 0;i < size;i++) {
			if(targetValue == temp.getValue()) {
				System.out.println("Node found at : " + i + " postion from head");
				return true;
			}
			temp = temp.getNext();
		}
		System.out.println("Node is not present in list.");
		return false;
	}
	
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("Linked List not created");
			return;			
		}
		if(location == 0) {
			if(size == 1) {
				head = tail = null;
				size--;
				return;
			}
			else {
				head = head.getNext();
				head.setPrevious(null);
				size--;
			}
		}
		else if(location >= size) {
			if(size == 1) {
				head = tail = null;
				size--;
				return;
			}
			else {
				tail = tail.getPrevious();
				tail.setNext(null);
				size--;
			}
		}
		else {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < location-1;i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			temp.getNext().setPrevious(temp);
			size--;
		}
	}
	
	public void deleteList() {
		if(head == null) {
			System.out.println("Linked List not present");
			return;
		}
		Node temp = new Node();
		temp = head;
		for(int i = 0;i < size;i++) {
			temp.setPrevious(null);
			temp = temp.getNext();
		}
		head = tail = null;
		System.out.println("Linked List has been deleted");
	}
}
