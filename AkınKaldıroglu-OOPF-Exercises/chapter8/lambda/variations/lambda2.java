package exercises.chapter8.lambda.variations;

public class lambda2 {
    public static void main(String[] args) {
       for (int i = 0; i<6; i++){
           BinaryDoubleChecker checker = binaryDoubleCheckerFactory();
           binaryDoubleCheckerExecutor(checker,12.23,7.54);
           System.out.println();
       }

    }
    public static BinaryDoubleChecker binaryDoubleCheckerFactory(){
        BinaryDoubleChecker tautology = (d1,d2) -> true;
        BinaryDoubleChecker contradiction = (d1, d2) -> false;
        BinaryDoubleChecker equalityChecker = (d1, d2) -> d1 ==d2;
        BinaryDoubleChecker firstArgumentGreaterChecker = (d1, d2) -> d1>d2;
        BinaryDoubleChecker secondArgumentGreaterChecker = ((d1, d2) -> d1<d2);

        BinaryDoubleChecker checker = null;
        int i = (int) (Math.random()*5);
        switch (i){
            case 0:
                checker = tautology;
                System.out.println("Tautology");
                break;
            case 1:
                checker = contradiction;
                System.out.println("Contradiction");
                break;
            case 2:
                checker = equalityChecker;
                System.out.println("EqualityChecker");
                break;
            case 3:
                checker =firstArgumentGreaterChecker;
                System.out.println("firstArgumentChecker");
               break;
            case 4:
                checker = secondArgumentGreaterChecker;
                System.out.println("secondArgumentChecker");
                break;
        }
        return checker;
    }
    public static void binaryDoubleCheckerExecutor(BinaryDoubleChecker checker,double d1,double d2){
        boolean outcome = checker.check(d1,d2);
        System.out.println(outcome);
    }
}
@FunctionalInterface
interface BinaryDoubleChecker{
    boolean check(double d1,double d2);
}