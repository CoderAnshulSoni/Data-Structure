import java.util.HashSet;

public class Questions {
	
	public void deleteDuplicate(LinkedListClass ll) {

		HashSet<Integer> set = new HashSet<>();
		Node currentNode = ll.getHead();
		Node previousNode = null;
		
		for(int i = 0;i < ll.getSize();i++) {			
			if(set.contains(currentNode.getValue())) {
				previousNode.setNext(currentNode.getNext());
				ll.setSize(ll.getSize()-1);
			}
			else {
				set.add(currentNode.getValue());
				previousNode = currentNode;
			}
			currentNode = currentNode.getNext();
		}
		
		System.out.println(set.toString());

	}
	
	public Node nthNodefromLast(LinkedListClass ll, int n) {
		Node p1 = ll.getHead();
		Node p2 = ll.getHead();
		
		for(int i = 1;i < n;i++) {
			if(p2 == null) {
				return null;
			}
			p2 = p2.getNext();
		}
		while(p2.getNext() != null) {
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		return p1;
	}
	
	public LinkedListClass partitionOnN(LinkedListClass ll, int n) {
		
		Node currNode = new Node();
		currNode = ll.getHead();
		ll.setTail(currNode);
		
		while(currNode != null) {
			Node next = currNode.getNext();
			if(currNode.getValue() < n) {
				currNode.setNext(ll.getHead());
				ll.setHead(currNode);
			} else {
				ll.getTail().setNext(currNode);
				ll.setTail(currNode);
			}
			currNode = next;
		}
		ll.getTail().setNext(null);
		return ll;		
	}
	
	public LinkedListClass sumOflinkedLists(LinkedListClass ll1, LinkedListClass ll2) {
		
		Node n1 = ll1.getHead();
		Node n2 = ll2.getHead();
		int carry = 0;
		LinkedListClass sum = new LinkedListClass();
		while(n1 != null && n2 != null) {
			int temp = carry;
			if(n1 != null) {
				temp += n1.getValue();
				n1 = n1.getNext();
			}
			if(n2 != null) {
				temp += n2.getValue();
				n2 = n2.getNext();
			}
			sum.insertNode(temp%10);
			carry = temp/10;
		}
		if(n1 != null && n2 == null) {
			while(n1 != null) {
				sum.insertNode(n1.getValue());
				n1 = n1.getNext();
			}
		}
		if(n2 != null && n1 == null) {
			while(n2 != null) {
				sum.insertNode(n2.getValue());
				n2 = n2.getNext();
			}
		}
		return sum;
	}
	
	public Node getKthNode(Node head, int k) {
		Node curr = head;
		while(k>0 && curr != null) {
			curr = curr.getNext();
			k--;
		}
		return curr;
	}
	
	public Node intersectionNode(LinkedListClass ll1, LinkedListClass ll2) {
		if(ll1.getHead() == null || ll2.getHead() == null) {
			return null;
		}
		if(ll1.getTail() != ll2.getTail()) {
			return null;
		}
		Node longer = new Node();
		Node shorter = new Node();
		
		if(ll1.getSize() > ll2.getSize()) {
			longer = ll1.getHead();
			shorter = ll2.getHead();
		} else {
			longer = ll2.getHead();
			shorter = ll1.getHead();
		}
		
		longer = getKthNode(longer, Math.abs(ll1.getSize()-ll2.getSize()));
		
		while(longer != shorter) {
			longer = longer.getNext();
			shorter = shorter.getNext();
		}
		
		return longer;
	}
	
	public void addSameNodeToLists(LinkedListClass ll1, LinkedListClass ll2, int nodeValue) {
		Node node = new Node();
		node.setValue(nodeValue);
		
		ll1.getTail().setNext(node);
		ll1.setTail(node);
		ll1.setSize(ll1.getSize()+1);
		
		ll2.getTail().setNext(node);
		ll2.setTail(node);
		ll2.setSize(ll2.getSize()+1);
	}
	
}
