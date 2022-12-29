import java.io.*;
import java.util.*;

public class Question5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = 0;
		String str = s.nextLine();
		char ch = s.next().charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				c++;
			}
		}
		System.out.println("Character " + ch + " is present " + c + " times in String \"" + str + "\".");
	}
}
