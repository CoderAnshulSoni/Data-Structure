package Pairs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[] arr = {2,7,13,15,7};
	    int target = 9;
	    for(int i = 0;i < arr.length;i++) {
	    	for(int j = i;j < arr.length;j++) {
	    		if((arr[i] + arr[j]) == target) {
	    			System.out.println("Pair : [" + i + "][" + j + "]");
	    		}
	    	}
	    }
	    
	    
	}

}
