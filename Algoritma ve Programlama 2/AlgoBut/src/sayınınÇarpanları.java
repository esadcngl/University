import java.util.Scanner;
public class sayınınÇarpanları {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Çarpanlarına ayırmak istediğiniz sayıyı giriniz: ");
        int sayı = scan.nextInt();
        int asal[] = new int[sayı];
        int j=0;
        for(int i=1;i<=sayı;i++){
            if(sayı%i==0){
                asal[j]=i;
                j++;
            }
        }
        for(int i = 0; i< j; i++){
            System.out.print(asal[i]+" ");
        }






    }
}
