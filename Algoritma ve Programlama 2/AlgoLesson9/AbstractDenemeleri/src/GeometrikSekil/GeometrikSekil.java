package GeometrikSekil;

import java.util.Date;

public abstract class GeometrikSekil {
    private String renk;
    private  boolean dolgu;
    private java.util.Date olusturmaTarihi;

    protected GeometrikSekil(){
        olusturmaTarihi = new java.util.Date();
    }
    protected GeometrikSekil (String renk , boolean dolgu ){
        olusturmaTarihi = new java.util.Date();
        this.renk = renk;
        this.dolgu = dolgu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isDolgu() {
        return dolgu;
    }

    public void setDolgu(boolean dolgu) {
        this.dolgu = dolgu;
    }
  public java.util.Date getOlusturmaTarihi(){
        return olusturmaTarihi;
  }
  public String toString(){
        return "Olusturma Tarihi: " + olusturmaTarihi + "\nrenk: "+ renk +" ve  dolgu: "+ dolgu;
  }
  public abstract double getAlan();
 public  abstract double getCevre();



}
