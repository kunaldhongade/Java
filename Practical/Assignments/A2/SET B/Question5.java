import java.io.*;
import java.util.Scanner;

class student {
	int rno, m1, m2;
	String name;
	result r = new result();

	class result {
		float per;
		int total;

		void get(int m1, int m2) {
			total = m1 + m2;
			per = (total / 2.0f);
		}

		void display() {
			System.out.printf("%20s %20s ", total, per);
		}
	}

	void get() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Roll no. :");
		rno = sc.nextInt();
		System.out.print("\nEnter Name :");
		name = sc.next() + sc.nextLine();
		System.out.print("\nEnter Marks of 1st Subject :");
		m1 = sc.nextInt();
		System.out.print("\nEnter Marks of 2nd Subject :");
		m2 = sc.nextInt();
		r.get(m1, m2);

	}

	void display() {
		System.out.printf("%10s %30s %30s %30s ", rno, name, m1, m2);
		r.display();
	}

}

public class Question5 {
	public static void main(String[] args) {
		student stu = new student();
		stu.get();
		System.out.printf("%10s %30s %30s %30s %20s %20s \n", "Roll no.", "Name", "Marks of 1st Subject",
				"Marks of 2nd Subject", "Toatl Marks", "Percentage");
		stu.display();
	}
}