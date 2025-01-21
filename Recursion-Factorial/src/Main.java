
import java.util.Scanner;

public class Main {
	public static int fact(int n) {
		
		if(n < 0) {
			return -1;
		}
		if(n == 1 || n == 0) {
			return 1;
		}
		return n * fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int n = scan.nextInt();
		
		System.out.println("Factorial: " + fact(n));
		
	}

}
