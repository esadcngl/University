import java.util.Scanner;

public class çokBoyutluDizideBüyükKüçükEleman {
    public static void main(String[] args) {
        System.out.print("Dizi elemanlarını giriniz: ");
        Scanner scan = new Scanner(System.in);
        int dizi[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j] = scan.nextInt();
            }

        }
        int kücükSayı = dizi[0][0];
        int büyükSayı = dizi[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (dizi[i][j] < kücükSayı) {
                    kücükSayı = dizi[i][j];

                }
                for (int k = 0; k < 3; k++) {
                    if(dizi[i][k]>büyükSayı){
                        büyükSayı = dizi[i][k];

                    }
                }

            }
        }
        System.out.println("Büyük sayı = "+ büyükSayı);
        System.out.println("Küçük sayı = "+ kücükSayı);
    }
}
