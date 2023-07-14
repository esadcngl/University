import java.util.Scanner;
public class DizidekiEnkücükEleman2
{
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int dizi[] = new int[20];
        System.out.print("20 tane sayı giriniz.");
        for(int i =0; i< dizi.length;i++){
            dizi[i] = girdi.nextInt();
        }
        int indis = 0;
        int enKucuk = dizi[0];
        for(int i =1;i<dizi.length;i++){
            if(enKucuk>dizi[i]){
                enKucuk = dizi[i];
                indis = i;
            }
        }
        System.out.println("Dizideki en küçük eleman: "+ enKucuk);
        System.out.println("Dizideki en küçük elemanın olduğu indis: "+ indis);

    }
}
