public class withoutTemp
{
    public static void main(String[] args) {
        int a =17;
        int b= 25;
        System.out.println("birinci sayı: "+a);
        System.out.println("ikinci sayı: "+b);
        b= b-a;
        a =a+b;
        b =a-b;

        System.out.println("birinci sayı: "+ a);
        System.out.println("ikinci sayı: "+ b);

    }
}
