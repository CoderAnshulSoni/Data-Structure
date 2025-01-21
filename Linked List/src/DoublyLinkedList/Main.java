package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList ll = new DoublyLinkedList();
		
		ll.createDoublyLinkedList(1);
		ll.insertNode(0, 0);
		ll.insertNode(2, 2);
		ll.insertNode(3, 2);
		ll.insertNode(7, 2);
		ll.insertNode(6, 2);
		ll.insertNode(5, 8);
		ll.insertNode(4, 1);
		
		System.out.println("Head : " + ll.getHead().getValue());
		System.out.println("Tail : " + ll.getTail().getValue());
		System.out.println("Size : " + ll.getSize());
		ll.traverseList();
		ll.reverseTraverseList();
		ll.searchNode(1);
		ll.deleteNode(4);
		System.out.println("\nSize : " + ll.getSize());
		ll.traverseList();
		ll.deleteList();
		ll.traverseList();
	}

}
