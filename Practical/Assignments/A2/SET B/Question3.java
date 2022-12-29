import java.io.*;
import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		String full_name, t;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name in form of First_Name Middle_Name Last_Name.");
		full_name = s.nextLine();
		String[] partOfName = full_name.split(" ");
		if (partOfName.length == 3) {

			// System.out.println(partOfName[0]);f
			// System.out.println(partOfName[1]);m
			// System.out.println(partOfName[2]);l

			System.out.print(partOfName[2].substring(0, 1).toUpperCase() + partOfName[2].substring(1) + " ");
			System.out.print(partOfName[0].substring(0, 1).toUpperCase() + partOfName[0].substring(1) + " ");
			System.out.print(partOfName[1].substring(0, 1).toUpperCase() + partOfName[1].substring(1));

		} else {
			System.out.println("Invalid Format.");
		}

	}
}