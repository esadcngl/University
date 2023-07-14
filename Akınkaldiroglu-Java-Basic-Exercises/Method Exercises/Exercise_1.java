import java.util.Scanner;
public class Exercise_1 {
//Write a Java method to find the smallest number among three numbers
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
       SmallestNumber(1,7,10);
       double Smallnum = Smallest(7,18,45);
        System.out.println("The Smallest Number is "+Smallnum);
        System.out.print("Enter the first number:");
        double x = User.nextDouble();
        System.out.print("Enter the second number:");
        double y = User.nextDouble();
        System.out.print("Enter the third number:");
        double z = User.nextDouble();
        System.out.println("The Smallest Number is: "+ Small(x,y,z));

    }
    public static double Small(double num1,double num2 ,double num3){
        return Math.min(num3,Math.min(num1,num2));

    }


    //type:1
    public static void SmallestNumber(int num1,int num2,int num3){
        if (num1>num2 && num2>num3){
            System.out.println("The Smallest Number is "+ num3);
        } else if(num2 >num1 && num3 >num2){
            System.out.println("The Smallest Number is "+ num1);
        } else if (num3>num1 && num1>num2){
            System.out.println("The Smallest Number is "+ num2);
        } else{
            System.out.println("You entered invalid numbers.");
        }
    }
    //type:2
      public static double Smallest(int num1, int num2 , int num3){
          int small =(Math.min(num3,Math.min(num1,num2)));
      return small;
    }

}
