
import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
	
	private BinaryNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public BinaryNode getRoot() {
		return root;
	}
	
	private BinaryNode insert(BinaryNode currentNode, int value) {
		if(currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.setValue(value);
			System.out.println("BST is created with node : " + newNode.getValue());
			return newNode;
		}
		else if(value <= currentNode.getValue()) {
			currentNode.setLeftChild(insert(currentNode.getLeftChild(), value));
			return currentNode;
		}
		else {
			currentNode.setRightChild(insert(currentNode.getRightChild(), value));
			return currentNode;
		}
	}
	
	public void insert(int value) {
		root = insert(root,value);
	}

	public void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.getValue() + "  ");
		preOrder(node.getLeftChild());
		preOrder(node.getRightChild());
		
	}
	
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.getLeftChild());
		System.out.print(node.getValue() + "  ");
		inOrder(node.getRightChild());		
	}
	
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.getLeftChild());
		postOrder(node.getRightChild());
		System.out.print(node.getValue() + "  ");
	}
	
	public void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.getValue() + "  ");
			if(presentNode.getLeftChild() != null) {
				queue.add(presentNode.getLeftChild());
			}
			if(presentNode.getRightChild() != null) {
				queue.add(presentNode.getRightChild());
			}
		}
	}
	
	public boolean search(BinaryNode currNode, int value) {
		if(currNode == null) {
			System.out.println("Value is not present in BST");
			return false;
		}
		else if(currNode.getValue() == value) {
			System.out.println("Value is present in BST");
			return true;
		}
		else if(currNode.getValue() > value) {
			return search(currNode.getLeftChild(), value);
		}
		else if(currNode.getValue() < value) {
			return search(currNode.getRightChild(), value);
		}
		return false;
	}
	
	public BinaryNode minNode(BinaryNode currNode) {
		if(currNode.getLeftChild() == null) {
			return currNode;
		}
		return minNode(currNode.getLeftChild());
	}
	
	public BinaryNode deleteNode(BinaryNode currNode, int value) {
		if(currNode == null) {
			System.out.println("Value is not present in BST");
			return null;
		}
		else if(value < currNode.getValue()) {
			currNode.setLeftChild(deleteNode(currNode.getLeftChild(), value));
		}
		else if(value > currNode.getValue()) {
			currNode.setRightChild(deleteNode(currNode.getRightChild(), value));
		}
		else {
			if(currNode.getLeftChild() != null && currNode.getRightChild() != null) {
//				BinaryNode temp = currNode;
				BinaryNode minRight = this.minNode(currNode.getRightChild());
				currNode.setValue(minRight.getValue());
				currNode.setRightChild(deleteNode(currNode.getRightChild(), minRight.getValue()));
			}
			else if(currNode.getLeftChild() != null) {
				currNode = currNode.getLeftChild();
			}
			else if(currNode.getRightChild() != null) {
				currNode = currNode.getRightChild();
			}
			else {
				currNode = null;
			}
		}
		return currNode;
	}
	
	public void deleteTree() {
		root = null;
		System.out.println("BST is deleted successfully.");
	}
	
}
