package src;

import java.util.Scanner;
public class BasicExercises_1 {
    //Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    public static void main(String[] args) {
        //Simple solution
        System.out.println("Hello");
        System.out.println("Muhammed Esad Çıngılı");
        //Simple solution using input from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("İnput your first name");
        String fname = scan.nextLine();
        System.out.println("İnput your last name");
        String lname = scan.nextLine();
        System.out.println("hello "+ fname + " "+ lname + ".");
    }
}