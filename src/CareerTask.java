public class CareerTask {

    private String title;
    private TaskStatus status;

    public CareerTask(String title) {
        this.title = title;
        this.status = TaskStatus.TODO;
    }
    public String getTitle() {
        return title;
    }
    public TaskStatus getStatus() {
        return status;
    }
    public void start() {
        this.status = TaskStatus.IN_PROGRESS;
    }
    public void complete() {
        this.status = TaskStatus.DONE; 
    }
    public boolean isDone() {
        return status == TaskStatus.DONE;
    }
    public void printInfo() {
        System.out.println("- " + title + " [" + status + "]");
    }
}