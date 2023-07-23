public class Circle2 {

    final double Pİ = 3;
    double yarıcap;
    public Circle2(){
        this(10);
    }
    public Circle2(double cap){
        yarıcap = cap;
    }

    public void CevreHesapla(){
        double cevre = Pİ*2*yarıcap;
        System.out.println(cevre);
    }
    public void AlanHesapla(){
        double Alan = Pİ*yarıcap*yarıcap;
        System.out.println(Alan);
    }


}
