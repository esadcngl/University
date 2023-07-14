import java.util.Scanner;
public class BolmeMethotla {
    public static int bolme(int a , int b){
        if(b ==0){
            throw new ArithmeticException("0'a Bölünmez");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sayılar = new Scanner(System.in);
        System.out.println("Lütfen bölmek istediğiniz sayıyı giriniz : ");
        int a = sayılar.nextInt();
        System.out.println("Neye bölmek istiyorsunuz : ");
        int b = sayılar.nextInt();
        try{
            System.out.println(a+ " ÷ " + b + " = "+ bolme(a,b));
        } catch (ArithmeticException zero){
            System.out.println("Hiç bir sayı 0 ' a bölünemez! ");
        }

    }
}
