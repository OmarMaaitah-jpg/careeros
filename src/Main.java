public class Main {
     public static void main(String[] args) {
        Skill javaSkill = new Skill("Java",60);
        javaSkill.PrintInfo();
        javaSkill.updateProgress(75);
        javaSkill.PrintInfo();
    }
}
