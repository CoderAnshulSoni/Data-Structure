import java.util.*;

public class Graph {

	ArrayList<GraphNode> nodeList = new ArrayList<>();
	
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	public void dijkastra(GraphNode node) {
		PriorityQueue<GraphNode> queue = new PriorityQueue<>();
		node.distance = 0;
		queue.addAll(nodeList);
		while(!queue.isEmpty()) {
			GraphNode currNode = queue.remove();
			for(GraphNode n : currNode.neighbors) {
				if(queue.contains(n)) {
					if(n.distance > currNode.distance + currNode.weightMap.get(n)) {
						n.distance = currNode.distance + currNode.weightMap.get(n);
						n.parent = currNode;
						queue.remove(n);
						queue.add(n);
					}
				}
			}
		}
		
		for(GraphNode nodeToCheck : nodeList) {
			System.out.print("Node" + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
		
	}
	
	public void pathPrint(GraphNode node) {
		if(node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + " ");
	}
	
	public void addWeightedEdge(int i, int j, int d) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.neighbors.add(second);
		first.weightMap.put(second, d);
	}
	
	public void bellmanFord(GraphNode sourceNode) {
		sourceNode.distance = 0;
		for(int i = 0;i < nodeList.size();i++) {
			for(GraphNode currNode : nodeList) {
				for(GraphNode neighbor : currNode.neighbors) {
					if(neighbor.distance > currNode.distance + currNode.weightMap.get(neighbor)) {
						neighbor.distance = currNode.distance + currNode.weightMap.get(neighbor);
						neighbor.parent = currNode;
					}
				}
			}
		}
		
		System.out.println("Checking for negative Cycles : ");
		for(GraphNode currNode : nodeList) {
			for(GraphNode neighbor : currNode.neighbors) {
				if(neighbor.distance > currNode.distance + currNode.weightMap.get(neighbor)) {
					System.out.println("Negative Cycle found : \n");
					System.out.println("Vertex name : " + neighbor.name);
					System.out.println("Old cost : " + neighbor.distance);
					int newDistance = currNode.distance + currNode.weightMap.get(neighbor);
					System.out.println("New cost : " + newDistance);
					return;
				}
			}
		}
		
		System.out.println("Negative Cycles not found : ");
		for(GraphNode nodeToCheck : nodeList) {
			System.out.print("Node" + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
		
	}
	
	public void floydWarshall() {
		int size = nodeList.size();
		int[][] V = new int[size][size];
		for(int i = 0;i < size;i++) {
			GraphNode first = nodeList.get(i);
			for(int j = 0;j < size;j++) {
				GraphNode second = nodeList.get(j);
				if(i == j) {
					V[i][j] = 0;
				}
				else if(first.weightMap.containsKey(second)) {
					V[i][j] = first.weightMap.get(second);
				}
				else {
					V[i][j] = Integer.MAX_VALUE/10;
				}
			}
		}
		
		for(int k = 0;k < nodeList.size();k++) {
			for(int i = 0;i < nodeList.size();i++) {
				for(int j = 0;j < nodeList.size();j++) {
					if(V[i][j] > V[i][k] + V[k][j]) {
						V[i][j] = V[i][k] + V[k][j];
					}
				}
			}
		}
		
		for(int i = 0;i < nodeList.size();i++) {
			System.out.println("Printing distance list for node " + nodeList.get(i) + " : ");
			for(int j = 0;j < nodeList.size();j++) {
				System.out.print(V[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
