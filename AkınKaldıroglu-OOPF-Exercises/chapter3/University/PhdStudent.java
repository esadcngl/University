package exercises.chapter3.University;

public class PhdStudent extends GraduateStudent {
    boolean qualifyingExamTaken;
    public PhdStudent(int no , String name , int year, String major, String advisor, String thesis,boolean qualifyingExamTaken){
       super(no, name, year,major, advisor, thesis);
       this.qualifyingExamTaken = qualifyingExamTaken;
    }
    public void study(){
        System.out.println("Phd Student is working :)");
    }
    public void register(){
        System.out.println("Phd Student is registered.");
    }
    public void writeThesis(){
        System.out.println("Phd Student Thesis is writing...");
    }
    public void meetWithAdvisor(){
        System.out.println("Phd Student Meeting with advisor...");
    }
    public void writePaper(){
        System.out.println("Phd Student writing paper.");
    }

}
