import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class MyDate {
	int day, month, year;
	Scanner sc = new Scanner(System.in);
	Date d;
	String date;
	SimpleDateFormat df;

	public void accept() {
		// System.out.print("Enter date in formOf(DD-MM-YYYY): ");

		System.out.print("Enter Day: ");
		day = sc.nextInt();

		System.out.print("Enter Month: ");
		month = sc.nextInt();

		System.out.print("Enter Year: ");
		year = sc.nextInt();

		// date=day+"-"+month+"-"+year;
		date = day + "/" + month + "/" + year;
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			d = df.parse(date);
		} catch (Exception e) {
			System.out.println("InvalidDateFormat.");
			System.exit(0);
		}
	}

	public void display() {
		System.out.println(" Date format is : dd/MM/yyyy.\n Date is :" + df.format(d));

	}
}

public class Question2 {
	public static void main(String[] arg) {
		MyDate m = new MyDate();
		m.accept();
		m.display();
	}
}