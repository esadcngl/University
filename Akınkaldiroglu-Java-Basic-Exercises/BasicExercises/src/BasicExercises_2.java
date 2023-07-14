import java.util.Scanner;
public class BasicExercises_2 {
    //Write a Java program to print the sum of two numbers.
    public static void main(String[]args){
        //Simple solution
        int num1 = 51;
        int num2 = 15;
        System.out.println(num1+num2);
        //Simple solution using input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int numf = scan.nextInt();
        System.out.print("Enter the Second Number:");
        int nums = scan.nextInt();
        int sum = (nums+numf);
        System.out.println("The sum of two number is = "+sum);

    }

}
