import java.util.Scanner;
public class Exercise_3 {
//Write a Java method to display the middle character of a string.
//Note: a) If the length of the string is odd there will be two middle characters.
//      b) If the length of the string is even there will be one middle character.
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter Something (sencentes , number etc.): ");
        String word = user.nextLine();
        System.out.println("The middle character of a string: "+ Sentence(word));
    }
    public static String Sentence(String word) {
        int position;
        int length;
        if (word.length()%2==0){
            position = word.length()/2-1;
            length =2;
        }else {
            position = word.length()/2;
            length=1;
        }
       return word.substring(position,position+length);
    }
}
