import java.io.*;
import java.util.*;

public class Question4 {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee name:");
		String Emp = sc.nextLine();
		try {
			int j = 0;
			int i;
			for (i = 0; i < Emp.length(); i++) {
				if (Emp.charAt(i) == 32 || (Emp.charAt(i) >= 65 && Emp.charAt(i) <= 90)
						|| (Emp.charAt(i) >= 97 && Emp.charAt(i) <= 122)) {
					j++;
				} else {
					throw new InvalidEmpNameException();
				}
			}

			if (i == j) {
				System.out.println("Entered Employee Name is : " + Emp);
			}
		} catch (InvalidEmpNameException e) {
			System.out.println("Name is Invalid");
		}

	}
}