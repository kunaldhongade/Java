import java.io.*;
import java.util.*;

class VowelException extends Exception {
	VowelException(char c) {
		super(c + " is A Vowel.");
	}
}

class BlankException extends Exception {
	BlankException(char c) {
		super(c + " is A Blank .");
	}
}

class ExitException extends Exception {
	ExitException(char c) {
		super(c + " is Variable(X).");
		System.exit(0);
	}
}

public class Question5 {
	public static void main(String[] arg) {
		// Scanner sc=new Scanner(System.in);
		// System.out.print("Enter variable:");
		// String ch=sc.next();
		String ch = arg[0];

		try {

			switch (ch.charAt(0)) {
				case 'a':
					throw new VowelException(ch.charAt(0));
				//// break;
				case 'e':
					throw new VowelException(ch.charAt(0));
				//// break;
				case 'i':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'o':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'u':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'A':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'E':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'I':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'O':
					throw new VowelException(ch.charAt(0));
				// break;
				case 'U':
					throw new VowelException(ch.charAt(0));
				// break;
				case ' ':
					throw new BlankException(ch.charAt(0));
				// break;
				case 'X':
					throw new ExitException(ch.charAt(0));
				// break;
				default:
					System.out.println("Valid Character.");
			}
		} catch (VowelException v) {
			System.out.println(v);
		} catch (BlankException b) {
			System.out.println(b);
		} catch (ExitException e) {
			System.out.println(e);
		} catch (Exception e) {

		}
	}
}