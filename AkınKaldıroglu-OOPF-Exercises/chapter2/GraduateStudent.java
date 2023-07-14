package exercises.chapter2;

public class GraduateStudent extends Student {
    String advisor;
    String thesis;
    GraduateStudent(int no , String name , int year , String major,String advisor,String thesis ){
        super(no,name,year,major);
        this.advisor = advisor;
        this.thesis = thesis;
    }
    public void study(){
        System.out.println("Graduate Student working :)");
    }
    public void register(){
        System.out.println("Graduate Student registered.");
    }
    public void writeThesis(){
        System.out.println("Graduate Student Thesis is writing...");
    }
    public void meetWithAdvisor(){
        System.out.println("Graduate Student Meeting with advisor...");
    }
    @Override
    public String toString() {
        return super.toString() + "\nStudent advisor: "+ advisor+
                "\nStudent thesis: "+thesis;
    }
}
