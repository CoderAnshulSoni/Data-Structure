package CircularDoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularDoublyLinkedList ll = new CircularDoublyLinkedList();
		
		ll.createCircularDoublyLinkedList(0);
		ll.insertElement(10, 1);
		ll.insertElement(1, 0);
		ll.insertElement(20, 1);
		ll.insertElement(24, 1);
		
		ll.traverseList();
		ll.reverseTraverseList();
		ll.searchNode(1);
		System.out.println("Head : " + ll.getHead().getValue());
		System.out.println("Tail : " + ll.getTail().getValue());
		System.out.println("Size : " + ll.getSize());
		
		ll.deleteNode(0);
		ll.traverseList();
		ll.reverseTraverseList();
		
		ll.deleteList();
		ll.traverseList();
		ll.reverseTraverseList();
	}

}
