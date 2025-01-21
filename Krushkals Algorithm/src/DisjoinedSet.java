
import java.util.ArrayList;

public class DisjoinedSet {

	private ArrayList<GraphNode> nodeList = new ArrayList<>();
	
	public static void makeSet(ArrayList<GraphNode> nodeList) {
		for(GraphNode node : nodeList) {
			DisjoinedSet set = new DisjoinedSet();
			set.nodeList.add(node);
			node.set = set;
		}
	}
	
	public static DisjoinedSet findSet(GraphNode node) {
		return node.set;
	}
	
	public static DisjoinedSet union(GraphNode node1, GraphNode node2) {
		if(node1.set.equals(node2.set)) {
			return null;
		}
		else {
			DisjoinedSet set1 = node1.set;
			DisjoinedSet set2 = node2.set;
			
			if(set1.nodeList.size() > set2.nodeList.size()) {
				ArrayList<GraphNode> nodeSet2 = set2.nodeList;
				for(GraphNode node : nodeSet2) {
					node.set = set1;
					set1.nodeList.add(node);
				}
				return set1;
			}
			else {
				ArrayList<GraphNode> nodeSet1 = set1.nodeList;
				for(GraphNode node : nodeSet1) {
					node.set = set2;
					set2.nodeList.add(node);
				}
				return set2;
			}
		}
	}

	public void printAllNodesOfThisSet() {
		System.out.println("Printing all nodes of the set");
		for(GraphNode node : nodeList) {
			System.out.print(node + " ");
		}
		System.out.print("\n");
	}
}