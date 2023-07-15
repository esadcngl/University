package exercises.chapter5.assertions;

public class AssertionExample2 {
    public static void main(String[] args) {
        System.out.println(sqrt1(-15));

    }
    private static double sqrt1(int x ){
      //  assert x >= 0 : "can not be negative: " + x;
        assert x >= 0 : f1(x);
        return Math.sqrt(x);
    }
    private static String f1(int x){
        return "can not be negative: " + x;
    }

}
