import java.io.*;
import java.util.*;

class InsufficientFundException extends Exception {
	InsufficientFundException() {
		super("Insufficient Balance. ");
	}
}

class InvalidAmountException extends Exception {
	InvalidAmountException() {
		super("Invalid Amount. ");
	}
}

class account {
	int acno;
	String name;
	float balance;
	static int n = 0;
	float amt;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.print("Enter Name of Account holder :");
		name = sc.next() + sc.nextLine();
		acno = 1000 + n;
		n++;
		System.out.print("Enter Minimum balance to start must be 500");
		balance = 500;
	}

	public void withdraw() {
		try {
			System.out.print("Enter Amount to withdraw :");
			amt = sc.nextFloat();
			if (amt > balance) {
				throw new InsufficientFundException();
			} else {
				balance = balance - amt;
				System.out.println("Amount withdraw Sucessfully. \n Last Balance :" + (balance + amt)
						+ ".\nAmount Withdrawed :" + amt + ".\nAvailable Balance :" + balance);
			}
		} catch (InsufficientFundException e) {
			System.out.println(e);
		}
	}

	public void deposit() {
		try {
			System.out.println("Enter Amount to deposit :");
			amt = sc.nextFloat();
			if (amt > 0) {
				balance = balance + amt;
				System.out.println("Amount withdraw Sucessfully. \n Last Balance :" + (balance - amt)
						+ ".\nAmount deposited :" + amt + ".\nCurrent Balance :" + balance);
			} else {
				throw new InvalidAmountException();
			}
		} catch (InvalidAmountException e) {
			System.out.println(e);
		}
	}

	public void viewBalance() {
		System.out.println("Balance is :" + balance);
	}
}

public class Question2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		account c = new account();
		c.accept();

		while (true) {
			System.out.print("1.Withdraw.\n2.deposit.\n3.View Balance.\n4.Exit.\nEnter Your choise: ");
			int n = sc.nextInt();
			switch (n) {
				case 1:
					c.withdraw();
					break;

				case 2:
					c.deposit();
					break;
				case 3:
					c.viewBalance();
					break;
				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Input.");
			}
		}
	}
}