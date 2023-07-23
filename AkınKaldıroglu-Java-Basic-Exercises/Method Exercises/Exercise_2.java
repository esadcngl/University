import java.util.Scanner;
public class Exercise_2 {
    //Write a Java method to compute the average of three numbers.
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1 = user.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = user.nextDouble();
        System.out.print("Enter the third number:");
        double num3 = user.nextDouble();
        System.out.println("The Entered three number's average is: "+Average(num1,num2,num3) );

    }
     public static double Average(double x , double y, double z ){
        double AverageNum = (x+y+z)/3;
        return AverageNum;
     }

}
