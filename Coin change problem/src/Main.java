import java.util.Arrays;

public class Main {

	public static void coinChangeProblem(int[] coins, int n) {
		
		Arrays.sort(coins);
		int index = coins.length-1;
		
		while(true) {
			int coinValue = coins[index];
			index--;
			int maxAmount = (n/coinValue) * coinValue;
			if(maxAmount > 0) {
				System.out.println("Coin Value : " + coinValue + " taken count : " + (n/coinValue));
				n = n-maxAmount;
			}
			if(n == 0) {
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coins = {1,2,5,10,20,50,100,1000};
		int amount = 2035;
		
		System.out.println("Coins Available : " + Arrays.toString(coins));
		System.out.println("Target Amount : " + amount);
		
		coinChangeProblem(coins, amount);
		
	}

}
