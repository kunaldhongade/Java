import java.io.*;
import java.util.*;

public class Question2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Hashtable h = new Hashtable();
		String emp;
		float sal;
		int n;
		System.out.print("Enter number of employees : ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("\n Enter name of Employee :");
			emp = sc.next() + sc.nextLine();
			System.out.print("Enter Salary :");
			sal = sc.nextFloat();
			h.put(emp, sal);
		}
		Enumeration keys = h.keys();
		Enumeration values = h.elements();
		System.out.printf("%20s %20s\n", "Employee", "Salary");
		while (keys.hasMoreElements() && values.hasMoreElements()) {
			System.out.printf("%20s %20s\n", keys.nextElement(), values.nextElement());
		}

		System.out.print("Enter Employee Name to search : ");
		emp = sc.next() + sc.nextLine();
		Enumeration key = h.keys();
		Enumeration value = h.elements();
		while (key.hasMoreElements() && value.hasMoreElements()) {
			String str = (String) key.nextElement();
			sal = (float) value.nextElement();
			// System.out.println("ok"+emp+" "+key.nextElement());
			if (emp.equals(str)) {
				System.out.printf("%20s %20s\n", str, sal);
			}
		}
	}
}
