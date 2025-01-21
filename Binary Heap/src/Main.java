
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryHeap bh = new BinaryHeap(10);
		
		bh.insert(5, "Max");
		bh.insert(10, "Max");
		bh.insert(20, "Max");
		bh.insert(30, "Max");
		bh.insert(40, "Max");
		bh.insert(50, "Max");
		bh.insert(60, "Max");
		bh.insert(1, "Max");

		bh.peek();
		
		System.out.println(bh.getSizeOfTree());
		
		bh.levelOrder();
//		bh.preOrder(1);
//		System.out.println();
//		bh.inOrder(1);
//		System.out.println();
//		bh.postOrder(1);
		System.out.println();
		
		bh.extractHeadOfHeap("Max");
		bh.levelOrder();
		bh.extractHeadOfHeap("Max");
		bh.levelOrder();
		bh.extractHeadOfHeap("Max");
		bh.levelOrder();
		
		bh.deleteHeap();
		bh.levelOrder();
	}

}
