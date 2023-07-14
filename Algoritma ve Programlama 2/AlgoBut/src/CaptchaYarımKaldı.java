import java.util.Scanner;
public class CaptchaYarımKaldı {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Güvenlik anahtarı uzunluğu giriniz: ");
        int g_uzunluk = girdi.nextInt();
        System.out.println("Büyük Harf adedi giriniz: ");
        int b_uzunluk= girdi.nextInt();
        System.out.println("Kücük harf adedi giriniz: ");
        int k_uzunluk = girdi.nextInt();
        System.out.println("Rakam adedi giriniz: ");
        int r_uzunluk = girdi.nextInt();
        String büyükHarfler = "QWERTYUIOPĞÜASDFGHJKLŞİZXCVBNMÖÇ";
        String kücükHarfler = "asdfghjklşiqwertyuıopğüzxcvbnmöç";
        String Captcha = "";
        int CaptchaUzunluk= g_uzunluk+b_uzunluk+k_uzunluk+r_uzunluk;
        //for(int i =0; i<CaptchaUzunluk; i++){
         //   for int a = (int) (Math.random()*CaptchaUzunluk);

        }



    }

