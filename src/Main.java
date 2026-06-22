public class Main {
    public static void main(String[] args) {
        // Skill Test:

        Skill javaSkill = new Skill("Java", 60);

        javaSkill.printInfo();

        javaSkill.updateProgress(75);

        javaSkill.printInfo();

        // CareerTask:

        CareerTask task1 = new CareerTask("Create Career Task Class");
        task1.printInfo();

        task1.start();

        task1.printInfo();

        System.out.println("Is Task Done? " + task1.isDone());

        task1.complete();

        task1.printInfo();

        System.out.println("Is Task Done? " + task1.isDone());
    }
}
