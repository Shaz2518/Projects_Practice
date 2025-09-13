package bankAccountApp;

public class SavingsAccount extends Accounts{
		//List properties specific to a Savings account
		private int securityDepositBoxID;
		private int securityDepositBoxKey;
	
		//Construct to inititialize savings properties
		public SavingsAccount(String name,String sSN, double initDeposit) {
			super(name, sSN, initDeposit);
			accountNumber = "1" + accountNumber;
			setSafetyBox();
			
			
		}
		
		@Override
		public void setRate() {
			rate = setBaseRate() - 0.25;
			
		}

		private void setSafetyBox() {
			securityDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
			securityDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
			
		}
		
		//List any methods specific to savings account
		public void showInfo()
		{
			super.showInfo();
			System.out.println("Savings Account Features: " 
					+ "\nSecurity Deposite Box ID: " + securityDepositBoxID
					+ "\nSecurity Deposit Box Key: " + securityDepositBoxKey);
			
		}

		
}
