package SearchValue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		int arr[] = {1,2,3,4,5,6};
		int target = 4;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == target) {
				System.out.print("Index : " + i);
				break;
			}
		}
	}

}
