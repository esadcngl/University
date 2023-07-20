package exercises.chapter8.lambda;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Locale;
import java.util.function.*;

public class ex {
    public static void main(String[] args) {

        Consumer<String> print1 = System.out::println;
        print1.accept("Merhabalar herkese! ");

        BiFunction<String,String,String>print4 = (s, s2) -> s.toLowerCase()+ " " +s2.toUpperCase();
        System.out.println(print4.apply("MERHABALAR","arkadaşlar"));
        BiFunction<String,String,String>print3 = String::concat;
        Consumer<String>stringConsumer = print1.andThen(print1) ;



        }
    }

