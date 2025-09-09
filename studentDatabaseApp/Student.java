package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private String studentID;
	private int courseFees = 600;
	private int balanceFees;
	public static int id = 1000;

	// Constructor for Students name and Year
	public Student() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = scr.nextLine();

		System.out.println("Enter student last name");
		this.lastName = scr.nextLine();

		System.out.println("Enter student Grade Year: " + "\n1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior");
		this.gradeYear = scr.nextInt();

		setStudentID();
		scr.close();
	}

	// Create new Student ID
	public void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in course
	public void Enroll() {
		do {
			System.out.print("Enter course name to Enroll (Q to Quit): ");
			Scanner scr = new Scanner(System.in);
			String course = scr.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + " " + course;
				balanceFees = balanceFees + courseFees;
			} 
			else {
				break;
			}
			
		} while (1 != 0);
		
	}

	// Balance fees
	public void viewBalance() {
		System.out.println("Your balance is: $" + balanceFees);
	}

	// Pay tuition fees
		public void payFees() {
		viewBalance();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter fees to be Paid.");
		int payment = scr.nextInt();
		balanceFees = balanceFees - payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
		
	}

	// Show Status
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance Fees: $" + balanceFees;
	}

}
