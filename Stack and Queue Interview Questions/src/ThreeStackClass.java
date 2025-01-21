
public class ThreeStackClass {
	
	private int noOfStacks = 3;
	private int stackCapacity;
	private int values[];
	private int size[];
	
	public ThreeStackClass(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackSize * noOfStacks];
		size = new int[noOfStacks];
	}
	
	public boolean isFull(int stackNumber) {
		if(size[stackNumber] == stackCapacity) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(int stackNumber) {
		if(size[stackNumber] == 0) {
			return true;
		}
		return false;
	}
	
	private int indexOfTop(int stackNumber) {
		int offSet = stackCapacity * stackNumber;
		int s = size[stackNumber];
		return offSet + s - 1;
	}
	
	public void push(int stackNumber, int value) {
		if(this.isFull(stackNumber)) {
			System.out.println("Stack is Full.");
			return;
		}
		size[stackNumber]++;
		values[indexOfTop(stackNumber)] = value;
	}
	
	public int pop(int stackNumber) {
		if(this.isEmpty(stackNumber)) {
			System.out.println("Stack is Empty.");
			return -1;
		}
		int value = values[indexOfTop(stackNumber)];
		values[indexOfTop(stackNumber)] = 0;
		size[stackNumber]--;
		return value;
	}
	
	public int peek(int stackNumber) {
		if(this.isEmpty(stackNumber)) {
			System.out.println("Stack is Empty.");
			return -1;
		}
		int value = values[indexOfTop(stackNumber)];
		return value;
	}
	
}
