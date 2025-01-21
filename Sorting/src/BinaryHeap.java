
public class BinaryHeap {
	
	int arr[];
	int sizeOfTree;
	
	public BinaryHeap(int size) {
		arr = new int[size + 1];
		sizeOfTree = 0;
		System.out.println("Heap has been created");
	}

	public int getSizeOfTree() {
		return sizeOfTree;
	}

	public void setSizeOfTree(int sizeOfTree) {
		this.sizeOfTree = sizeOfTree;
	}
	
	public boolean isEmpty() {
		if(sizeOfTree <= 0) {
			return true;
		}
		return false;
	}
	
	public void levelOrder() {
		for(int i = 1;i <= sizeOfTree && arr != null;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void heapifyBottomToTop(int index, String heapType) {
		int parent = index / 2;
		if( index <= 1) {
			return;
		}
		else if(heapType == "Min") {
			if(arr[index] < arr[parent]) {
				int temp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = temp;
			}
		}
		else if(heapType == "Max"){
			if(arr[index] > arr[parent]) {
				int temp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = temp;
			}
		}
		heapifyBottomToTop(parent, heapType);
	}
	
	public void insert(int value, String heapType) {
		if(sizeOfTree == arr.length) {
			System.out.println("Tree in full");
			return;
		}
		arr[sizeOfTree + 1] = value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree, heapType);
		
		System.out.println("Value is inserted successfully");
	}
	
	public void heapifyTopToBottom(int index, String heapType) {
		int left = index * 2;
		int right = (2*index) + 1;
		int swapChild = index;
		if( sizeOfTree < left) {
			return;
		}
		else if(heapType == "Max") {
			if(sizeOfTree == left) {
				if(arr[index] < arr[left]) {
					int temp = arr[index];
					arr[index] = arr[left];
					arr[left] = temp;
				}
				return;
			}
			else {
				if(arr[left] > arr[right]) {
					swapChild = left;
				}
				else {
					swapChild = right;
				}
				if(arr[index] < arr[swapChild])
				{
					int temp = arr[index];
					arr[index] = arr[swapChild];
					arr[swapChild] = temp;
				}
			}
		}
		else if(heapType == "Min"){
			if(sizeOfTree == left) {
				if(arr[index] > arr[left]) {
					int temp = arr[index];
					arr[index] = arr[left];
					arr[left] = temp;
				}
				return;
			}
			else {
				if(arr[left] < arr[right]) {
					swapChild = left;
				}
				else {
					swapChild = right;
				}
				if(arr[index] > arr[swapChild])
				{
					int temp = arr[index];
					arr[index] = arr[swapChild];
					arr[swapChild] = temp;
				}
			}
		}
		heapifyTopToBottom(swapChild, heapType);
	}	
	
	public int extractHeadOfHeap(String heapType) {
		if(isEmpty()) {
			System.out.println("Binary Heap is Empty");
			return -1;
		}
		int extract = arr[1];
		arr[1] = arr[sizeOfTree];
		sizeOfTree--;
		heapifyTopToBottom(1, heapType);
		return extract;
	}
	
	public void deleteHeap() {
		arr = null;
		System.out.println("Binary Heap is deleted successfully");
	}
	
}
