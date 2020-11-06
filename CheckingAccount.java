package jFotso_Lab9;

public class CheckingAccount extends BankAccount
{
	
	//task 1#
	
	//Static constant fee
	final static double FEE = .15;
	

	
	//checking acount constructor
	public CheckingAccount(String name, double intialAmount)
	{
		//superclass constructor
		super(name, intialAmount);
		
		super.setAccountNumber(super.getAccountNumber().concat("-10"));
		
	}
	//return 
	public boolean withdraw(double amount)
	{
		double totalWithdraw = amount + FEE;
		//call withdraw superclass
		return super.withdraw(totalWithdraw);
	}

}
