import java.util.ArrayList;
import java.util.List;

public class CareerProject {

    private String name;
    private List<CareerTask> tasks;

    public CareerProject(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addTask(CareerTask task) {
        this.tasks.add(task);
    }
    public int getTotalTasksCount() {
        return tasks.size();
    }
    public int getCompletedTasksCount() {
       int cnt = 0;
       for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).isDone()) {
                cnt++;
       }
       }
       return cnt;
    }
    public int calculateProgress() {
        if (getTotalTasksCount() == 0) {
       return 0;
        }
       return getCompletedTasksCount() * 100 / getTotalTasksCount();
    }
    public void printSummary() {
        System.out.println("Project: " + getName());
        System.out.println("Tasks: " + getCompletedTasksCount() + "/" + getTotalTasksCount() + " completed");
        System.out.println("Progress: " + calculateProgress() + "%");
    }
}