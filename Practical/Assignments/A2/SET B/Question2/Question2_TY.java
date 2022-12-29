package TY;

import java.io.*;
import java.util.Scanner;

public class Question2_TY {
	public int theory, practical;

	public void get() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Marks of Theory (out of 400) : ");
		this.theory = s.nextInt();

		System.out.print("\nEnter Marks of Practical (out of 200) : ");
		this.practical = s.nextInt();

	}
}