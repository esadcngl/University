import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Faktöriyel almak istediğiniz sayıyı giriniz:");
        int sayı = girdi.nextInt();
        int faktoriyel = 1;
         for (int i =1;i<=sayı;i++){
             faktoriyel = faktoriyel*(i);
         }
        System.out.println("Faktöriyel !"+sayı+" = "+faktoriyel);

    }
}