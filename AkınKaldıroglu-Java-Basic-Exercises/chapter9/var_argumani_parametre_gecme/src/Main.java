public class Main {

    String isim;
    public static double ortalama(double ... sayılar){
        int toplam = 0;
        int count = 0;
        for(double sayi : sayılar  ){
            toplam += sayi;
            count++;
        }
        return toplam/count;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
