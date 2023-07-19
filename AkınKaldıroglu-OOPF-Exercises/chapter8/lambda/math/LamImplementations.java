package exercises.chapter8.lambda.math;

public class LamImplementations {
    public static void main(String[] args) {
        Math adder = (double arg1 , double arg2) -> {return arg1 + arg2;};
        doMath(adder,2,3);
        Math multiplier = (double arg1,double arg2) ->{return arg1*arg2;};
        doMath(multiplier,2,3);
        Math substracter = (double arg1 , double arg2) -> {return arg1-arg2;};
        doMath(substracter,10,2);
        Math divider = (double arg1 , double arg2) -> {return arg1/arg2;};
        doMath(divider,9,3);
        System.out.println("----------------");

        doMath((double arg1 , double arg2)->{return arg1+arg2;},2,3);
        doMath((double arg1 , double arg2)->{return arg1*arg2;},2,6);
        doMath((double arg1 , double arg2)->{return arg1/arg2;},18,3);
        doMath((double arg1 , double arg2) ->{return arg1-arg2;},10,3);
        System.out.println("--------------------");

        //Variations
        doMath((double arg1,double arg2)->{return arg1+arg2;},3,8);
        doMath((arg1, arg2) -> {return arg1+arg2;},3,8);
        doMath((arg1, arg2) -> arg1+arg2,3,8);
        System.out.println("--------------------");

        Math mod = (a,b) -> a%b;
        doMath(mod,100,3);

        Math power = (a,b)->{return java.lang.Math.pow(a,b);};
        doMath(power,2,3);

    }


    public static void doMath(Math math , double arg1 , double arg2 ){
        System.out.println(math.calculate(arg1,arg2));
    }


}
