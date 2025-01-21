import java.util.LinkedList;

public class DirectChaining {
	
	LinkedList<String>[] hashTable;
	int maxChainSize = 5; 
	
	@SuppressWarnings("unchecked")
	public DirectChaining(int size){
		hashTable = new LinkedList[size];
	}
	
	//Hash Function
	public int modASCII(String word, int cellNum) {
		char ch[];
		ch = word.toCharArray();
		int i = 0, sum = 0;
		for(i = 0;i < ch.length;i++) {
			sum += ch[i];
		}
		return sum % cellNum;
	}

	public void insert(String word) {
		
		int index = modASCII(word, hashTable.length);
		if(hashTable[index] == null) {
			hashTable[index] = new LinkedList<>();
			hashTable[index].add(word);
		}
		else {
			hashTable[index].add(word);
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
	
	public boolean search(String word) {
		if(hashTable == null) {
			System.out.println("HashTable does not exsist.");
			return false;
		}
		int index = modASCII(word, hashTable.length);
		if(hashTable[index] != null && hashTable[index].contains(word)) {
			System.out.println("Value is present in HashTable at index " + index);
			return true;
		}
		else {
			System.out.println("Value not found in HashTable.");
			return false;
		}
	}
	
	public void delete(String word) {
		int index = modASCII(word, hashTable.length);
		if(search(word)) {
			hashTable[index].remove(word);
			System.out.println("Value is deleted from HashTable.");
		}
	}
	
}
