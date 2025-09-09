package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int emailBoxCapacity = 500;
	private String alternateEmail;
	private String password;
	private int defaultPasswordLength= 10;
	private String department;
	private String companySuffix = "xyzcompany.com";
	
	
	//Contructor to receive firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;  //this keyword refers to the class level variable
		this.lastName  = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//call a method to Display Department
		this.department = setDepartment();
		//System.out.println("Department Name: " + this.department);
		
		//Call a method to get random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		//Generate an email Address
		emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		//System.out.println("You Email Address is: " + emailAddress);
		
		
	}
	

	//Ask Department
		private String setDepartment() {
		System.out.println("New Employee: " + firstName + ". Department Code: \n1 for Sales \n2 for Developer \n3 for Accounting \n4 for None \nEnter the Deparment Code");
		Scanner scr = new Scanner(System.in);
		int deptCode = scr.nextInt();
		if(deptCode ==1) {return "Sales";}
		else if(deptCode ==2) {return "Dev";}
		else if(deptCode ==3) {return "Accounting";}
		else{return "None";}
		
		
	
		}
	
	
	//Generate Password with Random String
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#!@%";
			char[] password = new char[length];
			for(int i=0; i<length; i++)
			{
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);			
			}
			return new String(password);
		}
		
		//Set email Capacity
		public void setEmailboxCapacity(int capacity) {
			this.emailBoxCapacity = capacity;
		}
		//Set alternate email address
		public void setAlternatEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		
		//Change password  
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int getEmailboxCapacity() {return emailBoxCapacity;}
		public String getAlternateEmail() { return alternateEmail;}
		public String getPassword() { return password;}
		
		
		//Show all the detail, name, email and mailbox capacity
		public String showInfo() {
			return "Company Name: " + firstName + " " + lastName +
					"\nCompany Email: " + emailAddress +
					"\nEmail Box Capacity: " + emailBoxCapacity + "MB";
		}
		
}

		
		
	
	
	
	


