public class CircleTest {
    public static void main(String[] args) {
        Circle Daire1 = new Circle();
        Daire1.setRadius(1.00);
        Circle Daire2 = new Circle();
        Daire2.setRadius(3.00);
        System.out.println("1. Dairenin alanı : "+ Daire1.ValueOfArea(Daire1.getRadius()));
        System.out.println("1. Dairenin çevresi : "+ Daire1.circumference(Daire1.getRadius()));
        System.out.println("2. Dairenin alanı : "+ Daire2.ValueOfArea(Daire2.getRadius()));
        System.out.println("2. Dairenin çevresi : "+ Daire2.circumference(Daire2.getRadius()));
    }
}