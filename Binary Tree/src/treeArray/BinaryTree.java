package treeArray;

public class BinaryTree {
	
	private String array[];
	private int lastUsedIndex;
	
	public BinaryTree(int size) {
		array = new String[size+1];
		this.lastUsedIndex = 0;
		System.out.println("Created Tree Successfully of size : " + size);
	}

	public boolean isFull() {
		if(lastUsedIndex == array.length-1) {
			return true;
		}
		return false;
	}
	
	public void insert(String value) {
		if(this.isFull()) {
			System.out.println("Tree is full. No further insertion");
			return;
		}
		array[lastUsedIndex+1] = value;
		lastUsedIndex++;
		System.out.println("Successfull insertion");
	}
	
	public void preOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		System.out.print(array[index] + "  ");
		preOrder(2*index);
		preOrder(2*index + 1);
	}
	
	public void inOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		inOrder(2*index);
		System.out.print(array[index] + "  ");
		inOrder(2*index + 1);
	}
	
	public void postOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		postOrder(2*index);
		postOrder(2*index + 1);
		System.out.print(array[index] + "  ");
	}
	
	public void levelOrder() {
		for(int i = 1;i <= lastUsedIndex;i++) {
			System.out.print(array[i] + "  ");
		}
	}
	
	public int search(String value) {
		for(int i = 1;i <= lastUsedIndex;i++) {
			if(array[i] == value) {
				System.out.println("Value is present in Binary Tree array at index : " + i);
				return i;
			}
		}
		System.out.println("Value is NOT present in Binary Tree array");
		return -1;
	}
	
	public void delete(String value) {
		int location = this.search(value);
		if(location == -1) {
			System.out.println("Value is NOT present in Binary Tree array");
			return;
		}
		array[location] = array[lastUsedIndex];
		lastUsedIndex--;
		System.out.println("Value is deleted from Binary Tree array");
	}
	public void deleteTree() {
		try {
			array = null;
			System.out.println("Binary Tree array is deleted");	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
