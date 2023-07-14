package exercises.chapter5;

public class RaisingExample {

    public static void main(String[] args) throws Throwable {
        doSomething();
        System.out.println("After doSomething()");
    }

    private static void doSomething() throws Throwable {
        doSomethingElse();
    }

    private static void doSomethingElse() throws Throwable {
        throwAThrowable();
    }

    private static void throwAThrowable() throws Throwable {
        Throwable throwable = new Throwable("Throwable Hatası");
       // throw throwable;
        // üstteki kodu açıp kapayarak nasıl bir davranış sergiliyor bak
    }
}
