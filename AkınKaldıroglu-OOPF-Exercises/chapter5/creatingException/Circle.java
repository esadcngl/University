package exercises.chapter5.creatingException;

public class Circle {
    private double radius;
    Circle(double radius) throws negativeRadiusException {
        System.out.println("Circle created.");
        if(radius>0)
        this.radius = radius;
        else {
            throw new negativeRadiusException("Radius can not be negative.",radius);
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
