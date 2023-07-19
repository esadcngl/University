package exercises.chapter8.lambda.variations;

public class lambda2Homework {
    public static void main(String[] args) {
        Greeting greet1 = (String isim)-> System.out.println("Selam ! "+ isim);
        lambda2Homework.doGreet(greet1,"Esad");
    }

    public static void doGreet(Greeting greeting,String who){
        greeting.greet(who);
    }

    @FunctionalInterface
    interface Greeting{
        void greet(String kimi);
    }
}
