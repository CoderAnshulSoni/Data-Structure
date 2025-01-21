import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ActivitySelection {

	public static void activitySelection(ArrayList<Activity> activityList) {
		Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
			@Override
			public int compare(Activity a1, Activity a2) {
				return a1.getFinishTime() - a2.getFinishTime();
			}
		};
		Collections.sort(activityList, finishTimeComparator);
		Activity previousActivity = activityList.get(0);
		
		System.out.println("\n\nRecommended Schedule: \n" + activityList.get(0));
		
		for(int i = 1;i < activityList.size();i++) {
			Activity activity = activityList.get(i);
			if(activity.getStartTime() >= previousActivity.getFinishTime()) {
				System.out.println(activity);
				previousActivity = activity;
			}
		}
		
		
	}
	
}
