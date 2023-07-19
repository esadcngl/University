package exercises.chapter8.lambda.variations;

import java.util.Date;

public class lambda1 {
    public static void main(String[] args) {

        interface1 merhaba1 = () ->{System.out.println("Merhaba!");};
        merhaba1.f1();
        interface1 merhaba2 = () -> System.out.println("Merhaba2 !");
        merhaba2.f1();
        interface1 nothing1 = () -> {return;};
        interface1 nothing2 = () -> System.out.println(new Date());
        nothing2.f1();
        System.out.println("----------------------------------------");
        interface2 deger = arg -> System.out.println("Girilen deger : " + arg);
        deger.f2(21);
        interface2 deger2 = (double arg) -> System.out.println("Sayı : "+ arg);
        deger2.f2(12);
        interface2 karekok = arg -> System.out.println(Math.sqrt(arg));
        karekok.f2(36);
        System.out.println("----------------------------------------");

        interface3 deneme1 = () -> 5;
        System.out.println(deneme1.f3());
        interface3 deneme2 = () -> 12*5;
        interface3 deneme3 = () -> Math.random()*10;
        System.out.println(deneme3.f3());

        System.out.println("----------------------------------------");

        interface4 karesi = arg -> {return arg*arg;};
        System.out.println(karesi.f4(12));
        interface4 karesi2 = arg -> {return Math.pow(arg,2);};
        System.out.println(karesi2.f4(12));
        interface4 alver = i -> i ;
        interface4 uzun = i -> {
            double k = i*i + 25;
            return k;
        };
        System.out.println("-----------------------------------------");
        interface5 avarage = (d1 , d2) -> {return (d1 + d1)/2;  };
        System.out.println(avarage.f5(12,16));
    }
    @FunctionalInterface
    interface interface1{
        void f1();
    }
    @FunctionalInterface
    interface interface2{
        void f2(double arg);
    }
    @FunctionalInterface
    interface interface3{
        double f3();
    }
    @FunctionalInterface
    interface interface4{
        double f4(double arg);
    }
    @FunctionalInterface
    interface interface5{
        double f5(double arg1 , double arg2);
    }
}
