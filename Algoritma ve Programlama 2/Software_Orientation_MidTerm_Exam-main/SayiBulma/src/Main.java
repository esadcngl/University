import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // SAYI TAHMİN ETME OYUNU
        Scanner sayı = new Scanner(System.in);
        int cpu =(int)(Math.random()*10);
        System.out.println("1 ile 10 arasında sayı tahmin ediniz!");
        int a =1;
        while(a==1) {
            int user = sayı.nextInt();
            if (user == cpu) {
                System.out.println("Doğru tahmin ettiniz TEBRİKLER!!");
            } else if(user >=10)
                System.out.println("Yanlış sayı yazdınız lütfen 1 ile 10 arasında giriniz!");
            else {
                System.out.println("Yanlış tahmin Tekrar deneyin!");
            }
        }
    }
}