import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<GraphNode> nodeList = new ArrayList<>();
		nodeList.add(new GraphNode("A"));
		nodeList.add(new GraphNode("B"));
		nodeList.add(new GraphNode("C"));
		nodeList.add(new GraphNode("D"));
		
		DisjoinedSet.makeSet(nodeList);
		GraphNode firstNode = nodeList.get(0);
		GraphNode secondNode = nodeList.get(1);
		
		DisjoinedSet output = DisjoinedSet.findSet(secondNode);
		output.printAllNodesOfThisSet();
		
		DisjoinedSet.union(firstNode, secondNode);
		output = DisjoinedSet.findSet(secondNode);
		output.printAllNodesOfThisSet();
	}

}
