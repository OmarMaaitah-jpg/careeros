public class Skill {

    private String name;

    private int progress;

    public Skill (String name,int progress)
    {
        if(progress<0 || progress>100){
        throw new IllegalArgumentException("Progress must be between 0 and 100");
    }
    this.name = name;
    this.progress = progress;
    }
    public String getName(){
        return name;
    }
    public int getProgress(){
        return progress;
    }
    public void updateProgress(int newProgress){

        if(newProgress<0 || newProgress>100){
                throw new IllegalArgumentException("Progress must be between 0 and 100");
            }
            this.progress = newProgress;
    }
        public void PrintInfo()
        {
            System.out.println("Skill: " + getName()+"|| progress: "+getProgress());
        }
}