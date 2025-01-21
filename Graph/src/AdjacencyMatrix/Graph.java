package AdjacencyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	
	ArrayList<GraphNode> nodeList = new ArrayList<>();
	int[][] adjacencyMatrix;
	
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}
	
	public void undirectedEdge(int i, int j) {
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}
	
	//To get neighbors of node
	
	public ArrayList<GraphNode> getNeighbors(GraphNode node){
		ArrayList<GraphNode> neighbor = new ArrayList<GraphNode>();
		int nodeIndex = node.getIndex();
		for(int i = 0;i < adjacencyMatrix.length;i++) {
			if(adjacencyMatrix[nodeIndex][i] == 1) {
				neighbor.add(nodeList.get(i));
			}
		}
		
		return neighbor;
	}
	
	private void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.setVisited(true);
			System.out.print(currentNode.getName() + " ");
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			for(GraphNode neighbor : neighbors) {
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}
		}
	}
	
	public void bfs() {
		for(GraphNode node : nodeList) {
			if(!node.isVisited()) {
				bfsVisit(node);
			}
		}
		System.out.print("\n");
	}
	
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    s.append("   ");
		for (int i = 0; i < nodeList.size(); i++) {
		  s.append(nodeList.get(i).getName() + " ");
		}
		s.append("\n");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).getName() + ": ");
			for (int j : adjacencyMatrix[i]) {
				s.append((j) + " ");
			  }			
			s.append("\n");
		}
	    return s.toString();
	}
	
	private void dfsVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.setVisited(true);
			System.out.print(currentNode.getName() + " ");
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			for(GraphNode neighbor : neighbors) {
				if(!neighbor.isVisited()) {
					stack.push(neighbor);
					neighbor.setVisited(true);
				}
			}
		}
	}
	
	public void dfs() {
		for(GraphNode node : nodeList) {
			if(!node.isVisited()) {
				dfsVisit(node);
			}
		}
		System.out.print("\n");
	}
	
	public void addDirectedEdge(int i, int j) {
		adjacencyMatrix[i][j] = 1;
	}

	private void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
		ArrayList<GraphNode> neighbors = getNeighbors(node);
		
		for(GraphNode neighbor : neighbors) {
			if(!neighbor.isVisited()) {
				topologicalVisit(neighbor, stack);
			}
		}
		node.setVisited(true);
		stack.push(node);
	}
	
	public void topologicalSort() {
		Stack<GraphNode> stack = new Stack<>();
		for(GraphNode node : nodeList) {
			if(!node.isVisited()) {
				topologicalVisit(node, stack);
			}
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop().getName() + " ");
		}
		System.out.println();
	}
	
	public void pathPrint(GraphNode node) {
		if(node.getParent() != null) {
			pathPrint(node.getParent());
		}
		System.out.print(node.getName() + " ");
	}
	
	public void BFSshortPathProblem(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode currNode = queue.remove(0);
			currNode.setVisited(true);
			System.out.print("Printing Path for node " + currNode.getName() + ": ");
			pathPrint(currNode);
			System.out.println();
			ArrayList<GraphNode> neighbors = getNeighbors(currNode);
			for(GraphNode n : neighbors) {
				if(!n.isVisited()) {
					queue.add(n);
					n.setVisited(true);
					n.setParent(currNode);
				}
			}
		}
	}
	
}
