package bankAccountApp;

public class CheckingAccount extends Accounts {
	
	//List properties specific to a checking account
	long debitCardNumber;
	int debitCardPIN;
	
	
	//Construct to inititialize checking account properties
	public CheckingAccount(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "2" + accountNumber;
		
		setDebitCard();
		
		
		
	}
	@Override
	public void setRate() {
		rate = setBaseRate() * 0.15;
		
	}
	//Set Debit Card for checking
	private void setDebitCard()
	{
		debitCardNumber = (long)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	
	//List any methods specific to checking account
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Checking Account Features: " 
				+ "\nDebit Card Number " + debitCardNumber
				+ "\nDebit Card PIN " + debitCardPIN);
	}

	
	

}
