import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı giriniz");
        double sayı1 = input.nextDouble();
        System.out.println("İkinci Sayıyı giriniz");
        double sayı2 = input.nextDouble();
        double Ortalama = (sayı1+sayı2)/2;
        System.out.println("Girdiğiniz iki sayının ortalaması: "+Ortalama);

    }
}