package Factory;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // management referansı oluşturuldu.
        Management management = new Management();
        // Person nesnesini gösteren person1 referansı oluşturdum
        Person person1 = new Person("Esad ","Çıngılı","26388782934",
                8,12,2002,
                "esaddeneme@gmail.com","5458868434","Kahramanmaraş",
                "MUHASEBE");
        // person bilgisi getiriyorum.
        System.out.println(person1.toString());
        // karışıklık önlemek için
        System.out.println("---------------------------");
        // Polimorfizimden yararlanarak Employee nesnesi oluşturuyorum.
        Person person2 = new Employee("Şeyma","Dağdelen","220423903",
               18,4,1999,"seymawq@gmail.com"
               ,"05054322132","Ankara,Emek",
               "İK","220432",15000);
        // Employee bilgisi getirme.
       System.out.println(person2.toString());
       // karışıklık önlemek için
        System.out.println("---------------------------------");
       // Managament sınıfındaki hire metodu Person tipindeki referansı kullanarak
        // Employee nesnesi oluşturup gösteriyor.
        management.hire(person1);
        //karışıklık önlemek için
        System.out.println("---------------------------------");
        // Managament sınıfındaki fire metodu kullanarak işçi kovacağız.
        // Ama bundan önce yeni bir işçi oluşturmak istiyorum
        Employee employee1 = new Employee("Taha","Toprak","21044382922",
                17,6,1999,"tahatoprak@gmail.com"
        ,"05406458323","Nevşehir","AR-GE",
                "220421",24000);
        management.fire(employee1);
        System.out.println("-------------------------");


        //PayrollOffice nesnesi için payrolloffice referansı oluşturuldu oluşturuluyor.
         PayrollOffice payrollOffice = new PayrollOffice();
         // SalaryInfo içerisine sadece Employee tipindeki referansları aldığı için
        // Burada üst sınıf tipinden olan person u employee e downcasting yapıyoruz

         payrollOffice.SalaryInfo((Employee) person2);
         // Şimdi zam yapmaya çalışıyoruz.
         payrollOffice.raiseSalary((Employee)person2,5000);
         // Şimdi maaşı azaltıyoruz.
         payrollOffice.decreaseSalary((Employee)person2,10000 );
         // Şimdi maaşı ödüyoruz.
        payrollOffice.paySalary((Employee) person2);

        // karışıklık olmaması için
        System.out.println("---------------------------------------");
        // Şimdi WriteInfo sınıfını kullanacağız
        // Personel bilgisini txt yazdırmak için kullanıyoruz
        WriteInfo.printPerson(person2);
















    }
}