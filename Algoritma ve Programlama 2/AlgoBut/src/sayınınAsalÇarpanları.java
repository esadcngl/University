import java.util.Scanner;

public class sayınınAsalÇarpanları {
    public static void main(String[] args) {
        int bolen;
        int boleninboleni;
        boolean asal=true;
        Scanner klavye=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi=klavye.nextInt();
        for(bolen=2;bolen<sayi;bolen++){
            if((sayi%bolen)==0){
                for(boleninboleni=2;boleninboleni<bolen;boleninboleni++){
                    if((bolen%boleninboleni)==0){
                        boleninboleni=boleninboleni+bolen;
                        asal=false;
                    }
                }
                if(asal==true)
                    System.out.print(bolen+" ");
            }
        }
    }
}
