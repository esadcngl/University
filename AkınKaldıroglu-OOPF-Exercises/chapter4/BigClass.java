package exercises.chapter4;

public class BigClass {
private static String name = "Big Class.";
public static void doSomething(){
    System.out.println("This static method working in "+name);
}
public void doSomethingElse(){
    System.out.println("This method working in "+ name );
}

    interface doable{
        void say();
        void saySomething();
    }
    public class InnerClass {
          public static String name2 = "Inner class";
          public void doSomethingInInner(){
              System.out.println("This method working in "+name2);
          }
          public static void doSomethingElseInInner(){
              System.out.println("This static method working in"+name2);
          }

          doable doable1 = new doable() {@Override
              public void say() {
                  System.out.println("Hello everyone!");
              }@Override
              public void saySomething() {
                  System.out.println("I'm trying something new!");
              }
          };

    }

}

