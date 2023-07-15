package exercises.chapter5.catchWithResource;

public class tryWithResource {
    public static void main(String[] args) {
        //run1();
        // run2();
         run3();

    }

    // see closing order
    private static void run1() {
        try (ClosableClass closableClass = new ClosableClass("Unique", false)) {
            System.out.println("In try Block.");
            throwException();
        } catch (Exception e) {
            System.out.println("in Catch block()");
        } finally {
            System.out.println("Finally working :)");
        }
        System.out.println("After try block!");
    }
    private static void run2(){

        try(ClosableClass closableClass = new ClosableClass("First",false);ClosableClass closableClass1=new ClosableClass("Second",false)){
            System.out.println("In try Block.");
            throwException();
        }catch (Exception e){
            System.out.println("in Catch block()");
        }finally {
            System.out.println("Finally working :)");
        }
        System.out.println("After try block!");


    }
    private static void run3(){

        try(ClosableClass closableClass = new ClosableClass("First",false);ClosableClass closableClass1=new ClosableClass("Second",true)){
            System.out.println("In try Block.");
            throwException();
        }catch (Exception e){
            System.out.println("in Catch block()");
        }finally {
            System.out.println("Finally working :)");
        }
        System.out.println("After try block!");


    }

    private static void throwException() throws Exception {
        if (0.5 < Math.random()) {
            System.err.println("Throwing Exception");
            throw new Exception();
        }

    }


}
