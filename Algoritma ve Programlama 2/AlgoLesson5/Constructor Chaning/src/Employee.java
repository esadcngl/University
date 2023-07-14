public class Employee extends Person{
    public Employee(){
        this("(2)Akıllı constructor çalıştı.");
        System.out.println("(3)Employee default constructorı çalıştı.");
    }

    public Employee(String s){
        System.out.println(s);
    }
}
