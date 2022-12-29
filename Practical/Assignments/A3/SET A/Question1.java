import java.io.*;
import java.util.*;

class Employye {
	private int id, sal;
	private String name, depart;
	int total;

	Employye() {
		id = 000;
		name = "Demo.";
		depart = "None.";
		sal = 20000;
		total = sal;
	}

	Employye(int id, String name, String depart, int sal) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.sal = sal;
		this.total = sal;

	}

	void accept() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Id :");
		id = scan.nextInt();
		System.out.println("Enter Name :");
		name = scan.next() + scan.nextLine();
		System.out.println("Enter Department :");
		depart = scan.next() + scan.nextLine();
		System.out.println("Enter Salary :");
		sal = scan.nextInt();
		this.total = sal;

	}

	void display() {
		System.out.printf("%10s %30s %20s %20s ", id, name, depart, sal);
	}

}

class Manager extends Employye {
	private int bonus;
	static int n = 0;

	Manager() {
		super();
		bonus = 0;
	}

	Manager(int id, String name, String depart, int sal, int bonus) {
		super(id, name, depart, sal);
		this.bonus = bonus;
		super.total = super.total + bonus;
		if (n < super.total) {
			n = super.total;
		}
	}

	void accept() {
		Scanner s1 = new Scanner(System.in);
		super.accept();
		System.out.println("Enter bonus :");
		this.bonus = s1.nextInt();
		super.total = super.total + bonus;
		if (n < super.total) {
			n = super.total;
		}
	}

	void display() {
		super.display();
		System.out.printf("%20s %20s \n", bonus, super.total);

	}

	void check() {
		if (n == super.total) {
			super.display();
			System.out.printf("%20s %20s \n", bonus, super.total);
		}

	}
}

public class Question1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number of Employyes : ");
		int n = 2 + s.nextInt();
		Manager m[] = new Manager[n];
		m[0] = new Manager();
		m[1] = new Manager(101, "A.B.C.", "I.T.", 100000, 11111);
		for (int i = 2; i < m.length; i++) {
			m[i] = new Manager();
			m[i].accept();
		}
		System.out.printf("%10s %30s %20s %20s %20s %20s \n", "Id", "Name", "Department", "Salary", "Bonus",
				"Total Salary");
		for (int i = 0; i < m.length; i++) {
			m[i].display();
		}
		System.out.println("Manager of Maximum salary is : ");
		for (int i = 0; i < m.length; i++) {
			m[i].check();
		}
	}
}