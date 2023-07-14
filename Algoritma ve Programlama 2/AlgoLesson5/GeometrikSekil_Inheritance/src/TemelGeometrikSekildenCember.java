public class TemelGeometrikSekildenCember extends TemelGeometrikSekil {
    private double yaricap;
    TemelGeometrikSekildenCember(){
    }
    TemelGeometrikSekildenCember(double yaricap){
     this.yaricap = yaricap;
    }
    TemelGeometrikSekildenCember(double yaricap,String renk ,Boolean dolgu){
        super(renk,dolgu);
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
    public double getAlan(){
        return 3.14*yaricap*yaricap;
    }
    public double getCevre(){
        return 2*3.14*yaricap;
    }
    public double getCap(){
        return 2*yaricap;
    }
    public void yazdırCember(){
        System.out.println("Bu çember "+ getOlusturulmaTarihi()+ " tarihinde oluşturulup \n yarıcapı : "+ yaricap+
        "\n Cevresi: "+ getCevre() + "\n Alanı: " + getAlan() +"\n Dolgu durumu: " + isDolgu()       );
    }
}
