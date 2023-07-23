public class Main {
    public static void main(String[] args) {
        System.out.println(average(15,28));

    }
    static double average(int a, int b){
        double average = (a+b)/2.0;
        return average;
    }
    static boolean isEven(int x ){
        boolean even = false;
        if ( x%2==0){
            even = true;
        }
        return even;
    }
}