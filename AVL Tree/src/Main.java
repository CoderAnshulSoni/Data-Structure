
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AVLTree avl = new AVLTree();
		
		avl.levelOrder();
		System.out.println();
		
		avl.insert(30);
		avl.levelOrder();
		System.out.println();
		avl.insert(25);
		avl.levelOrder();
		System.out.println();
		avl.insert(35);
		avl.levelOrder();
		System.out.println();
		avl.insert(20);
		avl.levelOrder();
		System.out.println();
		avl.insert(15);
		avl.levelOrder();
		System.out.println();
		avl.insert(5);
		avl.levelOrder();
		System.out.println();
		avl.insert(10);
		avl.levelOrder();
		System.out.println();
		avl.insert(50);
		avl.levelOrder();
		System.out.println();
		avl.insert(60);
		avl.levelOrder();
		System.out.println();
		avl.insert(70);
		avl.levelOrder();
		System.out.println();
		avl.insert(65);
		avl.levelOrder();
		System.out.println();
		
		
		avl.delete(30);
		avl.levelOrder();
		System.out.println();
		avl.delete(25);
		avl.levelOrder();
		System.out.println();
		avl.delete(35);
		avl.levelOrder();
		System.out.println();
		avl.delete(20);
		avl.levelOrder();
		System.out.println();
		avl.delete(15);
		avl.levelOrder();
		System.out.println();
		avl.delete(5);
		avl.levelOrder();
		System.out.println();
		avl.delete(10);
		avl.levelOrder();
		System.out.println();
		avl.delete(50);
		avl.levelOrder();
		System.out.println();
		avl.delete(60);
		avl.levelOrder();
		System.out.println();
		avl.delete(70);
		avl.levelOrder();
		System.out.println();
		avl.delete(65);
		avl.levelOrder();
		System.out.println();
		
		avl.deleteTree();
	}

}
