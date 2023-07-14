package exercises.chapter1;

import java.sql.SQLOutput;
import java.util.Date;

public class UndergraduateStudent extends Student {
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
