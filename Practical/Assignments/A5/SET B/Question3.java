import java.io.*;
import java.util.*;

class criketPlayer {
	String name;
	String tname;
	int notOut, inings, totalRuns;
	int tnotOut, tinings, ttotalRuns;
	float avg;
	float tavg;
	Scanner sc = new Scanner(System.in);

	public void accept(String name, int notOut, int inings, int totalRuns) {
		this.name = name;
		this.notOut = notOut;
		this.inings = inings;
		this.totalRuns = totalRuns;
	}

	public void average() {

		this.avg = (float) totalRuns / (inings - notOut);

	}

	void sortPlayers(criketPlayer[] objs, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (objs[i].avg > objs[j].avg) {
					tname = objs[i].name;
					objs[i].name = objs[j].name;
					objs[j].name = tname;

					tnotOut = objs[i].notOut;
					objs[i].notOut = objs[j].notOut;
					objs[j].notOut = tnotOut;

					tinings = objs[i].inings;
					objs[i].inings = objs[j].inings;
					objs[j].inings = tinings;

					ttotalRuns = objs[i].totalRuns;
					objs[i].totalRuns = objs[j].totalRuns;
					objs[j].totalRuns = ttotalRuns;

					tavg = objs[i].avg;
					objs[i].avg = objs[j].avg;
					objs[j].avg = tavg;
				}
			}
		}
		System.out.printf("\n%20s %20s %20s %20s %20s \n", "name", "notOut", "inings", "totalRuns", "avg");
		for (int i = 0; i < n; i++) {
			System.out.printf("\n%20s %20s %20s %20s %20s \n", objs[i].name, objs[i].notOut, objs[i].inings,
					objs[i].totalRuns, objs[i].avg);
		}
	}
}

public class Question3 {
	public static void main(String[] arg) {
		String name;
		int inings, notOut, totalRuns, n;
		Scanner sc = new Scanner(System.in);
		criketPlayer c[] = new criketPlayer[5];

		System.out.print("ENter number of Enteries(Players.) :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			c[i] = new criketPlayer();

			System.out.print("Enter Players Name :");
			name = sc.next() + sc.nextLine();
			System.out.print("Enter Total Number of inings Played :");
			inings = sc.nextInt();
			System.out.print("Enter Total Number of inings NotOut :");
			notOut = sc.nextInt();
			System.out.print("Enter Total Runs Scored :");
			totalRuns = sc.nextInt();

			try {
				if (inings <= notOut) {
					i--;
					throw new Exception("Invalid DATA Entries.");
				} else {
					c[i].accept(name, notOut, inings, totalRuns);
					c[i].average();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		c[0].sortPlayers(c, n);

	}
}