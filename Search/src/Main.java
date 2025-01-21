
public class Main {

	public static int linearSearch(int arr[], int value) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int arr[], int value) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == value) {
				return mid;
			}
			else if(value < arr[mid]) {
				end = mid - 1;
			}
			else if(value > arr[mid]) {
				start = mid + 1;
			}		
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,1,9,3,8,6};
		int search = linearSearch(arr, 8);
		System.out.println(search);
		
		int arr1[] = {0,1,2,3,4,5,6,7,8,9};
		search = binarySearch(arr1, 4);
		System.out.println(search);
	}

}
