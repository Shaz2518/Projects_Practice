package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		// Enter n number of students
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int numOfStudents = scr.nextInt();

		Student[] students = new Student[numOfStudents];

		// Create how many students we want to add
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payFees();

		}
		for (int i = 0; i < numOfStudents; i++) {
			String stud_Details = students[i].toString();
			System.out.println("===========STUDENT DETAILS==========");
			System.out.println(stud_Details);
		}

	}

}
