package treeArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree(9);
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");
		
		bt.preOrder(1);
		System.out.println();
		bt.inOrder(1);
		System.out.println();
		bt.postOrder(1);
		System.out.println();
		bt.levelOrder();
		System.out.println();
		bt.search("N5");
		
		bt.delete("N5");
		bt.levelOrder();
		bt.deleteTree();
		
	}

}
