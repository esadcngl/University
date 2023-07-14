public class PointTest {
    public static void main(String[] args) {
      Point point1 = new Point();
      point1.setX_noktasi(3);
      point1.setY_noktasi(4);
      point1.orjin_uzaklıgı(point1);

      Point point2 = new Point();
      point2.setY_noktasi(2);
      point2.setX_noktasi(1);
      point2.orjin_uzaklıgı(point2);
        System.out.print("İki nokta arasındaki uzaklık => ");
        point1.iki_nokta_arasi(point1,point2);
        
        point1.x_arttir(4);
    }
}