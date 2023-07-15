package exercises.chapter4;

public class BigClassTest {
    public static void main(String[] args) {
        // creating Big Class
        BigClass bigClass1 = new BigClass();
        // creating Inner Class
        BigClass.InnerClass inner = bigClass1.new InnerClass();
        BigClass.doSomething();
        bigClass1.doSomethingElse();
        BigClass.InnerClass.doSomethingElseInInner();
        inner.doSomethingInInner();

    }


}
