import java.util.Scanner;
public class BasicExercises_4 {
    //Write a Java program that takes a number as input and prints its multiplication table up to 10.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        int multiply =1;
         for (int i = 1; i < 11; i++) {
             System.out.println(num+" x "+i+" = "+ (num*i));
        }
    }








}
