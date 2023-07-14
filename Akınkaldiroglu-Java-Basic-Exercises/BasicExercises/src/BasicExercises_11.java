import java.beans.PropertyEditorManager;
import java.util.Scanner;
public class BasicExercises_11 {
    public static void main(String[] args) {
        //Write a Java program to convert a binary number to decimal number.
        Scanner scan = new Scanner(System.in);
        int remainder;
        int dec_num = 0;
        int j=1;
        System.out.println("Enter the binary number want to convert decimal number:");
        int bin_num = scan.nextInt();
        while (bin_num!=0){
            remainder = bin_num%10;
            dec_num = dec_num + remainder*j;
            j=j*2;
            bin_num = bin_num/10;

        }
        System.out.println("Decimal number is : "+bin_num);

    }
}
