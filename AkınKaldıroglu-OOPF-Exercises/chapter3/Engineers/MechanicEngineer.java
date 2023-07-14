package exercises.chapter3.Engineers;

public class MechanicEngineer extends Engineer implements Parent{
    private final String branch = "Mechanical Engineer";
    MechanicEngineer(String name,boolean isHaveDiploma){
        super(name,isHaveDiploma);
    }
    public String getInfo(){
        return super.getInfo() + "\nBranch: "+branch;
    }

    @Override
    public void loveChilds() {
        System.out.println("Told to childs \"I love you\"");
    }

    @Override
    public void giveMoney() {
        System.out.println("Given to child money.");
    }
}
