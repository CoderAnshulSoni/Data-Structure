package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList ll = new SingleLinkedList();
		
		ll.insertInList(0,0);
		ll.insertInList(1,1);
		ll.insertInList(2,2);
		ll.insertInList(3,3);
		
		System.out.println("Linked List : ");
		ll.getList();
		System.out.println();
		ll.search(1);
		System.out.println("Size of list : " + ll.getSize());
		ll.deleteElement(2);
		ll.getList();
		System.out.println();
		ll.search(2);
		System.out.println("Size of list : " + ll.getSize());
		ll.deleteList();
		ll.getList();
		System.out.println();
		ll.search(2);
		System.out.println("Size of list : " + ll.getSize());		
	}

}
