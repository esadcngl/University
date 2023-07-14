public class CircleApp2 {
    public static void main(String[] args) {
        Circle2 circle1 = new Circle2();
        circle1.AlanHesapla();
        circle1.CevreHesapla();

        Circle2 circle2 = new Circle2(3);
        circle2.CevreHesapla();
        circle2.AlanHesapla();
    }
}