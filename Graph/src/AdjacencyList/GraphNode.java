package AdjacencyList;

import java.util.ArrayList;

public class GraphNode {
	
	public String name;
	public int index;
	public boolean isVisited = false;
	public GraphNode parent;
	
	public ArrayList<GraphNode> neighbour = new ArrayList<>();

	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

}
