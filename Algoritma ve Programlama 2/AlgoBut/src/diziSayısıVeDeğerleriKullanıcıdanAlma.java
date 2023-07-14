import java.util.Scanner;
public class diziSayısıVeDeğerleriKullanıcıdanAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin satır sayısını giriniz: ");
        int satır = scan.nextInt();
        System.out.println("Dizinin sütun sayısını giriniz: ");
        int sütun = scan.nextInt();
        int dizi[][] = new int[satır][sütun];
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                dizi[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }

}
