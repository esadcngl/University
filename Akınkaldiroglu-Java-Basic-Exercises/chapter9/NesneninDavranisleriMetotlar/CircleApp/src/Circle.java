public class Circle {

    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double ValueOfArea(double radius){
     double Area = radius*radius*3;
     return Area;
    }
    public double circumference (double radius){
        double circumference = 2*3*radius;
        return circumference;
    }



}
