import java.util.Scanner;
public class metindekiKelimeSayısıBulma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = girdi.nextLine();
        int kelime_sayaci=1;
        for(int i =0;i<metin.length();i++){
            if(metin.charAt(i)==' '){
                kelime_sayaci++;
            }

        }
        System.out.println("Yazdığınız metindeki kelime sayısı: "+ kelime_sayaci);


    }
}
