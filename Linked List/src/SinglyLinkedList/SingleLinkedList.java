package SinglyLinkedList;

public class SingleLinkedList {
	
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
	
	public Node createLinkedList(int nodeValue) {
		Node node = new Node();
		node.setValue(nodeValue);
		node.setNextNode(null);
		head = node;
		tail = node;
		size = 1;
		return node;
	}
	
	public void insertInList(int newNodeValue, int location) {
		Node newNode = new Node();
		newNode.setValue(newNodeValue);
		
		if(head == null) {
			createLinkedList(newNodeValue);
			return;
		}
		
		else if(location == 0) {
			newNode.setNextNode(head);
			head = newNode;
		}
		
		else if(location >= size) {
			newNode.setNextNode(null);
			tail.setNextNode(newNode);
			tail = newNode;
		}
		else {
			Node temp = new Node();
			temp = head;
			int index = 0;
			while(index < location) {
				temp = temp.getNextNode();
				index++;
			}
			newNode.setNextNode(temp.getNextNode());
			temp.setNextNode(newNode);
		}
		size++;
	}
	
	public boolean search(int x) {
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		
		Node temp = head;
		
		for(int i = 0;i < size;i++) {
			if(temp.getValue() == x) {
				System.out.println("Find the node at : " + i + " postion");
				return true;
			}
			temp = temp.getNextNode();
		}
		System.out.println("Element is not present");
		return false;
	}
	
	public void getList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		
		for(int i = 0;i < size;i++) {
			System.out.print(temp.getValue());
			if(i < size-1) {
				System.out.print(" -> ");
			}
			temp = temp.getNextNode();
		}
		
	}
	
	public void deleteElement(int location) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(location == 0) {
			head = head.getNextNode();
			size--;
			if(size == 0) {
				tail.setNextNode(null);
			}
		}
		else if(location >= size) {
			Node temp = head;
			for(int i = 0;i < size-1;i++) {
				temp = temp.getNextNode();
			}
			if(temp == head) {
				tail = head = null;
				size--;
				return;
			}
			temp.setNextNode(null);
			tail = temp;
			size--;
		}
		else {
			Node temp = head;
			for(int i = 0;i < size;i++) {
				if(i == location-1) {
					break;
				}
				temp = temp.getNextNode();
			}
			temp.setNextNode(temp.getNextNode().getNextNode());
			size--;
		}
	}
	
	public void deleteList() {
		head = null;
		tail = null;
		size = 0;
		System.out.println("Deletion successfull");
	}
	
}
