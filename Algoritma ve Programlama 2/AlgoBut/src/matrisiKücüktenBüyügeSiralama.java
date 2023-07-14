public class matrisiKücüktenBüyügeSiralama {
    public static void main(String[] args) {
        int dizi[][] = {{100, 20, 300}, {44, 55, 666}, {7, 80, 9}, {10, 11, 12}};
        int dizi2[] = new int[12];
        int dizi3[][] = new int[4][3];
        int a = 0, b = 0;
        int temp;
        // Normal Matrisi Yazdırıyorum

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                dizi2[b] = dizi[i][j];
                b++;
            }
        }
        for (int i = 0; i < dizi2.length - 1; i++) {
            for (int j = i + 1; j < dizi2.length; j++) {
                if (dizi2[i] > dizi2[j]) {
                    temp = dizi2[i];
                    dizi2[i] = dizi2[j];
                    dizi2[j] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j] = dizi2[a];
                a++;
            }
        }
        System.out.println("---------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

    }
}
