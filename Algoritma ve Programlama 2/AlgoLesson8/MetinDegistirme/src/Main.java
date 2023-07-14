import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Komut satırı parametre kullanımı kontrol etme
        if (args.length != 4) {
            System.out.println("Kullanım: java MetinDegistirme kaynakDosya hedefDosya eskiMetin yeniMetin");
            System.exit(1);
        }
        // Kaynak Dosya mevcut mu ?
        File kaynakDosya = new File(args[0]);
        if (!kaynakDosya.exists()) {
            System.out.println("Kaynak Dosya " + args[0] + " mevcut Değil.");
            System.exit(2);
        }
        // Hedef dosya mevcut mu ?
        File hedefDosya = new File(args[1]);
        if (hedefDosya.exists()) {
            System.out.println("Hedef dosya " + args[1] + " zaten mevcut. ");
            System.exit(3);
        }
        try (
                Scanner okuma = new Scanner(kaynakDosya);
                PrintWriter yazma = new PrintWriter(hedefDosya);
        ) {
            while (okuma.hasNext()) {
                String s1 = okuma.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                yazma.println(s2);
            }


        }
    }
}