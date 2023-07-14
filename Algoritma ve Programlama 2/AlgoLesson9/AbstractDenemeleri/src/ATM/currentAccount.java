package ATM;

public class currentAccount extends bankAccount{

    int balance;
    currentAccount(){
    }
    currentAccount(int balance){
        this.balance = balance;
    }

    @Override
    protected void deposit(int value) {
        this.balance = balance +  value;
        System.out.println("Hesabına "+ value + " TL yüklendi.");
    }

    @Override
    protected void withdraw(int value) {
        if((balance - value) > 0  ){
            this.balance = balance - value;
            System.out.println("Hesabınızdan "+ value + " TL "+ "çekildi.");
        }else
            System.out.println("Yeterli Bakiye yok tekrar deneyin.");
    }
   public String toString(){
        return "Hesabınızın güncel Bakiyesi: "+ this.balance  + " TL";
   }

}

