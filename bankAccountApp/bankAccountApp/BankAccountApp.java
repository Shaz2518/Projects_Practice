package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Accounts> accounts = new LinkedList<Accounts>();
		// CheckingAccount chkAcc1 = new CheckingAccount("John Wills", "123456789",
		// 1500);

		// SavingsAccount saveAcc1 = new SavingsAccount("Brain Smith", "987654321",
		// 5000);

		// chkAcc1.showInfo();
		// saveAcc1.showInfo();

		// Savings methods
//		saveAcc1.deposits(4000);
//		saveAcc1.withdraw(300);
//		saveAcc1.transfer("Food", 500);

		// saveAcc1.compound();
		// Read s CSV File then create new accounts based on that data
		String file = "C:\\Users\\localadminuser\\Documents\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);

		for (String[] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);

			

			if (accountType.equals("Savings")) {
				accounts.add(new SavingsAccount(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {

				accounts.add(new CheckingAccount(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT");
			}
			
			for(Accounts acc : accounts)
			{
				acc.showInfo();
			}

		}

	}

}
