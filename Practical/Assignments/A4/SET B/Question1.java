import java.util.*;
import java.io.*;

public class Question1 {
	public static void main(String[] arg) {
		LinkedList l = new LinkedList();
		l.add("Red");
		l.add("Blue");
		l.add("Yellow");
		l.add("Orange");
		System.out.println("Elements of LinkedList : ");
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println("\n\n\n\nLinkedList in Reverse Order : ");
		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			li.next();

		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("\n\n\n\nAfter adding Pink and Green between Blue and Yellow :");

		LinkedList a = new LinkedList();
		a.add("Pink");
		a.add("Green");
		l.addAll(2, a);
		ListIterator lli = l.listIterator();
		while (lli.hasNext()) {
			System.out.println(lli.next());
		}
	}
}