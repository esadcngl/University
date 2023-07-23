public class Main {
    public Günler gün;

    public static void main(String[] args) {
        System.out.println(Günler.CUMA);
        Günler gün1 = Günler.PAZARTESİ;



    }

    enum Günler{
        PAZARTESİ , SALI, CARSAMBA, PERSEMBE , CUMA , CUMARTESİ , PAZAR

    }
    public void setGünler(Günler gün){
        this.gün = gün;
    }

}