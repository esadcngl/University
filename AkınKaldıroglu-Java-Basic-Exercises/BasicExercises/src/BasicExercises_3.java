import java.util.Scanner;
public class BasicExercises_3 {
    //Write a Java program to divide two numbers and print on the screen.
    public static void main(String[] args) {
        //Simple solution
        System.out.println(15/5);
        //Simple solution using input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int numf = scan.nextInt();
        System.out.print("Enter the second number:");
        int nums = scan.nextInt();
        System.out.println("The division of two numbers: "+(numf/nums));
    }
}