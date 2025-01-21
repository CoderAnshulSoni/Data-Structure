package Question6;

public class Main {
	
	public static void reverse(int[] arr) {
		
		for(int i = 0;i < arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		reverse(arr);
		
		System.out.print("Reverse : ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
}
