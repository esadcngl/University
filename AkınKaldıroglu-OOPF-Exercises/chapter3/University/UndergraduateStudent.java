package exercises.chapter3.University;

public class UndergraduateStudent extends AbstractStudent {
String minor;
    public UndergraduateStudent(int no, String name, int year,String minor) {
        super(no,name,year,"");
        this.minor = minor;
    }

    public void study(){
        System.out.println("Undergraduate Student working :)");
    }
    public void register(){
        System.out.println("Undergraduate Student registered.");
    }
    public String toString(){
        return super.toString() + "\nStudent minor: "+ minor;

    }

}
