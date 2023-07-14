import java.util.Scanner;

public class kelimedekiSessizVeSesliHarf2 {
    public static void main(String[] args) {
        String sessizKelime = "";
        String sesliKelime = "";
        String sesliler = "aeuüoöiıAEUÜOÖİI";
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String metin = girdi.nextLine();
        String sessizler = "qwrtypğşlkjhgfdszxcvbnmçQWRTYPĞŞLKJHGFDSZXCVBNMÇ";

        for (int i = 0; i < sesliler.length(); i++) {
            for (int j = 0; j < metin.length(); j++) {
                if (metin.charAt(j) == sesliler.charAt(i)) {
                    sesliKelime = sesliKelime + metin.charAt(j);
                }
            }
        }
        for (int i = 0; i < sessizler.length(); i++) {
            for (int j = 0; j < metin.length(); j++){
                if(sessizler.charAt(i)==metin.charAt(j)){
                    sessizKelime = sessizKelime + metin.charAt(j);
                }
            }
        }
        System.out.println("Kelimedeki sessiz harfler: "+ sessizKelime);
        System.out.println("Kelimedeki sesli harfler: "+ sesliKelime);

    }
}
