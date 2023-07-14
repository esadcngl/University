import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VeriOkuma {
    public static void main(String[] args) throws Exception {
     //File örneği oluşturma
        java.io.File dosya = new File("C:\\EsoWorkspace\\AlgoLesson8\\PrintWriter\\src\\puan_listesi.txt");
     // Dosya için scanner oluşturma
        Scanner giris = new Scanner(dosya);

     // Dosyadan veri okumak
        while(giris.hasNext()){
            String isim = giris.next();
            String soyİsim = giris.next();
            String dersAdı = giris.next();
            int notDegeri = giris.nextInt();
            System.out.println(isim+" "+ soyİsim+" "+ dersAdı+ " "+ notDegeri);
        }
        // Dosyayı kapatma
        giris.close();

    }
}