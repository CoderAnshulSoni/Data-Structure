import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void knapsack(ArrayList<KnapsackItem> items, int capacity) {
		Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
			@Override
			public int compare(KnapsackItem k1, KnapsackItem k2) {
				if(k1.getRatio() < k2.getRatio()) {
					return 1;
				}
				return -1;
			}
		};
		Collections.sort(items, comparator);
		int usedCapacity = 0;
		double totalValue = 0;
		
		for(KnapsackItem item : items) {
			if(usedCapacity + item.getWeight() <= capacity) {
				usedCapacity += item.getWeight();
				System.out.println("Taken : " + item);
				totalValue += item.getValue();
			} 
			else {
				int usedWeight = capacity - usedCapacity;
				double value = item.getRatio()*usedWeight;
				System.out.println("Taken Item index : " + item.getIndex() + ", obtained value : " + value + ", used weight : " + usedWeight + ", ratio : " + item.getRatio());
				usedCapacity += usedWeight;
				totalValue += value; 
			}
			if(usedCapacity == capacity) {
				break;
			}
		}
		System.out.println("\nTotal Value obtained : " + totalValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<KnapsackItem> items = new ArrayList<>();
		int[] value = {100,120,60};
		int[] weight = {20,30,10};
		int capacity = 50;
		
		for(int i = 0;i < value.length;i++) {
			items.add(new KnapsackItem(i+1, value[i], weight[i]));
		}
		
		knapsack(items, capacity);
		
	}

}
