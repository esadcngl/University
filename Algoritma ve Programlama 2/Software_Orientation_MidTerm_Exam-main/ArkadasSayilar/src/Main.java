import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.

        //  Örnek: 220 ve 284

        // 220 : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 284 : 1 + 2 + 4 + 71 + 142 = 220

        Scanner sayı = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz = ");
        int sayı1 = sayı.nextInt();
        int top1 = 0;
        for (int i = 1; i < sayı1; i++) {
            if (sayı1 % i == 0) {
                top1 = top1 + i;
            }
        }
        System.out.print("İkinci sayiyi giriniz = ");
        int sayı2 = sayı.nextInt();
        int top2 = 0;
        for (int x =1; x<sayı2; x++){
            if(sayı2%x==0){
            top2= top2 + x;
            }
        }
        if (sayı1==top2 && sayı2 ==top1){
            System.out.println("Girdiğiniz sayılar arkadaştır.");
        } else{
            System.out.println("Girdiğiniz sayılar arkadaş değildir.");
        }










    }
}