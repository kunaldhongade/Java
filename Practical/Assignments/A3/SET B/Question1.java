import java.io.*;
import java.util.*;

abstract class staff {
	String name, address;

	abstract void accept();

	abstract void display();
}

class FullTime extends staff {
	String department;
	float sal;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name of Staff Member : ");
		name = sc.next() + sc.nextLine();

		System.out.print("Enter Department of Staff Member : ");
		department = sc.next() + sc.nextLine();

		System.out.print("Enter Address of Staff Member : ");
		address = sc.next() + sc.nextLine();

		System.out.print("Enter Salary : ");
		sal = sc.nextFloat();

	}

	void display() {
		System.out.printf("%20s %20s %20s %10s %20s\n", name, address, department, sal, "Full Time Staff");
	}
}

class PartTime extends staff {
	String department;
	float hours;

	float sal;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name of Staff Member : ");
		name = sc.next() + sc.nextLine();

		System.out.print("Enter Department of Staff Member : ");
		department = sc.next() + sc.nextLine();

		System.out.print("Enter Address of Staff Member : ");
		address = sc.next() + sc.nextLine();

		System.out.print("Enter Number of Working Hours  : ");
		hours = sc.nextFloat();

		System.out.print("Enter Rate per Hour  : ");
		sal = sc.nextFloat();

	}

	void display() {
		System.out.printf("%20s %20s %20s %10s %10s %20s\n", name, address, department, hours, sal, "Part Time Staff");
	}
}

public class Question1 {
	static int i = 0;
	static int j = 0;

	public static void main(String[] arg) {
		int x, n;

		Scanner sc = new Scanner(System.in);
		FullTime f[] = new FullTime[10];
		PartTime p[] = new PartTime[10];
		while (true) {
			System.out.println(
					"\n\n1.FullTime Staff Member \n2.PartTime Staff Member\n3.Display FullTime Staff info.\n4.Display PartTime Staff info.\n5.Exit");
			System.out.print("Enter your choise : ");
			x = sc.nextInt();
			switch (x) {
				case 1:
					if (i < 11) {
						f[i] = new FullTime();

						f[i].accept();
						i++;
					} else {
						System.out.println("Maximum size reach.");
					}
					break;
				case 2:
					if (j < 11) {
						p[j] = new PartTime();
						p[j].accept();
						j++;
					} else {
						System.out.println("Maximum size reach.");
					}
					break;
				case 3:
					System.out.println("FullTime Staff Info. : ");
					System.out.printf("%20s %20s %20s %10s %20s\n", "Name", "Address", "Department", "Salary",
							"Full Time Staff");
					for (int a = 0; a < i; a++) {
						f[a].display();
					}
					break;
				case 4:
					System.out.println("\nPartTime Staff Info. :\n");
					System.out.printf("%20s %20s %20s %10s %10s %20s\n", "Name", "Address", "Department", "Hours",
							"Rate per Hour", "Part Time Staff");
					for (int a = 0; a < i; a++) {
						p[a].display();
					}
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input.\n");
			}

		}

	}
}
