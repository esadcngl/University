import java.util.Scanner;

public class sayıyıHexadimalÇevirme {
    public static void main(String[] args) {
        int dec_sayı, kalan;
        String hexdec_sayı = "";
        /* hexadecimal number digits */
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner in = new Scanner(System.in);
        System.out.print("Hexadesimale çevirmek istediğiniz sayıyı girin: ");
        dec_sayı = in.nextInt();
        while (dec_sayı > 0) {
            kalan = dec_sayı % 16;
            hexdec_sayı = hex[kalan] + hexdec_sayı;
            dec_sayı = dec_sayı / 16;
        }
        System.out.print("Hexadesimal sayı : " + hexdec_sayı + "\n");
    }
}
