import java.io.*;
import java.util.*;

class InvalidStudentNameException extends Exception {

	InvalidStudentNameException() {
		super("Student name Entered is Invalid.");
	}

}

class InvalidStudentAgeException extends Exception {

	InvalidStudentAgeException() {
		super("Student Age Entered is out of Range.");
	}
}

class student {
	String name, course;
	int rollno, age;

	student(int rollno, String name, int age, String course) {
		try {
			if (age <= 21 && age >= 15) {
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) == 32 || (name.charAt(i) >= 65 && name.charAt(i) <= 90)
							|| (name.charAt(i) >= 97 && name.charAt(i) <= 122)) {
						this.rollno = rollno;
						this.name = name;
						this.age = age;
						this.course = course;
					} else {
						throw new InvalidStudentNameException();
					}
				}
			} else {
				throw new InvalidStudentAgeException();
			}

		} catch (InvalidStudentNameException e) {
			System.out.println(e);
		} catch (InvalidStudentAgeException e) {
			System.out.println(e);
		}
	}

	public void accept(int rollno, String name, int age, String course) {
		try {
			if (age <= 21 && age >= 15) {
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) == 32 || (name.charAt(i) >= 65 && name.charAt(i) <= 90)
							|| (name.charAt(i) >= 97 && name.charAt(i) <= 122)) {
						this.rollno = rollno;
						this.name = name;
						this.age = age;
						this.course = course;
					} else {
						throw new InvalidStudentNameException();
					}
				}
			} else {
				throw new InvalidStudentAgeException();
			}

		} catch (InvalidStudentNameException e) {
			System.out.println(e);
		} catch (InvalidStudentAgeException e) {
			System.out.println(e);
		}
	}

	public void display() {
		if (this.name != null) {
			System.out.printf("%20s %20s %20s %20s \n", rollno, name, age, course);
		}
	}
}

public class Question1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int rollno, age;
		String name, course;
		System.out.println("Enter number of Students : ");
		int n = sc.nextInt();
		student s[] = new student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Entery No. : " + (1 + i));
			System.out.println("Enter Rollno. :");
			rollno = sc.nextInt();

			System.out.println("Enter Name :");
			name = sc.next() + sc.nextLine();

			System.out.println("Enter Age :");
			age = sc.nextInt();

			System.out.println("Enter Course :");
			course = sc.next() + sc.nextLine();

			s[i] = new student(rollno, name, age, course);
		}

		System.out.printf("%20s %20s %20s %20s \n", "Rollno", "Name", "Age", "Course");
		for (int i = 0; i < n; i++) {
			s[i].display();
		}

	}
}