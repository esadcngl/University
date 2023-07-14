public class Metotlar {
    public static void main(String[] args) {
        System.out.println(enBuyuk(13, 9));
        System.out.println(toplam(1, 10));
        notYazdır(186.6);
        int x = 1;
        System.out.println("Metodu çağırmadan önce x: " + x);
        arttır(x);
        System.out.println("Metodu çağırdıktan sonra x: " + x);
        System.out.println("5 in faktöriyeli "+Faktoriyel(5));
        System.out.println("0 ın faktöriyeli "+Faktoriyel(0));
    }

    //iki sayıdan en büyüğü döndüren metot.
    public static int enBuyuk(int a, int b) {
        int buyuk = a;
        if (b > a) {
            buyuk = b;
        }
        return buyuk;
    }

    // birinci sayıdan ikinci sayıya kadar toplam yapan metot
    public static int toplam(int a, int b) {
        int top = 0;
        for (int i = a; i <= b; i++) {
            top += i;
        }
        return top;
    }

    // Not harfi getirme metodu if ile
    public static void notYazdır(double not) {
        if (not > 100 || not < 0) {
            System.out.println("Geçersiz ders notu girdiniz");
            return;
        }
        if (not >= 90.0) {
            System.out.println("A");
        } else if (not >= 80.0) {
            System.out.println("B");
        } else if (not >= 70.0) {
            System.out.println("C");
        } else if (not >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void arttır(int x) {
        x++;
        System.out.println(x);
    }
    // Faktöriyel hesaplayan bir metot
    public static int Faktoriyel(int a) {
        if (a == 0)
            return 1;
        else
           return a*Faktoriyel(a-1);

    }


}