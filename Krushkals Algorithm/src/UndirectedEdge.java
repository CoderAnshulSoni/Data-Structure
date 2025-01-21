
public class UndirectedEdge {

	public GraphNode first;
	public GraphNode second;
	public int weight;
	
	public UndirectedEdge(GraphNode first, GraphNode second, int weight) {
		this.first = first;
		this.second = second;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Edge (" + first + "," + second + "), weight = " + weight;
	}
	
}
