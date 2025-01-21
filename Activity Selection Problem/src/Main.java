import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Activity> list = new ArrayList<>();
		list.add( new Activity("A1", 0, 6));
		list.add( new Activity("A2", 3, 4));
		list.add( new Activity("A3", 1, 2));
		list.add( new Activity("A4", 5, 8));
		list.add( new Activity("A5", 5, 7));
		list.add( new Activity("A6", 8, 9));
		
		ActivitySelection.activitySelection(list);
		
	}

}
