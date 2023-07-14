import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MetinYazma {
    public static void main(String[] args) throws IOException {
        File dosya = new File("C:\\EsoWorkspace\\AlgoLesson8\\PrintWriter\\src\\puan_listesi.txt");
        if(dosya.exists()) {
            System.out.println("Dosya Mevcut.");
            System.exit(1);
        }
           // Dosya olusturma
            PrintWriter cikis = new PrintWriter(dosya);
              // Dosyaya yazma
            cikis.print("Esad Çıngılı ");
            cikis.println(90);
            cikis.print("Mustafa Kızıloluk ");
            cikis.println(80);
            cikis.close();
    }
}