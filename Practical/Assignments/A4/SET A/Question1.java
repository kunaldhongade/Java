import java.io.*;
import java.util.*;

public class Question1 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		TreeSet ts = new TreeSet();
		int n, a;
		System.out.print("Enter number of elements you want to enter :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter number : ");
			a = sc.nextInt();
			ts.add(a);
		}
		System.out.println("Elements of collection are : " + ts);

		System.out.print("\nEnter number to search in collection :");
		a = sc.nextInt();
		if (ts.contains(a)) {
			System.out.println("Elements is present in collection. ");
		} else {
			System.out.println("Elements is not present in collection. ");
		}
	}

}