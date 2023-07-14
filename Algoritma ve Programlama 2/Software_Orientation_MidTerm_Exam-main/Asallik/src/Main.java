import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sayı = new Scanner(System.in);
        int b =1;
        while(b==1){
            System.out.println("Lütfen bir sayi giriniz = ");
            int number = sayı.nextInt();
            boolean a = false;
            for(int i =2;i<number;i++){
                if (number%i==0){
                    a = true;
                }
            }
            if (a){
                System.out.println("Sayı Asal Değildir.");
            } else if (number==1){
                System.out.println("Sayı Asal Değildir.");
            }else{
                System.out.println("Sayı Asaldır.");
            }


        }




    }


}


