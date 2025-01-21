package Question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		int product = 1;
		
		for(int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
			product = product * arr[i];
		}
		
		System.out.println("Sum : " + sum);
		System.out.println("Product : " + product);
		
	}

}
