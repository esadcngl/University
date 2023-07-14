import java.util.Scanner;

public class dosyaUzantısıVeAdı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir dosya ismi giriniz: ");
        String dosyaAdı = scan.nextLine();
        int noktaİndex = dosyaAdı.lastIndexOf(".");
        String uzantıAdı = dosyaAdı.substring(noktaİndex+1);
        String sadeceDosyaAdı = dosyaAdı.substring(0,noktaİndex);
        System.out.println("Dosya adı: "+sadeceDosyaAdı);
        System.out.println("Dosya uzantısı: "+uzantıAdı);

    }
}
