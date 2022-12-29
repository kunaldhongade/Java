import java.io.*;
import java.util.Scanner;

class MyNumber {
  private int num;

  MyNumber() {
    num = 0;
  }

  void insert(int n) {
    this.num = n;
    System.out.println("Value inserted Successfully.");
  }

  void isPositive() {
    if (this.num > 0) {
      System.out.println("Number " + num + " is Positive.");
    } else {
      System.out.println("Number " + num + " is not Positive.");
    }
  }

  void isNegative() {
    if (this.num < 0) {
      System.out.println("Number " + num + " is Negative.");
    } else {
      System.out.println("Number " + num + " is not Negative.");
    }
  }

  void isZero() {
    if (this.num == 0) {
      System.out.println("Number " + num + " is equal to Zero.");
    } else {
      System.out.println("Number " + num + " is not equal to Zero.");
    }
  }

  void isEven() {
    if (this.num % 2 == 0) {
      System.out.println("Number " + num + " is Even.");
    } else {
      System.out.println("Number " + num + " is not Even.");
    }
  }

  void isOdd() {
    if (this.num % 2 != 0) {
      System.out.println("Number " + num + " is Odd.");
    } else {
      System.out.println("Number " + num + " is not Odd.");
    }
  }
}

public class Question2 {

  public static void main(String[] args) {
    int a, n;
    MyNumber m = new MyNumber();
    System.out.println("\n\nInitials number is Zero.\n");
    for (int i = 0; i >= 0; i++) {
      System.out.println(
          "\n1.Insert\n2.isPositive.\n3.isNegative.\n4.isZero\n5.isEven.\ny6.isOdd.\n7.Exit.\n");
      System.out.print("Enter your choice : ");
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      switch (a) {
        case 1:
          System.out.print("Enter Number :");
          n = s.nextInt();
          System.out.println();
          m.insert(n);
          break;
        case 2:
          m.isPositive();
          break;
        case 3:
          m.isNegative();
          break;
        case 4:
          m.isZero();
          break;
        case 5:
          m.isEven();
          break;
        case 6:
          m.isOdd();
          break;
        case 7:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Input.");
      }
    }
  }
}
