package exercises.chapter5;

public class StackTreeExample {
    public static void main(String[] args) {
        StackTreeExample stackTreeExample = new StackTreeExample();
        stackTreeExample.doThis();
    }

   private void doThis(){
        doThat();
   }
   private void doThat(){
        Throwable throwable = new Throwable("I'm just trying something.");
        //throwable.printStackTrace();
      //  throw throwable(); // açarsak hata verir arayüzünde throw geçilmesi daha iyi böylece bir üst bağlama raising yapılır.

      //  System.out.println("---------------------");
        printStackTraceForThrowable(throwable);

   }
   private void printStackTraceForThrowable(Throwable throwable) {
       System.out.println("\n * * * Stack Traces * * * ");
        StackTraceElement[] elements = throwable.getStackTrace();
for (StackTraceElement traces : elements){
    System.out.println("\nNew Stack Info: ");
    System.out.println("File Class Name:  "+ traces.getClassName());
    System.out.println("File Method Name:  "+ traces.getMethodName());
    System.out.println("File File Name:  "+ traces.getFileName());
    System.out.println("File Line Number:  "+ traces.getLineNumber());
}
       System.out.println();
   }
}
