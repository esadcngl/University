package exercises.chapter6.account.goodAccount;



import exercises.chapter6.account.ex.InsufficentBalanceException;
import exercises.chapter6.account.ex.NegativeAmountException;

import java.util.logging.Logger;

public class Account {
	private int id;
	private double balance;
	private Logger log;

	public void changeBalance(AccountAction action, double amount)
			throws InsufficentBalanceException, NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException(amount);

		balance = action.act(balance, amount);

		log.info(action + " : " + amount + " for account id: " + id);
	}
}
