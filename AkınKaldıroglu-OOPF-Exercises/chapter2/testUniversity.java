package exercises.chapter2;

public class testUniversity {
    public static void main(String[] args) {
        RegistrationOffice registrationOffice = new RegistrationOffice();
        System.out.println(registrationOffice.getAStudent().toString());
        Student student1 = registrationOffice.getAStudent();
        System.out.println("**********************************");
        registrationOffice.registerStudent(student1);
    }
}
