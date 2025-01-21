
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
		bst.preOrder(bst.getRoot());
		System.out.println();
		bst.inOrder(bst.getRoot());
		System.out.println();
		bst.postOrder(bst.getRoot());
		System.out.println();
		bst.levelOrder();
		System.out.println("\n");
		
		bst.search(bst.getRoot(), 100);
		System.out.println();
		
		bst.deleteNode(bst.getRoot(), 700);
		bst.deleteNode(bst.getRoot(), 70);
		bst.inOrder(bst.getRoot());
		System.out.println();
		
		bst.deleteTree();
		bst.levelOrder();
		System.out.println("\n");
	}

}
