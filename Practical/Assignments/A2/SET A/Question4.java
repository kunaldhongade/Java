import java.io.*;
import java.util.*;

class student {
	int rno;
	String name;
	float percent;
	static int c = 0;

	student() {
		rno = 0;
		name = "X.Y.Z.";
		percent = 35.00f;
		c++;
	}

	student(int r, String n, float per) {
		rno = r;
		name = n;
		percent = per;
		c++;
	}

	void display() {
		System.out.println(rno + " " + name + " " + percent);
	}
}

public class Question4 {
	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student(1, "Yesh", 85.14f);
		student s3 = new student(2, "Riya", 86.54f);
		student s4 = new student(3, "Raj", 82.20f);
		student s5 = new student(4, "John", 82.01f);

		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		System.out.println(s5.c);
	}
}