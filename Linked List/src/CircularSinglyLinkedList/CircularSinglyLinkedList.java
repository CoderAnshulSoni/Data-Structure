package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
	
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
	
	public Node createCircularSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.setValue(nodeValue);
		node.setNextNode(node);
		head = tail = node;
		size++;
		return head;
	}
	
	public void insetNode(int newNodeValue, int location) {
		if(head == null) {
			createCircularSinglyLinkedList(newNodeValue);
			return;
		}
		
		Node newNode = new Node();
		newNode.setValue(newNodeValue);
		
		if(location == 0) {
			newNode.setNextNode(head);
			head = newNode;
			tail.setNextNode(newNode);
		}
		else if(location >= size) {
			tail.setNextNode(newNode);
			tail = newNode;
			tail.setNextNode(head);
		}
		else {
			Node temp = head;
			int index = 0;
			while(index < location-1) {
				temp = temp.getNextNode();
				index++;
			}
			newNode.setNextNode(temp.getNextNode());
			temp.setNextNode(newNode);
		}
		size++;
	}
	
	public void traverseList() {
		if(head != null) {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < size;i++) {
				System.out.print(temp.getValue());
				if(i < size-1) {
					System.out.print("->");
				}
				temp = temp.getNextNode();
			}
			System.out.println();
		}
		else {
			System.out.print("Linked List is not created");
		}
	}
	
	public boolean searchNode(int targetValue) {
		if(head != null) {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < size;i++) {
				if(temp.getValue() == targetValue) {
					System.out.println("Value is found at the index of : " + i);
					return true;
				}
				temp = temp.getNextNode();
			}
			System.out.println("Node is not present in Linked List");
			return false;
		}
		else {
			System.out.println("Linked List is empty");
			return false;
		}
	}
	
	public void deleteNode(int location) {
		if(head == null) {
			System.out.print("Linked List is not created");
			return;
		}
		else if(location == 0) {
			head = head.getNextNode();
			tail.setNextNode(head);
			size--;
			if(size == 0) {
				head.setNextNode(null);
				tail = head = null;
			}
		}
		else if(location >= size-1) {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < size-1;i++) {
				temp = temp.getNextNode();
			}
			if(temp == head) {
				head.setNextNode(null);
				tail = head = null;	
				size--;
				return;
			}
			temp.setNextNode(head);
			tail = temp;
			size--;
		}
		else {
			Node temp = new Node();
			temp = head;
			for(int i = 0;i < location-1;i++) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(temp.getNextNode().getNextNode());
			size--;
		}
	}
	
	public void deleteList() {
		if(head == null) {
			System.out.print("Linked List is not created");
			return;
		}
		head = null;
		tail.setNextNode(null);
		tail = null;
		size = 0;
		System.out.println("List is successfully deleted.");
	}
	

}
