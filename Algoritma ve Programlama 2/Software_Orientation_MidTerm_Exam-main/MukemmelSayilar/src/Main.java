import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Mükemmel sayı nın tanımı sayının pozitif bölenlerinin kendisi hariç  toplamının kendiisine eşit olmasıdır.
        // örneğin 28 = 1+2+4+7+14=28

        Scanner user = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int a = user.nextInt();
        int top = 0;
        for (int i =1;i<a;i++){
          if(a%i==0){
              top = i + top;
          }
        }
        System.out.println("toplam =  " + top);
       if (top==a){
           System.out.println("Girdiginiz sayi mükemmel sayidir.");
       }else{
           System.out.println("Girdiginiz sayi mükemmel sayi degildir.");
       }
        System.out.println(top);



    }
}