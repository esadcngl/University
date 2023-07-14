import java.util.Scanner;
public class BasicExercises_7 {
    //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the Second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter the Third number: ");
        double num3 = scan.nextDouble();
        System.out.println("The Avarage of three numbers: "+ ((num1+num2+num3)/3));

    }
}
