import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = input.nextLine();

        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}