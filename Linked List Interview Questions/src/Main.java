
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListClass ll = new LinkedListClass();
		ll.createLinkedList(1);
		ll.insertNode(2);
		ll.insertNode(0);
		ll.insertNode(3);
		ll.insertNode(5);
		
		ll.traversal();
		
		Questions q1 = new Questions();
		q1.deleteDuplicate(ll);
		ll.traversal();
		System.out.println(q1.nthNodefromLast(ll, 1).getValue());
		ll = q1.partitionOnN(ll, 1);
		ll.traversal();
		
		LinkedListClass ll1 = new LinkedListClass();
		ll1.insertNode(7);
		ll1.insertNode(1);
		ll1.insertNode(6);
		ll1.traversal();
		LinkedListClass ll2 = new LinkedListClass();
		ll2.insertNode(5);
		ll2.insertNode(9);
		ll2.insertNode(2);
		ll2.traversal();
		LinkedListClass sum = q1.sumOflinkedLists(ll1, ll2);
		sum.traversal();
		LinkedListClass ll3 = new LinkedListClass();
		ll3.insertNode(3);
		ll3.insertNode(1);
		ll3.insertNode(5);
		ll3.insertNode(9);
		
		LinkedListClass ll4 = new LinkedListClass();
		ll4.insertNode(2);
		ll4.insertNode(4);
		ll4.insertNode(6);
		
		q1.addSameNodeToLists(ll3, ll4, 7);
		q1.addSameNodeToLists(ll3, ll4, 2);
		q1.addSameNodeToLists(ll3, ll4, 1);
		
		Node inter = q1.intersectionNode(ll3, ll4);
		System.out.println(inter.getValue());
		ll3.traversal();
		ll4.traversal();
	}

}
