package question1;

public class Main {

	public static int sum(int n) {
		if(n <= 0) {
			return 0;
		}
		if(n < 10) {
			return n;
		}
		
		return (n%10) + sum(n/10);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 111;
		System.out.println("Sum : " +sum(n));
	}

}
