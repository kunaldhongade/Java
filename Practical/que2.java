/*
  Write a menu driven program to perform the following operations
      i.Calculate the volume of cylinder. (hint : Volume: π × r² × h)
      ii.Find the factorial of given number.
      iii.Check the number is Armstrong or not.
      iv.Exit
 */

import java.io.*;
import java.util.Scanner;

class Cylinder {
  private float volume;
  private float pie;
  private float r;
  private float h;

  Cylinder() {
    this.volume = 0f;
    this.pie = 3.142f;
    this.r = 0f;
    this.h = 0f;
  }

  Cylinder(float r, float h) {
    this.r = r;
    this.h = h;
    this.volume = 0f;
    this.pie = 3.142f;
  }

  public void volume() {
    this.volume = this.pie * this.r * this.r * this.h;
    System.out.println("The volume of cylinder is : " + this.volume);
  }
}

class Armstrong {
  private int n;
  private int sum;
  private int d;
  private int t;

  Armstrong(int n) {
    this.n = n;
    this.sum = 0;
    this.d = 0;
    this.t = n;
  }

  public void arm() {
    for (int i = 0; n != 0; i++) {
      d = n % 10;
      sum += d * d * d;
      n /= 10;
    }
    if (sum == t) {
      System.out.println("The number is an armstrong");
    } else {
      System.out.println("The number is not an armstrong");
    }
  }
}

class Factorial {
  private int factorial = 1;
  private int n;

  Factorial(int n) {
    this.n = n;
  }

  public void fact() {
    for (int i = 1; i <= n; i++) {
      this.factorial = this.factorial * i;
    }
    System.out.printf("The Factorial of %d is %d\n", this.n, this.factorial);
  }
}

class que2 {

  public static void main(String[] args) {
    /*
		Cylinder c  = new Cylinder(4f ,5f);
		c.volume();		

		Factorial f = new Factorial(5);
		f.fact();
		
		Armstrong a = new Armstrong(153);
		a.arm();
	*/

    int n;
    Scanner s = new Scanner(System.in);

    System.out.printf("%10d. %20s\n", 1, "Calculate the volume of cylinder");
    System.out.printf("%10d. %15s\n", 2, "Factorial of number");
    System.out.printf("%10d. %20s\n", 3, "Check number is Armstrong or not");
    System.out.printf("%10d. %5s\n", 4, "Exit...");

    n = s.nextInt();

    switch (n) {
      case 1:
        {
          System.out.println("Enter length and breadth : ");
          Cylinder c = new Cylinder(s.nextFloat(), s.nextFloat());
          c.volume();
        }
        break;
      case 2:
        {
          System.out.println("Enter number for Factorial : ");
          Factorial f = new Factorial(s.nextInt());
          f.fact();
        }
        break;
      case 3:
        {
          System.out.println("Enter number to check is Armstrong or not : ");
          Armstrong a = new Armstrong(s.nextInt());
          a.arm();
        }
        break;
      case 4:
        {
          System.exit(0);
        }
        break;
    }
  }
}
