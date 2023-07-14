package exercises.chapter5;

public class FinallyExample{
    public static void main(String[] args) {
        System.out.println("in main() before calling divide()");
        try{
            divide(20,0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Problem with division.");
            System.out.println("Message: "+ arithmeticException.getMessage());
            divide(20,5);
        } finally {
            System.out.println("in Finally");
        }
        System.out.println("in main() after calling divide().");
    }

     public static void divide(int num1 , int num2 ){
         System.out.println("in divide method with argument "+num1 +" and "+num2);
         if(num2 == 0 ){
             throw new ArithmeticException("Cant divide zero! ");
         }else {
             int division = num1/num2;
             System.out.println(num1 + "/"+num2+" = "+division);
         }
     }


}
