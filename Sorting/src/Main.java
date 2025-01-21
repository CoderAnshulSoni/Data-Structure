import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void BubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0;i < n-1;i++) {
			for(int j = 0;j < n-i-1;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
// 	--------------------------------------------------------------------
	
	public static void SelectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0;i < n;i++) {
			int minIndex = i;
			for(int j = i+1;j < n;j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	
//	--------------------------------------------------------------------
	
	public static void InsertionSort(int arr[]) {
		int n = arr.length;
		for(int i = 1 ;i < n;i++ ) {
			int temp = arr[i], j = i;
			while(j > 0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
//	--------------------------------------------------------------------
	
	public static void printBuckets(ArrayList<Integer>[] buckets) {
		for(int i = 0;i < buckets.length;i++) {
			System.out.print("Bucket " + i + " : ");
			for(int j = 0;j < buckets[i].size();j++) {
				System.out.print(buckets[i].get(j) + " ");
			}
			System.out.println();
		}
	}
	
	public static void BucketSort(int arr[]) {
		int n = arr.length;
		int numberOfPackets = (int) Math.ceil(Math.sqrt(n));
		int maxValue = Integer.MIN_VALUE;
		for(int i : arr) {
			if(maxValue < i) {
				maxValue = i;
			}
		}
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[numberOfPackets];
		for(int i = 0;i < buckets.length;i++) {
			buckets[i] = new ArrayList<>();
		}
		
		for(int i : arr) {
			int bucketNum = (int) Math.ceil((float) i * numberOfPackets/(float) maxValue);
			buckets[bucketNum -1].add(i);
		}
		System.out.println("\nPrinting Buckets before sorting");
		printBuckets(buckets);
		System.out.println();
		for(ArrayList<Integer> bucket : buckets) {
			Collections.sort(bucket);
		}
		
		int index = 0;
		for(ArrayList<Integer> bucket : buckets) {
			for(int value : bucket) {
				arr[index] = value;
				index++;
			}
		}
	}
	
//	--------------------------------------------------------------------
	
	public static void merge(int arr[], int leftIndex, int midIndex, int rightIndex) {
		int[] leftArray = new int[midIndex - leftIndex + 2];
		int[] rightArray = new int[rightIndex - midIndex + 1];
		
		for(int i = 0;i <= midIndex - leftIndex;i++) {
			leftArray[i] = arr[leftIndex + i];
		}
		
		for(int i = 0;i < rightIndex - midIndex;i++) {
			rightArray[i] = arr[midIndex+ 1 + i];
		}
		
		leftArray[midIndex - leftIndex + 1] = Integer.MAX_VALUE;
		rightArray[rightIndex - midIndex] = Integer.MAX_VALUE;
		
		for(int i = 0, j = 0, k = leftIndex;k <= rightIndex;k++) {
			if(leftArray[i] < rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
		}
		
	}
	
	public static void MergeSort(int arr[], int leftIndex, int rightIndex) {
		if(rightIndex > leftIndex)
		{
			int mid = (leftIndex + rightIndex)/2;
			MergeSort(arr, leftIndex, mid);
			MergeSort(arr, mid+1, rightIndex);
			merge(arr, leftIndex, mid, rightIndex);
		}
	}
	
//	--------------------------------------------------------------------
	
//	RightMost element is selected as Pivot
	
	public static int partition(int arr[], int start, int end) {
		int pivot = end;
		int i = start - 1;
		for(int j = start;j <= end;j++) {
			if(arr[j] <= arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}
	
	public static void QuickSort(int arr[], int start, int end) {
		if(start < end) {
			int pivot = partition(arr, start, end);
			QuickSort(arr, start, pivot - 1);
			QuickSort(arr, pivot+1, end);
		}
	}
	
//	--------------------------------------------------------------------
	
	public static void HeapSort(int arr[]) {
		
		BinaryHeap bh = new BinaryHeap(arr.length);
		for(int i = 0;i < arr.length;i++) {
			bh.insert(arr[i], "Min");
		}
		for(int i = 0;i < arr.length;i++) {
			arr[i] = bh.extractHeadOfHeap("Min");
		}
	}
	
//	--------------------------------------------------------------------
	
	public static void print(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
//	--------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,4,2,1,3};
		System.out.print("Unsorted Array : ");
		print(arr);
//		BubbleSort(arr);
//		System.out.print("Bubble Sort : ");
//		print(arr);
//		System.out.println("------------------------------------");
//		SelectionSort(arr);
//		System.out.print("Selection Sort : ");
//		print(arr);
//		System.out.println("------------------------------------");
//		InsertionSort(arr);
//		System.out.print("Insertion Sort : ");
//		print(arr);
//		System.out.println("------------------------------------");
//		BucketSort(arr);
//		System.out.print("Bucket Sort : ");
//		print(arr);
//		System.out.println("------------------------------------");
//		MergeSort(arr, 0, arr.length-1);
//		System.out.print("Merge Sort : ");
//		print(arr);
//		System.out.println("------------------------------------");
//		QuickSort(arr, 0, arr.length-1);
//		System.out.print("Quick Sort : ");
//		print(arr);
//		System.out.println("------------------------------------");
		HeapSort(arr);
		System.out.print("Heap Sort : ");
		print(arr);
		System.out.println("------------------------------------");
		
	}

}
