import java.util.Scanner;
public class BasicExercises_9 {
    public static void main(String[] args) {
      // Write a Java program to convert a decimal number to hexadecimal number.
        String hexdec_num = "";
        int reminder;
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Decimal number want to convert hexadecimal number:");
        int dec_num= scan.nextInt();
        while(dec_num>0){
            reminder = dec_num%16;
            hexdec_num = hex[reminder] + hexdec_num;
            dec_num = dec_num/16;

        }
        System.out.print("Hexadecimal number is " + hexdec_num+"\n");






    }
}
