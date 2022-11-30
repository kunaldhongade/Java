/*
  Write a program to accept n names of country and display them in descending order.
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;

class que6 {

  public static void main(String[] args) {
    String[] s = new String[50];
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("How many strings you want to enter");
    n = sc.nextInt();
    System.out.println("Enter Strings :");
    for (int i = 0; i < n; i++) {
      s[i] = sc.next() + sc.nextLine();
    }
    for (int i = 0; i < n; i++) {
      System.out.printf("%d : %s\n", i, s[i]);
    }

    System.out.println("In descending order");
    for (int i = 0; i < s.length; i++) {
      for (int j = i + 1; j < s.length; j++) {
        if (String.toLowerCase(s[j]) > String.toLowerCase(s[i])) {}
      }
    }
    System.out.println("In Reversed Order");
    for (int i = n - 1; i >= 0; i--) {
      System.out.printf("%d : %s\n", i, s[i]);
    }
  }
}
