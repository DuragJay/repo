package jFotso_Lab9;

public class SavingsAccount extends BankAccount
{
	//task2
	
	final static double rate = .025;
	
	private int savingsNumber = 0;
	
	private String AccountNumber = super.getAccountNumber();
	
	public SavingsAccount(String name, double intialAmount)
	{
		super(name, intialAmount);
		
		AccountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
		
		
	}
	
	public void postInterest()
	{
		//divide rate by year and multiply by balance amount and add to current balance
		double oneMonthInterest = .025/12 * super.getBalance() + super.getBalance();
		//set the balance 
		super.setBalance(oneMonthInterest);
	}
	
	public String getAccountNumber()
	{
		return AccountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double initalBalance)
	{
		//Initialize constructor
		super(oldAccount, initalBalance);
		// add number to change saving account number
		this.savingsNumber = oldAccount.getSavingsNumber() + 1;
		
		AccountNumber = super.getAccountNumber() + "-" + savingsNumber;
		 
	}

	public int getSavingsNumber() 
	{
		//mutator class
		return savingsNumber;
		
	}
}
