package exercises.chapter3.University;

public abstract class AbstractStudent implements Student {
    private int no ;
    private String name ;
    private int year;
    private String major;

    public AbstractStudent(int no , String name , int year , String major){
        this.no = no;
        this.name = name;
        this.year = year;
        this.major = major;
    }
    public String toString(){
        return "Student Name: "+ name + "\nStudent no: "+ no+ "\nStudent year: " + year +
                "\nStudent major: "+ major;
    }
}
