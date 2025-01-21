package CircularSinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularSinglyLinkedList ll = new CircularSinglyLinkedList();
		ll.searchNode(5);
		ll.createCircularSinglyLinkedList(5);
		ll.insetNode(1, 0);
		ll.insetNode(8, 1);
		ll.insetNode(7, 1);
		ll.insetNode(6, 3);
		ll.insetNode(10, 5);
		System.out.println("Head : " + ll.getHead().getValue());
		System.out.println("Tail : " + ll.getTail().getValue());
		System.out.println("Size : " + ll.getSize());
		ll.traverseList();
		ll.searchNode(5);		
		ll.deleteNode(3);
		ll.traverseList();
		ll.deleteList();
		ll.traverseList();
	}

}
