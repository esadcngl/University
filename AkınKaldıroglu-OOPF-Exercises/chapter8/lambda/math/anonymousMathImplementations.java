package exercises.chapter8.lambda.math;

public class anonymousMathImplementations {
    public static void main(String[] args) {

        System.out.println("----------------------");

        Math adder = new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 + arg2;
            }
        };
        doMath(adder,2,3);


        System.out.println("----------------------");
        doMath(new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1*arg2;
            }
        },2,3);

        System.out.println("---------------------");
        doMath(new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 - arg2;
            }
        },5,2);

    }
    public static void doMath(Math math , double arg1 , double arg2){
        System.out.println(math.calculate(arg1,arg2));
    }

}
