package exercises.chapter3.Engineers;

public abstract class Person {
   private String name;
    Person(String name){
        this.name = name;
    }
    public String getInfo(){
        return "İsim: "+name;
    }


}
