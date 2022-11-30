// Write a program to display the 1 to 15 tables
import java.io.*;

class que8 {

  public static void main(String[] args) {
    for (int i = 1; i <= 15; i++) {
      System.out.println("\n\nThe multiplication table of : " + i);
      System.out.println();
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%2d X %2d = %5d\n", i, j, j * i);
      }
    }
  }
}
