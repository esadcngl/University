public class CreditCard {
    String type;
    double balance;
    Customer owner;
   public CreditCard(String type, double balance ){
       this.type= type;
       this.balance=balance;
   }
   public CreditCard(String type, double balance, Customer owner ){
       this.type = type;
       this.balance = balance;
       this.owner = owner;
       owner.setCc(this);
   }



}
