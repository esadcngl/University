package exercises.chapter1;
import java.util.Date;
public class Student extends RegistrationOffice {
 private int no ;
 private String name ;
 private int year;
 private String major;

  public Student(int no , String name , int year , String major){
      this.no = no;
      this.name = name;
      this.year = year;
      this.major = major;
  }

  public void study(){
      System.out.println("Student working :)");
  }
  public void register(){
      System.out.println("Student Registered.");
  }
public String toString(){
      return "Student Name: "+ name + "\nStudent no: "+ no+ "\nStudent year: " + year +
              "\nStudent major: "+ major;
}

}
