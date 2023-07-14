import java.util.Scanner;
public class BasicExercises_13
{
    public static void main(String[] args) {
        // Write a Java program and compute the sum of the digits of an integer.
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num = number.nextInt();
        int basamak,digit,total=0;
        for (int digits = (int)Math.log10(num)+1;digits>0;digits--){
            digit = num%10;
            total = digit +total;
            num = num/10;
        }

        System.out.print("the sum of the digits of the number you entered: "+ total);
    }
}
