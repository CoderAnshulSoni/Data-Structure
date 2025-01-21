
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DirectChaining hash = new DirectChaining(10);
//
//		hash.insert("Hii");
//		hash.insert("Anshul");
//		hash.insert("Foxx");
//		hash.insert("Foxx");
//		
//		hash.displayHashTable();
//		hash.search("Anshul");
//		
//		hash.delete("Anshul");
//		hash.delete("Soxx");
//		hash.displayHashTable();
		
//		LinearProbing hash = new LinearProbing(10);
//
//		hash.insertInHashTable("Hii");
//		hash.insertInHashTable("Anshul");
//		hash.insertInHashTable("Foxx");
//		hash.insertInHashTable("Foxx");
//		hash.insertInHashTable("quick");
//		hash.insertInHashTable("Fox");
//		
//		hash.displayHashTable();
//		hash.search("Anshul");
//		hash.search("Fo");
//		
//		hash.delete("Anshul");
//		hash.delete("Foxx");
//		hash.displayHashTable();
		
//		QuadraticProbing hash = new QuadraticProbing(10);
//
//		hash.insertInHashTable("Hii");
//		hash.insertInHashTable("Anshul");
//		hash.insertInHashTable("Foxx");
//		hash.insertInHashTable("Foxx");
//		hash.insertInHashTable("quick");
//		hash.insertInHashTable("Fox");
//		
//		hash.displayHashTable();
//		hash.search("Anshul");
//		hash.search("Fo");
//		
//		hash.delete("Anshul");
//		hash.delete("Foxx");
//		hash.displayHashTable();
		
		DoubleHashing hash = new DoubleHashing(10);

		hash.insertInHashTable("Hii");
		hash.insertInHashTable("Anshul");
		hash.insertInHashTable("Foxx");
		hash.insertInHashTable("Foxx");
		hash.insertInHashTable("quick");
		hash.insertInHashTable("Fox");
		
		hash.displayHashTable();
		hash.search("Anshul");
		hash.search("Fo");
		
		hash.delete("Anshul");
		hash.delete("Foxx");
		hash.displayHashTable();
	}

}
