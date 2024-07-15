package studentdatabaseapp;

import java.util.Scanner;

public class Student 
{		private String firstName;
		private String lastName;
		private int gradeYear;
		private String studentID;
		private String courses = "";
		private int tuitionBalance = 0;
		private static int costOfCourse = 600;
		private static int id = 1000;
		

		// Constructor: prompting user to enter student's name and year......

		public Student() 
		{

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter first name: ");
			this.firstName = sc.nextLine();
			
			System.out.print("Enter last name: ");
			this.lastName = sc.nextLine();
			
			System.out.print("1 Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Sudent class level: ");
			this.gradeYear = sc.nextInt();
			
			setStudentID();
			
		}
		//Generating ID which is having five digits-> grade year+id
		private void setStudentID() {
			id++;
			this.studentID = gradeYear +"" + id;
		}
		
		//Enrollment into the course
		public void enroll() {
			
			do
			{
				System.out.print("Enter course to enroll (Q to quit): ");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if (!course.equals("Q")) 	 {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
				}
				else
				{
					break;
				}
			}	
			while(1 !=0);
			
			}
		
		public void viewBalance() {
			System.out.println("Your balance is: $" + tuitionBalance);
			}

		public void payTuition() {
			viewBalance();
			System.out.println("Enter your payment: $");
			Scanner sc = new Scanner(System.in);
			int payment = sc.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of $" + payment);
			viewBalance();
			}
		// Show status

		public String toString() {

		return "name: " + firstName +" "+ lastName +
				"\nGrade level: "  + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;

		}
		
}
