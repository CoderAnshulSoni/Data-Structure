package AdjacencyMatrix;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<GraphNode> nodeList = new ArrayList<>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		nodeList.add(new GraphNode("F", 5));
		nodeList.add(new GraphNode("G", 6));
		nodeList.add(new GraphNode("H", 7));
		
		Graph graph = new Graph(nodeList);
		graph.undirectedEdge(0, 1);
		graph.undirectedEdge(0, 2);
		graph.undirectedEdge(1, 3);
		graph.undirectedEdge(1, 6);
		graph.undirectedEdge(2, 3);
		graph.undirectedEdge(2, 4);
		graph.undirectedEdge(3, 5);
		graph.undirectedEdge(4, 5);
		graph.undirectedEdge(5, 6);
		
		System.out.println(graph.toString());
		
		graph.BFSshortPathProblem(nodeList.get(0));
		
		
	}

}
