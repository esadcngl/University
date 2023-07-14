public class BKI {
    private String name;
    private int age;
    private double length;
    private double weigth;

    public BKI(String name, int age, double length, double weigth) {
        this.name = name;
        this.age = age;
        this.length = length;
        this.weigth = weigth;
    }

    public BKI(String name, double length, double weigth) {
        this.name = name;
        this.length = length;
        this.weigth = weigth;
    }

    public double getBKI() {
        return weigth / (length * length);
    }

    public String getDurum() {
        if (getBKI() <= 18.5) {
            return "Zayıf";
        } else if (getBKI() > 18.5 && getBKI() <= 24.9) {
            return "Normal";
        } else if (getBKI() > 24.9 && getBKI() <= 29.9) {
            return "kilolu";
        } else {
            return "Obez";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getLength() {
        return this.length;
    }

    public double getWeigth() {
        return this.weigth;
    }


}
