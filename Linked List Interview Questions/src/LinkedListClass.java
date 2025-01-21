
public class LinkedListClass {
	
	private Node head;
	private Node tail;
	private int size;
	
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
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public void createLinkedList(int nodeValue) {
		Node node = new Node();
		node.setValue(nodeValue);
		node.setNext(null);
		head = tail = node;
		size = 1;
	}
	
	public void insertNode(int nodeValue) {
		if(head == null) {
			createLinkedList(nodeValue);
			return;
		}
		Node node = new Node();
		node.setValue(nodeValue);		
		node.setNext(null);
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public void traversal() {
		Node temp = head;
		for(int i = 0;i < size;i++) {
			System.out.print(temp.getValue());
			if(i < size-1) {
				System.out.print(" -> ");
			}
			temp = temp.getNext();
		}
		System.out.println();
	}

}
