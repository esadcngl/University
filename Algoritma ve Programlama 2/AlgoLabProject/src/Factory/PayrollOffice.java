package Factory;

public class PayrollOffice extends calculateSalary {
// maaş ödeme
public void paySalary(Employee e ){
    System.out.println("Maaş Ödendi: " + e.getSalary());
}
//maaş yükseltme
public void raiseSalary(Employee e,int addition){
    System.out.println("Maaşa " + addition+ " TL zam yapıldı" );
    System.out.println("Yeni Maaş : "+(e.getSalary()+addition));
    e.setSalary(e.getSalary()+addition);
}
//maaş düşürme
public void decreaseSalary(Employee e , int decrease){
    System.out.println("Maaşa " + decrease + " TL azaltma yapıldı");
    System.out.println("Yeni Maaş : "+(e.getSalary()-decrease));
    e.setSalary((e.getSalary()-decrease));
}

     // calculateSalary soyut sınıfından override edilen SalaryInfo metodu
    @Override
    public void SalaryInfo(Employee e) {
        System.out.println(e.getSalary()+" TL "+ "Maaş ");
    }

}
