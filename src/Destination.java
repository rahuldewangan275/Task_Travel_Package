import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    private List<Activity> activities;

    public Destination(String name){
        this.name=name;
        activities = new ArrayList<>();
    }
    public void addActivity(Activity activity){
        activities.add(activity);
    }

}
