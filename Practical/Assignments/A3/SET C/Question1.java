import java.io.*;
import java.util.*;

interface CreditCardInterface {
	void viewCreaditAmount();

	void useCard();

	void payCredit();

	void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface {
	String name;
	int cardNumber;
	double creditAmonut;
	double creditLimit;
	int cnt = 0;
	public static int check = 0;

	Scanner sc = new Scanner(System.in);

	public SilverCardCustomer() {
		name = "None.";
		cardNumber = 0;
		creditAmonut = 0;
		creditLimit = 50000;
	}

	public SilverCardCustomer(String n, int c) {
		name = n;
		cardNumber = c;
		creditAmonut = 0;
		creditLimit = 50000;
	}

	public void newEntrey() {
		System.out.print("Enter name of Customer : ");
		name = sc.next() + sc.nextLine();
		System.out.print("Enter Credit card NUmber : ");
		cardNumber = sc.nextInt();
	}

	public void viewCreaditAmount() {

		System.out.println("Your creditAmonut is : " + creditAmonut);
		check++;
	}

	public void payCredit() {
		System.out.print("ENter Amount to pay : ");
		double pay = sc.nextDouble();
		creditAmonut = creditAmonut + pay;
		System.out.println("Amount payed Sucessfuly");
	}

	public void useCard() {
		System.out.print("Enter Amount : ");
		double amount = sc.nextDouble();
		if (amount < creditAmonut) {
			if (amount > creditLimit) {
				creditAmonut = creditAmonut - amount;
				System.out.println("Transaction Sucessfuly. \n Current Balance(CreditAmount) : " + creditAmonut);
			} else {
				System.out.println("\n Can't transfer more than 50,000 at a time.");
			}
		} else {
			System.out.println("Unsuficient Balance.");
		}
	}

	public void increaseLimit() {
		if (cnt < 3) {
			System.out.println("Enter Amount : ");
			double amt = sc.nextDouble();
			if (amt <= 2500) {
				creditLimit = creditLimit + amt;
				System.out.println("Credit Limit Increased Sucessfuly by " + amt + ".");
				cnt++;
			} else {
				System.out.println("Credit Limit can increase by maximum  5000 at a time.");
			}
		} else {
			System.out.println("Can't increase Credit Limit, 3 chancess already used. ");
		}
	}
}

class GoldCardCustomers extends SilverCardCustomer {
	int n = 0;

	public GoldCardCustomers() {
		name = "None.";
		cardNumber = 0;
		creditAmonut = 0;
		creditLimit = 50000;
	}

	public GoldCardCustomers(String n, int c) {
		name = n;
		cardNumber = c;
		creditAmonut = 0;
		creditLimit = 50000;
	}

	public void useCard() {
		System.out.print("Enter Amount : ");
		double amount = sc.nextDouble();
		if (amount < creditAmonut) {
			if (amount > creditLimit) {
				creditAmonut = creditAmonut - amount;
				System.out.println("Transaction Sucessfuly. \n Current Balance(CreditAmount) : " + creditAmonut);
			} else {
				System.out.println("\n Can't transfer more than 1,00,000 at a time.");
			}
		} else {
			System.out.println("Unsuficient Balance.");
		}
	}

	public void increaseLimit() {
		if (n < 3) {
			System.out.println("Enter Amount : ");
			double amt = sc.nextDouble();
			if (amt <= 5000) {
				creditLimit = creditLimit + amt;
				System.out.println("Credit Limit Increased Sucessfuly by " + amt + ".");
				n++;
			} else {
				System.out.println("Credit Limit can increase by maximum  5000 at a time.");
			}
		} else {
			System.out.println("Can't increase Credit Limit, 3 chancess already used. ");
		}
	}
}

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int n, i = 0, j = 0, x1 = 0;
		int cardNo;
		SilverCardCustomer scc[] = new SilverCardCustomer[20];
		GoldCardCustomers gcc[] = new GoldCardCustomers[20];
		scc[i] = new SilverCardCustomer();
		i++;
		scc[i] = new SilverCardCustomer("Y.Z.", 10001);
		i++;
		gcc[j] = new GoldCardCustomers();
		j++;
		gcc[j] = new GoldCardCustomers("A.B.", 10002);
		j++;

		aa: while (true) {
			System.out.print("1.Silver Card.\n2.Gold Card\n3.Exit.\nEnter Your Choise :");
			n = sc.nextInt();

			switch (n) {
				case 1:
					bb: while (true) {
						System.out.print(
								"\n\n 1.New Entry.\n2.View Creadit Amount.\n3.Pay Credit\n4.Use Card\n5.Increase Limit.\n6.Exit.\n Enter Your Choise :");
						n = sc.nextInt();
						switch (n) {
							case 1:
								scc[i] = new SilverCardCustomer();
								scc[i].newEntrey();
								break;

							case 2:
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < i; x++) {
									if (scc[x].cardNumber == cardNo) {
										scc[x].viewCreaditAmount();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 3:
								x1 = 0;
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < i; x++) {
									if (scc[x].cardNumber == cardNo) {
										scc[x].payCredit();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 4:
								x1 = 0;
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < i; x++) {
									if (scc[x].cardNumber == cardNo) {
										scc[x].useCard();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 5:
								x1 = 0;
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < i; x++) {
									if (scc[x].cardNumber == cardNo) {
										scc[x].increaseLimit();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 6:
								break bb;

							default:
								System.out.println("Invalid Input.");

						}
					}

					break;
				case 2:
					cc: while (true) {
						System.out.print(
								"\n\n 1.New Entry.\n2.View Creadit Amount.\n3.Pay Credit\n4.Use Card\n5.Increase Limit.\n6.Exit.\n Enter Your Choise :");
						n = sc.nextInt();
						switch (n) {
							case 1:
								gcc[j] = new GoldCardCustomers();
								gcc[j].newEntrey();
								break;

							case 2:
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < j; x++) {
									if (gcc[x].cardNumber == cardNo) {
										gcc[x].viewCreaditAmount();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 3:
								x1 = 0;
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < j; x++) {
									if (gcc[x].cardNumber == cardNo) {
										gcc[x].payCredit();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 4:
								x1 = 0;
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < j; x++) {
									if (gcc[x].cardNumber == cardNo) {
										gcc[x].useCard();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 5:
								x1 = 0;
								System.out.print("\n Enter card number : ");
								cardNo = sc.nextInt();
								for (int x = 0; x < j; x++) {
									if (gcc[x].cardNumber == cardNo) {
										gcc[x].increaseLimit();
										x1++;
									}
								}
								if (x1 == 0) {
									System.out.println("Invalid Card Number.");
								}
								break;

							case 6:
								break cc;

							default:
								System.out.println("Invalid Input.");

						}
					}

					break;
				case 3:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Input!");
			}
		}
	}
}