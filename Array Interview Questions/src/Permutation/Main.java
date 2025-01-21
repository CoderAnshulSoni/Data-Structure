package Permutation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] array1 = {1,2,3,4,5};
	    int[] array2 = {5,4,3,2,1};
	    
	    if(array1.length != array2.length) {
	    	System.out.println("No Permutation");
	    }
	    else {
	       
		    int sum1 = 0;
		    int sum2 = 0;
		    int pro1 = 1;
		    int pro2 = 1;
		    
		    for(int i = 0;i < array1.length;i++) {
		    	sum1 = sum1 + array1[i];
		    	sum2 = sum2 + array2[i];
		    	pro1 = pro1 * array1[i];
		    	pro2 = pro2 * array2[i];
		    }
		    
		    if(sum1 == sum2 && pro1 == pro2) {
		    	System.out.println("Permutation");
		    }
		    else {
		    	System.out.println("No Permutation");
		    }
	    }
	}

}
