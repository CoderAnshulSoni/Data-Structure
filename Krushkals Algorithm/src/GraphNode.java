
import java.util.ArrayList;
import java.util.HashMap;

public class GraphNode implements Comparable<GraphNode> {
	
	public String name;
	public ArrayList<GraphNode> neighbors = new ArrayList<>();
	public HashMap<GraphNode, Integer> weightMap = new HashMap<>();
	public boolean isVisited = false;
	public GraphNode parent;
	public int distance;
	
	public DisjoinedSet set;
	
	public GraphNode(String name) {
		this.name = name;
		distance = Integer.MAX_VALUE;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(GraphNode o) {
		return this.distance - o.distance;
	}
}
	
