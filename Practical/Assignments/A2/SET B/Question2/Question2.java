import SY.Question2_SY;
import TY.Question2_TY;
import java.io.*;
import java.util.Scanner;

class Total {
	int id, tsy, tty, com, elec, math, th, prac;
	String name, grade;
	float per;

	void insert(int id, String name, int com, int math, int elec, int th, int prac) {
		this.id = id;
		this.name = name;
		this.com = com;
		this.math = math;
		this.elec = elec;
		this.th = th;
		this.prac = prac;
	}

	void cal() {
		tsy = com + math + elec;
		tty = th + prac;
		per = ((tsy + tty) / 1200) * 100;
		if (per >= 70.00f) {
			grade = "Grade : A";
		} else if (per >= 60.00f) {
			grade = "Grade : B";
		} else if (per >= 50.00f) {
			grade = "Grade : C";
		} else if (per >= 40.00f) {
			grade = "Grade : D";
		} else {
			grade = "Grade : FAIL.";
		}
	}

	void display() {
		System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %20s ", id, name, com, math, elec, th,
				prac, tsy, tty, tsy + tty, per, grade);
		System.out.println();
	}

}

public class Question2 {
	public static void main(String[] args) {
		Question2_SY sy[] = new Question2_SY[2];
		Question2_TY ty[] = new Question2_TY[2];
		Scanner s = new Scanner(System.in);
		int id;
		String name, n;
		Total t[] = new Total[2];
		for (int i = 0; i < sy.length; i++) {
			sy[i] = new Question2_SY();
			ty[i] = new Question2_TY();
			t[i] = new Total();
			sy[i].get();
			ty[i].get();
			id = s.nextInt();
			n = s.next();
			name = s.nextLine();
			name = n + name;
			t[i].insert(id, name, sy[i].com, sy[i].math, sy[i].elec, ty[i].theory, ty[i].practical);
			t[i].cal();
		}
		System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %20s %20s  ", "ID", "NAME", "COMPUTER(SY)",
				"MATH(SY)", "ELECRONIC(SY)", "THEORY(TY)", "PRACTICAL(TY)", "TOTAL(SY)", "TOTAL(TY)", "TOTAL",
				"PERCENTAGE", "GRADE");
		System.out.println();
		for (int i = 0; i < t.length; i++) {
			t[i].display();
		}
	}
}