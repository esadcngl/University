import java.util.Scanner;
public class diziElemanlarıToplamıVeOrtalama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int dizi[]= new int[20];
        System.out.println("20 elemanlı bir dizi için değerler girin.");
        for(int i =0; i<dizi.length;i++){
            dizi[i]=girdi.nextInt();
        }
        int toplam = 0;
        for(int i =0; i<dizi.length;i++){
            toplam = toplam + dizi[i];
        }
        double ortalama = (double)toplam/20;
        System.out.print("Yazdığınız dizinin ortalaması: "+ ortalama+ "\n");
        System.out.print("Yazdığınız dizideki elemanların toplamı: "+ toplam);

    }
}
