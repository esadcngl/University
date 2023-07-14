package Factory;

public class Management extends Person implements Decision {
    private String managementID;

    Management() {
    }

    Management(String managementID) {
        this.managementID = managementID;
    }
    // interfaceleri aşağıda implement ediyoruz.
    @Override
    public void fire(Employee employee) {
        System.out.println(employee.getName() + " " + employee.getSurname() + " adlı çalışan kovuldu.");
       employee = null;
       //Garbage collector tarafından temizlenecek.
    }
    // Aşağıdaki işe alma metodundaki 30.satırda polimorfizimin güzel bir örneğini görmekteyiz.
    @Override
    public void hire(Person person) {
        System.out.println(person.getName() + "" + person.getSurname() + " adlı kişi işe alındı.");
        System.out.println("Employee id oluşturuluyor...");
        java.util.Random  rastgele = new java.util.Random();
        java.util.Scanner girdi = new java.util.Scanner(System.in);
        int rastgeleid = rastgele.nextInt(10000,99999);
        String employeeid = String.valueOf(rastgeleid);
        System.out.println("İşçi maaş belirle: ");
        int maas = girdi.nextInt();
        person = new Employee(person.getName(), person.getSurname(),
               person.getCitizenID(), person.getBirthdateDay(),
               person.getBirthdateMonth(), person.getBirtdhdateYear(),
               person.getEmail(),person.getPhoneNumber(), person.getAddress(),
                person.getAge(),employeeid,maas);
        System.out.println(person.toString());
    }

    public String getManagementID() {
        return managementID;
    }

    public void setManagementID(String managementID) {
        this.managementID = managementID;
    }
}
