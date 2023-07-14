import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İşlem seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Çıkış");
        while(true) {
            System.out.print("İşleminiz: ");
            int islem=scanner.nextInt();
            if(islem==1) {
                System.out.println("Birinci sayi:");
                double a=scanner.nextDouble();
                System.out.println("İkinci sayi:");
                double b=scanner.nextDouble();
                System.out.println(a+b);
            }
            else if(islem==2) {
                System.out.println("Birinci sayi:");
                double a=scanner.nextDouble();
                System.out.println("İkinci sayi:");
                double b=scanner.nextDouble();
                System.out.println(a-b);
            }
            else if(islem==3) {
                System.out.println("Birinci sayi:");
                double a=scanner.nextDouble();
                System.out.println("İkinci sayi:");
                double b=scanner.nextDouble();
                System.out.println(a*b);
            }
            else if(islem==4) {
                System.out.println("Birinci sayi:");
                double a=scanner.nextDouble();
                System.out.println("İkinci sayi:");
                double b=scanner.nextDouble();
                System.out.println(a/b);
            }else if(islem==5) {
                System.out.println("Hesap Makinesinden çıkılıyor...");
                break;
            }else {
                System.out.println("Hatalı işlem girdiniz.");
            }
        }
    }
}