import java.util.List;
import java.util.ArrayList;

public class UserProfile {
    private String name;
    private String careerGoal;
    private List<Skill> skills;
    private List<CareerProject> projects;

    public UserProfile(String name, String careerGoal) {
        this.name = name;
        this.careerGoal = careerGoal;
        this.skills = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCareerGoal() {
        return careerGoal;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public void addProject(CareerProject project) {
        this.projects.add(project);
    }

    public int getSkillsCount() {
        return skills.size();
    }

    public int getProjectsCount() {
        return projects.size();
    }
    
    public void printSummary() {
        System.out.println("User: " + getName());
        System.out.println("Goal: " + getCareerGoal());
        System.out.println("Skills: " + getSkillsCount());
        System.out.println("Projects: " + getProjectsCount());
    }
}