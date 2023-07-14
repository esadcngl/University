public class TemelGeometrikSekildenDikdörtgen extends TemelGeometrikSekil {
    double yükseklik;
    double genislik;
    TemelGeometrikSekildenDikdörtgen(double yükseklik, double genislik){
        this.yükseklik = yükseklik;
        this.genislik = genislik;
    }
    TemelGeometrikSekildenDikdörtgen(double yükseklik,double genislik,String renk, boolean dolgu){
       super(renk,dolgu);
        this.genislik = genislik;
        this.yükseklik = yükseklik;
    }

    public double getYükseklik() {
        return yükseklik;
    }

    public void setYükseklik(double yükseklik) {
        this.yükseklik = yükseklik;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }
    public double getAlan(){
        return yükseklik*genislik;
    }
    public double getCevre(){
        return 2*(yükseklik+genislik);
    }


}
