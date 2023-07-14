import java.util.Scanner;
public class BasicExercises_6 {
   // Write a Java program to print the area and perimeter of a circle.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a Radius value:");
        double rad = scan.nextDouble();
        double pi = 3.14;
        double Circle_Perimeter= 2*pi*rad;
        double Circle_Area= pi*rad*rad;
        System.out.println("The Circle's Perimeter is: " + Circle_Perimeter);
        System.out.println("The Circle's Area is: " + Circle_Area);


    }
}
