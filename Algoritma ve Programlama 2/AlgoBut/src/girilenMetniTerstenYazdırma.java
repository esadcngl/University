import java.util.Scanner;

public class girilenMetniTerstenYazdırma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String metin = girdi.nextLine();
        String tersMetin = "";
        for (int j = metin.length() - 1; j >= 0; j--){
            tersMetin = tersMetin + metin.charAt(j);
        }
        System.out.print("Yazdığınız metin: "+ metin+ "\n");
        System.out.print("Yazdığınız metnin tersi : "+ tersMetin);

    }
}
