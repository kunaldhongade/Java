import game.indoor;
import game.outdoor;
import java.io.*;
import java.util.*;

public class Question4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id;
		String n, n1;
		indoor in[] = new indoor[3];
		outdoor on[] = new outdoor[3];
		in[0] = new indoor();
		in[0].inDoor();
		System.out.println("For indoor players : ");

		for (int i = 1; i < in.length; i++) {
			System.out.print("\nEnter id : ");
			id = s.nextInt();
			System.out.print("\nEnter name : ");
			n1 = s.next();
			n = s.nextLine();
			n = n1 + n;
			in[i] = new indoor();
			in[i].inDoor(id, n);
		}

		on[0] = new outdoor();
		on[0].outDoor();
		System.out.println("For outdoor players : ");
		for (int i = 1; i < on.length; i++) {
			System.out.print("\nEnter id : ");
			id = s.nextInt();
			System.out.print("\nEnter name : ");
			n1 = s.next();
			n = s.nextLine();
			n = n1 + n;
			on[i] = new outdoor();
			on[i].outDoor(id, n);
		}

		for (int i = 0; i < in.length; i++) {
			in[i].display();
		}
		for (int i = 0; i < on.length; i++) {
			on[i].display();
		}
	}
}