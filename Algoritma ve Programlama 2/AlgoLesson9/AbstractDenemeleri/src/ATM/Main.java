package ATM;

public class Main {
    public static void main(String[] args) {
       currentAccount atm1 = new currentAccount(5000);
        System.out.println(atm1.toString());
       atm1.deposit(5000);
        System.out.println(atm1.toString());
        atm1.withdraw(2500);
        System.out.println(atm1.toString());
    }

}

