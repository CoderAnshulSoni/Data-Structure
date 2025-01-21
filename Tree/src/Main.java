
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot Drinks");
		TreeNode cold = new TreeNode("Cold Drinks");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		TreeNode frooti = new TreeNode("Frooti");
		TreeNode latte = new TreeNode("Latte");
		
		drinks.addChild(hot);
		drinks.addChild(cold);
		hot.addChild(tea);
		hot.addChild(coffee);
		
		cold.addChild(frooti);
		cold.addChild(latte);
		
		System.out.println(drinks.print(0));

	}

}
