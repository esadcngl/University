import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner kar = new Scanner(System.in);
        int b=1;
        String unlu = "aeoöuüiı";
        while(b==1) {
            System.out.println("Lütfen bir harf giriniz:");
            String user = kar.nextLine();
            boolean a = unlu.contains(user);
            if (user.length() >= 2) {
                System.out.println("Hatalı giriş! Lütfen bir harf giriniz:");
            } else if (a) {
                System.out.println("Harf ünlüdür.");
            } else {
                System.out.println("Harf ünsüzdür.");
            }
        }


     }
    }
