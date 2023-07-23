public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Esad Çıngılı" , 12);
        Owner owner2 = new Owner("Merve Yörükbaşı" , 12);

        System.out.println(owner1.toString());
        System.out.println(owner2.toString());

        System.out.println("Nesneler Aynı id ye mi sahip ?");
           if(owner1.equals(owner2))
               System.out.println("Aynı");
           else
               System.out.println("farklı");

        System.out.println(owner1.getHashcode());
        System.out.println(owner2.getHashcode());
    }
}