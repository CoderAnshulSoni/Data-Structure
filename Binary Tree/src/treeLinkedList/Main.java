package treeLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeLL bt = new BinaryTreeLL();
	
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");	
		
		
		System.out.print("Pre Oreder Traversal : ");
		bt.preOrderTraversal(bt.getRoot());
		System.out.print("\nIn Oreder Traversal : ");
		bt.inOrderTraversal(bt.getRoot());
		System.out.print("\nPost Oreder Traversal : ");
		bt.postOrderTraversal(bt.getRoot());
		
		System.out.print("\nLevel Oreder Traversal : ");
		bt.levelOrderTraversal();
		
		System.out.print("\nSearch n5 : ");
		bt.search("N5");
		System.out.println();
		System.out.println(bt.getDeepestNode().getValue());
		
		bt.deleteNode("N3");
		System.out.print("\nLevel Oreder Traversal : ");
		bt.levelOrderTraversal();
		
		System.out.println();
		bt.deleteBinaryTree();
		
	}

}
