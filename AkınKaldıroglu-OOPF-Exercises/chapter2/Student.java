package exercises.chapter2;

public abstract class Student {
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

  public abstract void study();
  
  public abstract void register();

public String toString(){
      return "Student Name: "+ name + "\nStudent no: "+ no+ "\nStudent year: " + year +
              "\nStudent major: "+ major;
}

}
