package bankAccountApp;

public abstract class Accounts implements IBaseRate {

	// List common properties of savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;

	protected String accountNumber;
	protected double rate;

	// Constructor to set base properties and initialize the account
	protected Accounts(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;

		index++;

		this.accountNumber = setAccountNumber();
		setRate();

	}

	public abstract void setRate();

	// List common methods - transactions
	public void deposits(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
		printBalance();

	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount Withdraw: " + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Amount Transfer: " + amount);
		printBalance();

	}
	
	public void printBalance() {
		System.out.println("Account Balance is: $" + balance);
	}
	
	public void compound() {
		double interestCharged = balance * (rate/100);
		balance = balance + interestCharged;
		System.out.println("Interest Charged: $" + interestCharged );
		printBalance();
	}

	public String setAccountNumber() {
		String lastTwoDigitSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoDigitSSN + uniqueID + randomNumber;

	}

	public void showInfo() {
		System.out.println("=========ACCOUNT DETAILS=========" + "\nNAME: " + name + "\nACCOUNT NUMBER: "
				+ accountNumber + "\nACCOUNT BALANCE: " + balance + "\nRate: " + rate + "%");
	}

}
