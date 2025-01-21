package MaxProduct;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,60,30,40,50};
		
		int max = 0;
		
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(max < arr[i]*arr[j]) {
					max = arr[i]*arr[j];
				}
			}
		}
		System.out.print("Max Product: " + max);
	}

}
