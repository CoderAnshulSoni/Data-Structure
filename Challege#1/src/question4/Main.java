package question4;

public class Main {
	
	public static int bin(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return (n%2) + bin(n/2) * 10;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 54;
		System.out.println("Binary : " + bin(n));
	}
}
