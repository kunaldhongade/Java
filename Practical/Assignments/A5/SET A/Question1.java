import java.io.*;
import java.util.*;

public class Question1 {
	public static void main(String[] arg) {
		try {
			System.out.print("Enter Number To check is Prime or Not. : ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int x = 0;
			if (a >= 0) {
				if (a == 0) {
					throw new Exception("Number is Zero.");
				} else {
					for (int i = 2; i < a; i++) {
						if (a % i == 0) {
							x++;
						}
					}
					if (x == 0) {
						System.out.println("Entered Number " + a + " is Prime.");
					} else {
						System.out.println("Entered Number " + a + " is not Prime.");
					}

				}
			} else {
				throw new Exception("Number is Negative.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}