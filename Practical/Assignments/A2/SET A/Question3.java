
import java.io.*;
import java.util.*;

class employee {
	int id;
	String name;
	float sal;
	static int n = 0;

	void insert(int a, String n, float s) {
		this.id = a;
		this.name = n;
		this.sal = s;
		if (n < sal) {
			n = sal;
		}
	}

	void display() {
		System.out.println(id + " " + name + " " + sal);
	}

	void check() {
		if (n == sal) {
			display();
		}
	}
}

public class Question3 {
	public static void main(String[] a) {
		float n = 0.00f;
		int id;
		String na, n1;
		float sa;
		employee e[] = new employee[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < e.length; i++) {
			e[i] = new employee();
			System.out.print("\nEnter id : ");
			id = s.nextInt();
			System.out.print("\nEnter Salary : ");
			sa = s.nextFloat();
			System.out.print("\nEnter Name : ");
			n1 = s.next();
			na = s.nextLine();
			na = n1 + na;
			e[i].insert(id, na, sa);
		}
		for (int i = 0; i < e.length; i++) {
			if (e[i].sal > n) {
				n = e[i].sal;
			}
		}
		for (int i = 0; i < e.length; i++) {
			if (e[i].sal == n) {
				e[i].display();
			}
		}
		for (int i = 0; i < e.length; i++) {
			e[i].check();
		}
	}
}
