package UniqueArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,6,5};
		
		int flag = 0;
		
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.print("Array is unique");
		}
		else {
			System.out.print("Array has repetitive elements");
		}
		
	}

}
