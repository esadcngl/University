import java.util.Scanner;

public class metindekiSesliSessizHarfSayısı {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Metin yazınız:");
        String metin = girdi.nextLine();
        metin = metin.toLowerCase();
        String sesliharf = "aeuüoöiı";
        int ünlü_sayacı = 0, ünsüz_sayacı = 0;
        for (int i = 0; i < metin.length(); i++) {
                if(metin.charAt(i)==' '){
                 continue;
                }
                else if (metin.charAt(i) =='a'|| metin.charAt(i) =='e'||metin.charAt(i) =='ı'||metin.charAt(i) =='i'||metin.charAt(i) =='ü'||metin.charAt(i) =='u'||metin.charAt(i) =='ö'||metin.charAt(i) =='o'){
                    ünlü_sayacı++;
                } else {
                    ünsüz_sayacı++;
                }


        }
        System.out.println("Girdiğiniz metindeki ünlü sayısı: "+ünlü_sayacı);
        System.out.println("Girdiğiniz metindeki ünsüz sayısı: "+ünsüz_sayacı);



    }
}
