import java.io.*;
import java.util.*;

class Employye {
	int id, sal;
	String name, depart;
	Manager m = new Manager();

	Employye() {
		id = 000;
		name = "Demo.";
		depart = "None.";
		sal = 20000;
	}

	Employye(int id, String name, String depart, int sal, int bonus) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.sal = sal;
		m.accept(bonus);
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
		System.out.println("Enter bonus :");
		m.accept(scan.nextInt());

	}

	void display() {
		System.out.printf("%10s %30s %20s %20s ", id, name, depart, sal);
		m.display(sal);
	}

	class Manager {
		int bonus;

		Manager() {
			bonus = 0;
		}

		void accept(int bonus) {
			this.bonus = bonus;
		}

		void display(int sal) {
			System.out.printf("%20s %20s \n", bonus, bonus + sal);
		}
	}

}

public class Question1 {
	public static void main(String[] args) {
		// emp[i].accept(101,"Kolte Shreeganesh","project1",200000,30000);
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number of Employyes : ");
		int n = 2 + s.nextInt();
		Employye emp[] = new Employye[n];
		emp[0] = new Employye();
		emp[1] = new Employye(101, "A.B.C.", "I.T.", 100000, 11111);
		for (int i = 2; i < emp.length; i++) {
			emp[i] = new Employye();
			emp[i].accept();
		}
		System.out.printf("%10s %30s %20s %20s %20s %20s \n", "Id", "Name", "Department", "Salary", "Bonus",
				"Total Salary");
		for (int i = 0; i < emp.length; i++) {
			emp[i].display();
		}
	}
}