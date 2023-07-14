import java.util.Scanner;
public class kelimedekiSesliVeSessizHarf
{
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = girdi.nextLine();
        kelime = kelime.toLowerCase();
        String sesliler = "";
        String sessizler = "";
        for(int i = 0; i<kelime.length();i++){
            if(kelime.charAt(i)=='a' || kelime.charAt(i)=='e' ||kelime.charAt(i)=='u' ||kelime.charAt(i)=='ü' ||kelime.charAt(i)=='ı' || kelime.charAt(i)=='i' ||kelime.charAt(i)=='o' ||kelime.charAt(i)=='ö'){
                sesliler = sesliler + kelime.charAt(i);
            }else{
                sessizler = sessizler + kelime.charAt(i);
            }
        }
        System.out.println("Kelimedeki sesli harfler: "+ sesliler);
        System.out.println("Kelimedeki sessiz harfler: "+ sessizler);



    }
}
