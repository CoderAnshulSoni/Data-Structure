import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<GraphNode> nodeList = new ArrayList<>();
//		nodeList.add(new GraphNode("A", 0));
//		nodeList.add(new GraphNode("B", 1));
//		nodeList.add(new GraphNode("C", 2));
//		nodeList.add(new GraphNode("D", 3));
//		nodeList.add(new GraphNode("E", 4));
//		nodeList.add(new GraphNode("F", 5));
//		nodeList.add(new GraphNode("G", 6));
//		
//		Graph graph = new Graph(nodeList);
//		graph.addWeightedEdge(0, 1, 2);
//		graph.addWeightedEdge(0, 2, 5);
//		graph.addWeightedEdge(1, 2, 6);
//		graph.addWeightedEdge(1, 3, 1);
//		graph.addWeightedEdge(1, 4, 3);
//		graph.addWeightedEdge(3, 4, 4);
//		graph.addWeightedEdge(2, 5, 8);
//		graph.addWeightedEdge(4, 6, 9);
//		graph.addWeightedEdge(5, 6, 7);
//
//		System.out.println("Printing BellmanFord from Source A");
//		graph.bellmanFord(nodeList.get(0));
		
		ArrayList<GraphNode> nodeList = new ArrayList<>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		
		Graph graph = new Graph(nodeList);
		graph.addWeightedEdge(0, 3, 1);
		graph.addWeightedEdge(0, 1, 8);
		graph.addWeightedEdge(1, 2, 1);
		graph.addWeightedEdge(2, 0, 4);
		graph.addWeightedEdge(3, 1, 2);
		graph.addWeightedEdge(3, 2, 9);

		System.out.println("Printing Floyd Warshall ");
		graph.floydWarshall();
		
	}

}
