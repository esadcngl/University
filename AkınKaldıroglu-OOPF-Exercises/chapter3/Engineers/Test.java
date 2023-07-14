package exercises.chapter3.Engineers;

public class Test {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer1 = new SoftwareEngineer("Esad Çıngılı", true);
        System.out.println(softwareEngineer1.getInfo());
        softwareEngineer1.codeWithJava();
        softwareEngineer1.keepTeam("Galatasaray");
        softwareEngineer1.praiseJava();
        softwareEngineer1.readAboutJava("Head a First Java");
        System.out.println("-----------------------------");
        MechanicEngineer mechanicEngineer1 = new MechanicEngineer("Serkan Bölcü",true);
        mechanicEngineer1.loveChilds();
    }
}
