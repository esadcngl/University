package exercises.chapter2;

public class VocationalStudent extends Student {
    public VocationalStudent(int no , String name , int year , String major){
        super(no,name,year,major);
    }
    public void study() {
        System.out.println("Vocational Student working :)");
    }
    public void register(){
        System.out.println("Vocational Student registered.");
    }
    public String toString(){
        return super.toString();
    }

}
