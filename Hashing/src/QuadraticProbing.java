import java.util.ArrayList;

public class QuadraticProbing {
	
	String[] hashTable;
	int usedCellNum;
	
	public QuadraticProbing(int size) {
		hashTable = new String[size];
		usedCellNum = 0;
	}
	
	public int modASCII(String word, int cellNum) {
		char ch[] = word.toCharArray();
		int i, sum = 0;
		for(i = 0;i < ch.length;i++) {
			sum = sum + ch[i];
		}
		return sum % cellNum;
	}
	
	public double getLoadFactor() {
		return usedCellNum * 1.0/hashTable.length;
	}
	
	public void rehashKeys(String word) {
		usedCellNum = 0;
		ArrayList<String> array = new ArrayList<>();
		for(String s : hashTable) {
			array.add(s);
		}
		array.add(word);
		
		hashTable = new String[2*hashTable.length];
		for(String s : array) {
			insertInHashTable(s);
		}
	}
	
	public void displayHashTable() {
		if(hashTable == null) {
			System.out.println("HashTable does not exsist.");
			return;
		}
		else {
			System.out.println("----------HashTable-------");
			for(int i = 0;i < hashTable.length;i++) {
				System.out.println("Index " + i + ", key " + hashTable[i]);
			}
		}
	}
	
	public void insertInHashTable(String word) {
		double lf = getLoadFactor();
		if(lf >= 0.75) {
			this.rehashKeys(word);
			return;
		}
		else {
			int index = this.modASCII(word, hashTable.length);
			int count = 0;
			for(int i = index;i < index + hashTable.length;i++) {
				int newIndex = (index + (count * count)) % hashTable.length;
				if(hashTable[newIndex] == null) {
					hashTable[newIndex] = word;
					System.out.println("Successfully inserted word : " + word);
					break;
				}
				else {
					System.out.println("Index is already occupied. Trying next empty cell");
				}
				count++;
			}
		}
		usedCellNum++;
	}
	
	public boolean search(String word) {
		int index = modASCII(word, hashTable.length);
		for(int i = index;i < index + hashTable.length;i++) {
			int newIndex = i % hashTable.length;
			if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				System.out.println(word + " is present in hashTable at : " + newIndex);
				return true;
			}
		}
		System.out.println(word + " is not present in hashTable");
		return false;
	}
	
	public void delete(String word) {
		if(hashTable == null) {
			System.out.println("HashTable does not exsist.");
			return;
		}
		int index = modASCII(word, hashTable.length);
		for(int i = index;i < index + hashTable.length;i++) {
			int newIndex = i % hashTable.length;
			if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				hashTable[newIndex] = null;
				System.out.println(word + " has been deleted from HashTable");
				return;
			}
		}
		System.out.println(word + " has not been found from HashTable");
	}

}
