import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int sayı1 = girdi.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int sayı2 = girdi.nextInt();

        if(sayı1>sayı2){
            System.out.println(sayı1+" Büyüktür "+ sayı2);
        } else if(sayı2>sayı1){
            System.out.println(sayı2+" Büyüktür "+ sayı1);
        }else {
            System.out.println("Sayılar birbirine eşittir.");
        }







    }
}