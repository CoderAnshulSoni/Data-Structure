package StackMinimum;

public class StackMinimum {
	
	@SuppressWarnings("unused")
	private Node top;
	private Node minimum;

	public StackMinimum(){
		top = null;
		minimum = null;
	}
	
	public int min() {
		return minimum.getValue();
	}
	
	public void push(int value) {
		if(minimum == null) {
			minimum = new Node(value,minimum);
		}
		else if(minimum.getValue() < value) {
			
		}
	}
	
//	public int pop() {
		
//	}
	
}
