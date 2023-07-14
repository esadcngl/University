public class TemelGeometrikSekil {
 private String renk;
 private Boolean dolgu;
 private java.util.Date olusturulmaTarihi;
public TemelGeometrikSekil(String renk,Boolean dolgu){
    this.renk = renk;
    this.dolgu = dolgu;
    olusturulmaTarihi = new java.util.Date();
}
public TemelGeometrikSekil(){
olusturulmaTarihi = new java.util.Date();
}

public String getRenk(){
    return this.renk;
}
public void setRenk(String renk){
    this.renk = renk;
}
public Boolean isDolgu(){
    return this.dolgu;
}
public void setDolgu(boolean dolgu){
    this.dolgu = dolgu;
}

public java.util.Date getOlusturulmaTarihi(){
    return this.olusturulmaTarihi;
}
public String getDurum(){
    return "Oluşturulma tarihi: "+ olusturulmaTarihi + "\n Renk: "+ renk + "\n Dolgu durumu: "+ dolgu;
}


}
