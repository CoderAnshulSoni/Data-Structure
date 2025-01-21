
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie t = new Trie();
		
		t.insert("API");
		t.insert("APIS");
		
		t.search("API");
		
		t.deleteString("APIS");
		t.search("APIS");
	}

}
