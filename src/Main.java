public class Main {
    public static void main(String[] args) {
        // Skill Test:

        Skill javaSkill = new Skill("Java", 60);

        javaSkill.printInfo();

        javaSkill.updateProgress(75);

        javaSkill.printInfo();

        // CareerTask test:

        CareerTask task1 = new CareerTask("Create Career Task Class");
        task1.printInfo();

        task1.start();

        task1.printInfo();

        System.out.println("Is Task Done? " + task1.isDone());

        task1.complete();

        task1.printInfo();

        System.out.println("Is Task Done? " + task1.isDone());

        //Career project test:

        CareerProject careerOSProject = new CareerProject("CareerOS Backend");

        CareerTask task2 = new CareerTask("Create Skill class");

        CareerTask task3 = new CareerTask("Create CareerTask class");

        CareerTask task4 = new CareerTask("Create CareerProject class");

        task2.complete();
        task3.complete();

        careerOSProject.addTask(task2);
        careerOSProject.addTask(task3);
        careerOSProject.addTask(task4);

        careerOSProject.printSummary();
    }
}
