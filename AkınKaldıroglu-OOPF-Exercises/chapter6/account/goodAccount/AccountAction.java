package exercises.chapter6.account.goodAccount;


import exercises.chapter6.account.ex.InsufficentBalanceException;

public interface AccountAction {
	
	public double act(double balance, double amount) throws InsufficentBalanceException;

}
