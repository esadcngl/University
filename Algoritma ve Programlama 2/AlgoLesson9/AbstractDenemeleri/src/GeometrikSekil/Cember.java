package GeometrikSekil;

public class Cember extends GeometrikSekil{
private double yaricap;
public Cember(){
}

    public Cember(double yarıcap){
    this.yaricap = yarıcap;
}
public Cember(double yaricap , String renk , boolean dolgu ){
    super(renk, dolgu);
    this.yaricap = yaricap;
}

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getAlan() {
        return yaricap* yaricap * Math.PI;
    }

    @Override
    public double getCevre() {
        return 2*Math.PI*yaricap;
    }




}
