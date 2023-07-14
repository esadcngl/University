package exercises.chapter5;

public class CatchingExample {
    public static void main(String[] args) {
       method1();
    }
    private static void method1(){
        try{
            method2();
            System.out.println("This is working");
        }catch (Throwable e ){
            System.out.println("catched and it's message: "+e.getMessage());
        }
    }
    private static void method2() throws Throwable{
        throwingMethod();
    }
    private static void throwingMethod() throws Throwable{
        double luck= Math.random();
        if(luck<0.5){
            System.out.println("I have problem but I'm doing my work.");
            System.out.println("Luck: "+ luck);
            Throwable throwable = new Throwable("This is Throwable Exception type.");
            throw throwable;
        }else{
            System.out.println("I'm doing my work.Everything is okey.");
        }

    }



}
