package question2;

public class Main {
	public static int pow(int n, int p) {
		if(p <= 0) {
			return 1;
		}
		if (p == 1) {
			return n;
		}
		
		return n * pow(n,p-1);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -3;
		int p = 3;
		System.out.println("Sum : " +pow(n,p));

	}

}
