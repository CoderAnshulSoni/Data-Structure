package AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

	ArrayList<GraphNode> nodeList = new ArrayList<>();
	
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	public void addUndirectedEdge(int i, int j) {
		GraphNode nodeFirst = nodeList.get(i);
		GraphNode nodeSecond = nodeList.get(j);
		nodeFirst.neighbour.add(nodeSecond);
		nodeSecond.neighbour.add(nodeFirst);
	}

	public String display() {
		StringBuilder s = new StringBuilder();
		for(int i = 0;i < nodeList.size();i++) {
			s.append(nodeList.get(i).name + ": ");
			for(int j = 0;j < nodeList.get(i).neighbour.size();j++) {
				if(j == nodeList.get(i).neighbour.size() - 1) {
					s.append(nodeList.get(i).neighbour.get(j).name);
				}
				else {
					s.append(nodeList.get(i).neighbour.get(j).name + " -> ");
				}
			}
			s.append("\n");
		}
		return s.toString();
	}
	
	private void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode currNode = queue.remove(0);
			currNode.isVisited = true;
			System.out.print(currNode.name + " ");
			for(GraphNode n : currNode.neighbour) {
				if(!n.isVisited) {
					queue.add(n);
					n.isVisited = true;
				}
			}
		}
	}
	
	public void bfs() {
		for(GraphNode node : nodeList) {
			if(!node.isVisited) {
				bfsVisit(node);
			}
		}
		System.out.println();
	}
	
	private void dfsVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
			GraphNode currNode = stack.pop();
			currNode.isVisited = true;
			System.out.print(currNode.name + " ");
			for(GraphNode n : currNode.neighbour) {
				if(!n.isVisited) {
					stack.push(n);
					n.isVisited = true;
				}
			}
		}
	}
	
	public void dfs() {
		for(GraphNode node : nodeList) {
			if(!node.isVisited) {
				dfsVisit(node);
			}
		}
		System.out.println();	
	}
	
	public void addDirectedEdge(int i, int j) {
	   GraphNode first = nodeList.get(i);
	   GraphNode second = nodeList.get(j);
	   first.neighbour.add(second);
	 }

	public void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
	   for (GraphNode neighbor : node.neighbour) {
	     if (!neighbor.isVisited) {
	       topologicalVisit(neighbor, stack);
	     }
	   }
	   node.isVisited = true;
	   stack.push(node);
	 }

	public void topologicalSort() {
	   Stack<GraphNode> stack = new Stack<>();
	   for (GraphNode node : nodeList) {
	     if (!node.isVisited) {
	       topologicalVisit(node, stack);
	     }
	   }
	   while(!stack.isEmpty()) {
	     System.out.print(stack.pop().name + " ");
	   }
	   
	   System.out.println();
	 }
	
	public void pathPrint(GraphNode node) {
		if(node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + " ");
	}
	
	public void BFSshortestPath(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);
		while(!queue.isEmpty()){
			GraphNode currNode = queue.remove(0);
			currNode.isVisited = true;
			System.out.print("Printing Path for node" + currNode.name + ": ");
			pathPrint(currNode);
			System.out.println();
			for(GraphNode n : currNode.neighbour) {
				if(!n.isVisited) {
					queue.add(n);
					n.isVisited = true;
					n.parent = currNode;
				}
			}
		}
	}
	
}
