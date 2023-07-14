import java.util.Scanner;

public class sayıyıBinaryeÇevirme {
    public static void main(String[] args) {
        System.out.println("Binarye çevirmek istediğiniz sayıyı giriniz:");
        Scanner input = new Scanner(System.in);
        int DecSayı = input.nextInt();
        int bölüm;
        int a = 1;
        int BinSayı[] = new int[100];
        bölüm = DecSayı;
        while (bölüm != 0) {
            BinSayı[a++] = bölüm % 2;
            bölüm = bölüm / 2;
        }
        for(int j=a-1;j>0;j--){
            System.out.print(BinSayı[j]);
        }

    }
}
