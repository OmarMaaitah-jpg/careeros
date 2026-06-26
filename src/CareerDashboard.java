public class CareerDashboard {
    private UserProfile profile;

    public CareerDashboard(UserProfile profile) {
        this.profile = profile;
    }
    public void printDashboard() {
        System.out.println("==== CareerOS Dashboard ====");
        profile.printSummary();
    }
}
