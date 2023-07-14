package Factory;

import java.util.Random;

public class Employee extends Person{

    private String employeeID;

    private int salary;
    Employee(){
    }
    Employee(String name , String surname ,String citizenID , int birthdateDay ,
             int birthdateMonth , int birtdhdateYear, String email , String phoneNumber,
             String address , String department,String employeeID ,int salary ){
        super(name,surname,citizenID,birthdateDay,birthdateMonth,birtdhdateYear,email,phoneNumber,address,department);
        this.employeeID = employeeID ;
        this.salary = salary;

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //super üst sınıftaki metodu çağırıyor.
    //aynı this mantığı gibi.
    public String toString(){
        return super.toString()+ "\nÇalışan ID: "+
                getEmployeeID()+ "\nMaaşı: " + salary;
    }







}
