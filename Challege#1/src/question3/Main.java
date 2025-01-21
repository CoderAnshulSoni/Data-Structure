package question3;

public class Main {

	public static int GCD(int n1, int n2) {
		if(n1 < 0 || n2 < 0) {
			return -1;
		}
		if(n2 == 0) {
			return n1;
		}
		return GCD(n2, n1 % n2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 4;
		int n2 = 8;
		System.out.println("GCD : " + GCD(n1, n2));

	}

}
