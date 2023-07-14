import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;
public class Exercise_5 {
    //Write a Java method to count all words in a string
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Write Something: ");
        String text = input.nextLine();
        System.out.println("There are "+WordNum(text)+" words in this sentence. " );
    }
    public static int WordNum(String text) {
    int count =0;
       if (!(" ".equals(text.substring(0,1))) || (" ".equals(text.substring(text.length() -1)))){
           for(int i =1; i<text.length();i++){
              if (text.charAt(i)==' '){
                  count++;
              }
           }
        }
       return count= count+1;
    }

}
