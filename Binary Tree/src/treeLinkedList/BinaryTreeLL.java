package treeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	
	private BinaryNode root;
	
	public BinaryTreeLL() {
		root = null;
	}
	
	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	public void preOrderTraversal(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.getValue() + " ");
		preOrderTraversal(node.getLeftChild());
		preOrderTraversal(node.getRightChild());
	}
	
	public void inOrderTraversal(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrderTraversal(node.getLeftChild());
		System.out.print(node.getValue() + " ");
		inOrderTraversal(node.getRightChild());
	}
	
	public void postOrderTraversal(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrderTraversal(node.getLeftChild());
		postOrderTraversal(node.getRightChild());
		System.out.print(node.getValue() + " ");
	}

	public void levelOrderTraversal() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			System.out.print(node.getValue() + " ");
			if(node.getLeftChild() != null) {
				queue.add(node.getLeftChild());
			}
			if(node.getRightChild() != null) {
				queue.add(node.getRightChild());
			}
		}
	}
	
	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			if(node.getValue() == value) {
				System.out.println("Success");
				return;
			}
			else {
				if(node.getLeftChild() != null) {
					queue.add(node.getLeftChild());
				}
				if(node.getRightChild() != null) {
					queue.add(node.getRightChild());
				}
			}
		}
		System.out.println("Fail");
	}
	
	public void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.setValue(value);
		if(root == null) {
			root = newNode;
			System.out.println("Success Root");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			if(node.getLeftChild() == null) {
				node.setLeftChild(newNode);
				System.out.println("Success");
				break;
			}
			else if(node.getRightChild() == null) {
				node.setRightChild(newNode);
				System.out.println("Success");
				break;
			}
			else {
				queue.add(node.getLeftChild());
				queue.add(node.getRightChild());
			}
		}
	}
	
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode node = null;
		while(!queue.isEmpty()) {
			node = queue.remove();
			if(node.getLeftChild() != null) {
				queue.add(node.getLeftChild());
			}
			if(node.getRightChild() != null) {
				queue.add(node.getRightChild());
			}
		}
		return node;
	}
	
	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);	
		BinaryNode prevNode = null;
		BinaryNode node = null;
		while(!queue.isEmpty()) {
			prevNode = node;
			node = queue.remove();
			if(node.getLeftChild() == null) {
				prevNode.setRightChild(null);
				return;
			}
			else if(node.getRightChild() == null) {
				prevNode.setLeftChild(null);
				return;
			}
			else {
				queue.add(node.getLeftChild());
				queue.add(node.getRightChild());
			}
		}
	}
	
	public void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode node = null;
		while(!queue.isEmpty()) {
			node = queue.remove();
			if(node.getValue() == value) {
				node.setValue(this.getDeepestNode().getValue());
				this.deleteDeepestNode();
				System.out.println("Delete Successfull");
				return;
			}
			if(node.getLeftChild() != null) {
				queue.add(node.getLeftChild());
			}
			if(node.getRightChild() != null) {
				queue.add(node.getRightChild());
			}
		}
		System.out.println("Delete UnSuccessfull : Node is not present in tree");	
	}
	
	public void deleteBinaryTree() {
		this.root = null;
		System.out.println("Delete Binary Tree Successfull");
	}
	
}
