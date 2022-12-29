package Series;

public class series {
	public boolean isPrime(int a) {
		int x = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				x = 1;
				break;
			}
		}
		if (x == 1) {
			System.out.println("Number " + a + " is not a Prime Number.\n\n");
			return false;
		} else {
			System.out.println("Number " + a + " is a Prime Number.\n\n");
			return true;
		}
	}

	public void fibo_series(int n) {
		int a = 0, b = 1, c = 0;
		System.out.print("Fibonacci Series upto " + n + " digits :" + a + " " + b + " ");
		for (int i = 0; i < n - 2; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public float Math_Square(float x) {
		System.out.println("\n\nSquare of " + x + " is : " + x * x);
		return x * x;
	}
}
