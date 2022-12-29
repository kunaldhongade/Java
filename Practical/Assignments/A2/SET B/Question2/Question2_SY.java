package SY;

import java.io.*;
import java.util.Scanner;

public class Question2_SY {
	public int com, math, elec;

	public void get() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Marks of Computer Science (out of 200) : ");
		this.com = s.nextInt();

		System.out.print("\nEnter Marks of Maths (out of 200) : ");
		this.math = s.nextInt();

		System.out.print("\nEnter Marks of Electronics (out of 200) : ");
		this.elec = s.nextInt();
	}
}