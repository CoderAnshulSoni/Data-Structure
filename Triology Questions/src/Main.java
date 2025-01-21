import java.util.ArrayList;

public class Main {

	public static boolean checkTheString(String a, String b) {
		char ch1[] = a.toCharArray();
		char ch2[] = b.toCharArray();
		
		ArrayList<Character> arr1 = new ArrayList<>();
		ArrayList<Character> arr2 = new ArrayList<>();
		
		for(int i = 0;i < a.length();i++) {
			if(ch1[i] != ch2[i]) {
				arr1.add(ch1[i]);
				arr2.add(ch2[i]);
			}
		}
		
		if(arr1.size() == 0 && arr2.size() == 0) {
			return true;
		}
		
		if(arr1.size() == arr2.size() && arr1.size() == 2) {
			if(arr1.get(0) == arr2.get(1) && arr2.get(0) == arr1.get(1)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "geeksforgeeks";
		String b = "seeksforgeekg";
		
		boolean result = checkTheString(a, b);
		
		System.out.println(result);
	}

}
