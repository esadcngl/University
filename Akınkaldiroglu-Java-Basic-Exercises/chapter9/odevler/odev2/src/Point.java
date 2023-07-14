public class Point {
    int x_noktasi;
    int y_noktasi;

    public int getX_noktasi() {
        return x_noktasi;
    }

    public void setX_noktasi(int x_noktasi) {
        this.x_noktasi = x_noktasi;
    }

    public int getY_noktasi() {
        return y_noktasi;
    }

    public void setY_noktasi(int y_noktasi) {
        this.y_noktasi = y_noktasi;
    }

    public void x_arttir(int miktar) {
        x_noktasi += miktar;
    }

    public void x_azalt(int miktar) {
        x_noktasi -= miktar;
    }

    public void y_arttir(int miktar) {
        y_noktasi += miktar;
    }

    public void y_azalt(int miktar) {
        y_noktasi -= miktar;
    }

    public void orjin_uzaklıgı(Point point) {
        double uzaklık = Math.sqrt(Math.pow(point.x_noktasi, 2) + Math.pow(point.y_noktasi, 2));
        System.out.println(uzaklık);
    }

    public void iki_nokta_arasi(Point point1, Point point2) {
        int x1 = point1.x_noktasi;
        int x2 = point2.x_noktasi;
        int y1 = point1.y_noktasi;
        int y2 = point2.y_noktasi;
        double a = (double) Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
        System.out.print(a);
    }

}
