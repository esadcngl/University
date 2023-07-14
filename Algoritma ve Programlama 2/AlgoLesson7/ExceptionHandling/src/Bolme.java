import java.util.Scanner;
public class Bolme {
    public static void main(String[] args) {
        boolean b = true;
        while(b) {
            Scanner sayı = new Scanner(System.in);
            System.out.println("Bölmek istediğiniz sayıyı giriniz: ");
            int sayi1 = sayı.nextInt();
            System.out.println("Kaça bölmek istiyorsunuz giriniz: ");
            int sayi2 = sayı.nextInt();
            try {
                System.out.println(sayi1 + " ÷ " + sayi2 + " = " + (sayi1 / sayi2));
            } catch (ArithmeticException a) {
                System.out.println("Sayılar 0'a bölünemez geçerli başka sayı girin.");
            }
        }


    }
}