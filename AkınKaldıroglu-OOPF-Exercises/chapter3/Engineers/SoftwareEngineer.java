package exercises.chapter3.Engineers;

public class SoftwareEngineer extends Engineer implements JavaEnthusiast,TeamFan {
    private final String branch = "Software Engineering";
    SoftwareEngineer(String name , boolean isHaveDiploma){
        super(name,isHaveDiploma);
    }
    public String getInfo(){
        return super.getInfo() + "\nBranch: "+ branch;
    }

    @Override
    public void codeWithJava() {
        System.out.println("Writing code with Java...");
    }

    @Override
    public void praiseJava() {
        System.out.println("Java is the best programming language in the world...");
    }

    @Override
    public void readAboutJava(String bookName) {
        System.out.println(bookName + " reading...");
    }

    @Override
    public void keepTeam(String takım) {
        System.out.println("to the death with "+takım);
    }
}
