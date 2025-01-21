
public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
		System.out.println("Trie has been created");
	}
	
	public void insert(String word) {
		TrieNode current = root;
		for(int i = 0;i < word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.getChildren().get(ch);
			if(node == null) {
				node = new TrieNode();
				current.getChildren().put(ch, node);
			}
			current = node;
		}
		current.setEndOfString(true);
		System.out.println("Successfully inserted " + word  + " in Trie.");
	}

	public boolean search(String word) {
		TrieNode current = root;
		for(int i = 0;i < word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.getChildren().get(ch);
			if(node == null) {
				System.out.println(word + " does not exsist in Trie.");
				return false;
			}
			current = node;
		}
		if(current.isEndOfString()) {
			System.out.println(word + " exsist in Trie.");
			return true;
		} else {
			System.out.println(word + " is a prefix of another string in Trie.");
			return false;
		}
	}
	
	private boolean delete(TrieNode parentNode, String word, int index) {
		char ch = word.charAt(index);
		TrieNode current = parentNode.getChildren().get(ch);
		boolean isNodeCanBeDeleted;
		if(current.getChildren().size() > 1) {
			delete(current, word, index+1);
			return false;
		}
		if(index == word.length() -1) {
			if(current.getChildren().size() >= 1) {
				current.setEndOfString(false);
				return false;
			}
			else {
				parentNode.getChildren().remove(ch);
				return true;
			}
		}
		if(current.isEndOfString() == true) {
			delete(current, word, index+1);
			return false;
		}
		isNodeCanBeDeleted = delete(current, word, index+1);
		if(isNodeCanBeDeleted) {
			parentNode.getChildren().remove(ch);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deleteString(String word) {
		if(this.search(word) == true) {
			delete(root, word, 0);
		}
	}
}
