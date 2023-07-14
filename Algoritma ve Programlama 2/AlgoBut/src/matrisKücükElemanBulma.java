public class matrisKücükElemanBulma {
    public static void main(String[] args) {
        int dizi[][] = {{100, 20, 300}, {44, 55, 666}, {7, 80, 9}, {10, 11, 12}};
        int tempDizi[] = new int[12];
        int a = 0;
        int temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                tempDizi[a] = dizi[i][j];
                a++;
            }
        }
        for (int i = 0; i < tempDizi.length; i++) {
            System.out.print(tempDizi[i] + " ");
        }
        System.out.println();
        int enKücük = tempDizi[0];
        for (int i = 1; i < tempDizi.length; i++) {
            if (tempDizi[i] < enKücük) {
                enKücük = tempDizi[i];
            }

        }
        System.out.print("Matrisdeki en küçük eleman: " + enKücük);
    }
}