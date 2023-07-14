import java.util.Scanner;
public class BasicExercises_10 {
    public static void main(String[] args) {
    //Write a Java program to convert a decimal number to octal number
        int octal_num[]= new int[100];
        int i =1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number want to convert octal number:");
        int dec_num = scan.nextInt();
        int reminder;
        while (dec_num>0){
            reminder=dec_num%8;
            octal_num[i++]=reminder;
            dec_num = dec_num/8;
        }
        for (int j = i-1;j>0;j--){
            System.out.print(octal_num[j]);
        }

    }
}
