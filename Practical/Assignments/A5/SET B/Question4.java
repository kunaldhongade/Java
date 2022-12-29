import java.io.*;
import java.util.*;

public class Question4 {
	public static void main(String[] arg) {
		int a, b;
		float c;
		try {
			if (arg.length == 3) {
				char ch = arg[2].charAt(0);
				switch (ch) {
					case '+':
						a = Integer.parseInt(arg[0]);
						b = Integer.parseInt(arg[1]);

						c = a + b;
						if (c < 0) {
							throw new Exception("NegativeResultException.");
						} else {
							System.out.println(a + "+" + b + "=" + (a + b));
						}
						break;

					case '-':
						a = Integer.parseInt(arg[0]);
						b = Integer.parseInt(arg[1]);

						c = a - b;
						if (c < 0) {
							throw new Exception("NegativeResultException.");
						} else {
							System.out.println(a + "-" + b + "=" + (a - b));
						}
						break;

					case '*':
						a = Integer.parseInt(arg[0]);
						b = Integer.parseInt(arg[1]);

						c = a * b;
						if (c < 0) {
							throw new Exception("NegativeResultException.");
						} else {
							System.out.println(a + "*" + b + "=" + (a * b));
						}
						break;

					case '/':
						a = Integer.parseInt(arg[0]);
						b = Integer.parseInt(arg[1]);

						c = a / b;
						if (c < 0) {
							throw new Exception("NegativeResultException.");
						} else {
							System.out.println(a + "/" + b + "=" + (a / b));
						}
						break;

					case '%':
						a = Integer.parseInt(arg[0]);
						b = Integer.parseInt(arg[1]);

						c = a % b;
						if (c < 0) {
							throw new Exception("NegativeResultException.");
						} else {
							System.out.println(a + "%" + b + "=" + (a % b));
						}
						break;

					default:
						throw new Exception("InvalidOperatorException.");
				}

			} else {
				throw new Exception("IllegalNumberOfArgument.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
