package exercises.chapter1;

import java.util.Date;

public class MasterStudent extends GraduateStudent{
    public MasterStudent(int no , String name , int year  , String major,String advisor,String thesis){
        super(no,name,year,major,advisor,thesis);
    }
    public void study(){
        System.out.println("Master Student is working :)");
    }
    public void register(){
        System.out.println("Master Student is registered.");
    }
    public void writeThesis(){
        System.out.println("Master Student Thesis is writing...");
    }
    public void meetWithAdvisor(){
        System.out.println("Master Student Meeting with advisor...");
    }

}
