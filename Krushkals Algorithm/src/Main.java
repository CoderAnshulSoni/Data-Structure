import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<GraphNode> nodeList = new ArrayList<>();
//		nodeList.add(new GraphNode("A"));
//		nodeList.add(new GraphNode("B"));
//		nodeList.add(new GraphNode("C"));
//		nodeList.add(new GraphNode("D"));
//		
//		DisjoinedSet.makeSet(nodeList);
//		GraphNode firstNode = nodeList.get(0);
//		GraphNode secondNode = nodeList.get(1);
//		
//		DisjoinedSet output = DisjoinedSet.findSet(secondNode);
//		output.printAllNodesOfThisSet();
//		
//		DisjoinedSet.union(firstNode, secondNode);
//		output = DisjoinedSet.findSet(secondNode);
//		output.printAllNodesOfThisSet();
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		
		String str = "Good morning All";
		str = str.toLowerCase();
		
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int value = map.get(ch);
				value++;
				map.put(ch, value);
			}
		}
		
		boolean flag = false;
		
		String temp = "";
        
		for (HashMap.Entry<Character,Integer> mapElement : map.entrySet()) {
            Character key = mapElement.getKey();
 
            int value = mapElement.getValue();
            if(value != 0) {
            	flag = true;
            	temp = temp + key + " : " + value + ",";
            }
            
        }
		if(flag == false) {
			System.out.println("Word not found");
		}
		String s = "";
		String arr[] = temp.split(",");
		for(int i=arr.length-1;i>=0;i--) {
			s = s + arr[i] + ", ";
		}
		System.out.print(s);
		
	}

}