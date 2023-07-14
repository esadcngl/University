public class diziOrtalamasıVeOrtalamaAltıKaçıncıSatırSütun {
    public static void main(String[] args) {
        int dizi[][] = {{1, 5, 3}, {2, 12, 7}, {15, 8, 4}, {20, 18, 9}};
        int toplam = 0;
        int eleman;
        double ortalama;
        int sütun,satır;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
               toplam += dizi[i][j];
            }
        }
        ortalama=(double)toplam/12;
        System.out.println("Dizinin ortalaması:"+ ortalama);
        for(int i=0; i<4; i++){
            for(int j = 0; j<3; j++){
                if(dizi[i][j]<ortalama){
                    satır =i;
                    sütun =j;
                    System.out.printf("Dizinin %d. satırında ve %d. sütununda bulunan "+dizi[i][j]+" elemanı",satır,sütun);
                    System.out.println();
                }
            }
        }


    }
}
