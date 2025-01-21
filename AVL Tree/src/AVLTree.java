import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
	
	private BinaryNode root;
	
	public AVLTree() {
		root = null;
	}
	
	public BinaryNode getRoot() {
		return root;
	}
	
	public void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.getValue() + " ");
		this.preOrder(node.getLeft());
		this.preOrder(node.getRight());
	}

	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		this.inOrder(node.getLeft());
		System.out.print(node.getValue() + " ");
		this.inOrder(node.getRight());
	}
	
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		this.postOrder(node.getLeft());
		this.postOrder(node.getRight());
		System.out.print(node.getValue() + " ");
	}
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			System.out.print(node.getValue() + " ");
			if(node.getLeft() != null) {
				 queue.add(node.getLeft());
			}
			if(node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
	}
	
	public boolean search(BinaryNode node, int value) {
		if(node == null) {
			return false;
		}
		if(node.getValue() == value) {
			return true;
		}
		if(node.getValue() < value) {
			return search(node.getLeft(), value);
		}
		return search(node.getRight(), value);
	}
	
	public int getHeight(BinaryNode node) {
		if(node == null) {
			return 0;
		}
		return node.getHeight();
	}
	
	private BinaryNode rotateRight(BinaryNode disbalanceNode) {
		BinaryNode newRoot = disbalanceNode.getLeft();
		disbalanceNode.setLeft(disbalanceNode.getLeft().getRight());
		newRoot.setRight(disbalanceNode);
		disbalanceNode.setHeight(1 + Math.max(getHeight(disbalanceNode.getLeft()), getHeight(disbalanceNode.getRight())));
		newRoot.setHeight(1 + Math.max(getHeight(newRoot.getLeft()), getHeight(newRoot.getRight())));
		return newRoot;
	}
	
	private BinaryNode rotateLeft(BinaryNode disbalanceNode) {
		BinaryNode newRoot = disbalanceNode.getRight();
		disbalanceNode.setRight(disbalanceNode.getRight().getLeft());
		newRoot.setLeft(disbalanceNode);
		disbalanceNode.setHeight(1 + Math.max(getHeight(disbalanceNode.getLeft()), getHeight(disbalanceNode.getRight())));
		newRoot.setHeight(1 + Math.max(getHeight(newRoot.getLeft()), getHeight(newRoot.getRight())));
		return newRoot;
	}

	public int getBalance(BinaryNode node) {
		if(node == null) {
			return 0;
		}
		return getHeight(node.getLeft()) - getHeight(node.getRight());
	}
	
	private BinaryNode insertNode(BinaryNode node, int newValue) {
		if(node == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.setValue(newValue);
			newNode.setHeight(1);
			return newNode;
		}
		else if(newValue < node.getValue()) {
			node.setLeft(insertNode(node.getLeft(), newValue));
		}
		else {
			node.setRight(insertNode(node.getRight(), newValue));
		}
		
		node.setHeight(1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight())));
		
		int balance = getBalance(node);
		
		if(balance > 1 && newValue < node.getLeft().getValue()) {
			return rotateRight(node);
		}
		
		else if(balance > 1 && newValue > node.getLeft().getValue()) {
			node.setLeft(rotateLeft(node.getLeft()));
			return rotateRight(node);
		}
		
		else if(balance < -1 && newValue > node.getRight().getValue()) {
			return rotateLeft(node);
		}
		
		else if(balance < -1 && newValue < node.getRight().getValue()) {
			node.setRight(rotateRight(node.getRight()));
			return rotateLeft(node);
		}
		
		return node;
		
	}
	
	public void insert(int newValue) {
		root = insertNode(root, newValue);
	}
	
	public BinaryNode minNode(BinaryNode root) {
		if(root.getLeft()== null) {
			return root;
		}
		return minNode(root.getLeft());
	}
	
	public BinaryNode deleteNode(BinaryNode node, int value) {
		if(node == null) {
			System.out.println("Value not found in AVL Tree");
			return null;
		}
		if(value < node.getValue()) {
			node.setLeft(deleteNode(node.getLeft(), value));
		}
		else if(value > node.getValue()) {
			node.setRight(deleteNode(node.getRight(), value));
		}
		else {
			if(node.getLeft() != null && node.getRight() != null) {
				BinaryNode temp = node;
				BinaryNode minRight = minNode(temp.getRight());
				node.setValue(minRight.getValue());
				node.setRight(deleteNode(node.getRight(), minRight.getValue()));
			}
			else if(node.getLeft() != null) {
				node = node.getLeft();
			}
			else if(node.getRight() != null) {
				node = node.getRight();
			}
			else {
				node = null;
			}
		}
		
		int balance = getBalance(node);
		
		if(balance > 1 && getBalance(node.getLeft()) >= 0) {
			return rotateRight(node);
		}
		
		else if(balance > 1 && getBalance(node.getLeft()) < 0) {
			node.setLeft(rotateLeft(node.getLeft()));
			return rotateRight(node);
		}
		
		else if(balance < -1 && getBalance(node.getRight()) <= 0) {
			return rotateLeft(node);
		}
		
		else if(balance < -1 && getBalance(node.getRight()) > 0) {
			node.setRight(rotateRight(node.getRight()));
			return rotateLeft(node);
		}
		
		return node;
		
	}
	
	public void delete(int newValue) {
		root = deleteNode(root, newValue);
	}
	
	public void deleteTree() {
		root = null;
		System.out.println("AVL Tree is deleted successfully.");
	}
	
}
