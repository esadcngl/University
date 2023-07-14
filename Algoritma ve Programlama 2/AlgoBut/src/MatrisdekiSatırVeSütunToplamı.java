import java.util.Scanner;

public class MatrisdekiSatırVeSütunToplamı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dizi[][] = new int[3][3];
        int Satır1 = 0, Sütun1 = 0;
        int Satır2 = 0, Sütun2 = 0;
        int Satır3 = 0, Sütun3 = 0;
        int a = 0;
        int b = 1;
        int c = 2;
        System.out.println("Dizi elemanları ekle: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                scan.nextInt();
            }
        }
        for (int j = 0; j < 3; j++) {
            Satır1 += dizi[a][j];
            Sütun1 += dizi[j][a];
        }

        for (int i = 0; i < 3; i++) {
            Satır2 += dizi[b][i];
            Sütun2 += dizi[i][b];
        }

        for (int k = 0; k < 3; k++) {
            Satır3 += dizi[c][k];
            Sütun3 += dizi[k][c];
        }

    }
}








