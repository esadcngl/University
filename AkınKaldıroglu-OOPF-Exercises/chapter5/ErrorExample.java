package exercises.chapter5;

import java.io.IOException;

public class ErrorExample {
    public static void main(String[] args) {
         //StackOverFLowError famous one  :))
        // recursiveMethod();
        throwException1();
        throwException2();
        try{
            throwException1();
            throwException2();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException a){
            System.out.println(a.getMessage());
            System.out.println(a.getClass());
        }
    }
    public static void throwException1(){
        System.out.println("1.Exception Runtime");
      throw new NullPointerException("NullPointerException Detected!");
    }

    public static void throwException2()  {
        System.out.println("2.Exception Arithmetic");
        throw new ArithmeticException("ArithmeticException");
    }
    private static void recursiveMethod(){
        recursiveMethod();
    }

}
