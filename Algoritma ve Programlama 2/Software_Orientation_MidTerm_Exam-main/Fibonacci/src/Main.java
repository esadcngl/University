public class Main {
    public static void main(String[] args) {
        //Fibonacci Dizisinin ilk 20 elemanını yazdıran program
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a+","+b);
        for (int i=1;i<19;i++){
            c = a+b;
            System.out.print(","+ c);
            a = b;
            b = c;
        }
    }
}