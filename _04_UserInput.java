import java.util.Scanner;

public class _04_UserInput {

  public static void main(String[] args) {
    System.out.println("This is program specially for user input");
    /*
         * Reading data from keyboard
            Scanner class is used for reading data form keyboard
        */

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number 1");
    int a = sc.nextInt();
    System.out.println("Enter number 2");
    int b = sc.nextInt();
    int res = a + b;
    System.out.print("The addition of a + b is ");
    System.out.println(res);

    //        System.out.println("Enter float ");
    //        float f1 = sc.nextFloat();
    //        System.out.println("Enter float 2");
    //        float f2 = sc.nextFloat();
    //        float F_res = f1 + f2;
    //        System.out.print("The addition of f1 + f2 is ");
    //        System.out.println(F_res);

    // is user entered value is int or not
    System.out.println("Enter some numeric value : ");

    int chk_int = sc.nextInt();
    System.out.println(chk_int);

    sc.nextLine();
    //    // is user entered value is byte or not
    //    System.out.println("Enter some numeric value : ");
    //    boolean chk_byte = sc.hasNextByte();
    //    System.out.println(chk_byte);

    //    // is user entered value is short or not
    //    System.out.println("Enter some numeric value : ");
    //    boolean chk_short = sc.hasNextShort();
    //    System.out.println(chk_short);

    //    // is user entered value is long or not
    //    System.out.println("Enter some numeric value : ");
    //    boolean chk_long = sc.hasNextLong();
    //    System.out.println(chk_long);

    //    // is user entered value is float or not
    //    System.out.println("Enter some float value : ");
    //    boolean chk_float = sc.hasNextFloat();
    //    System.out.println(chk_float);

    //    // is user entered value is double or not
    //    System.out.println("Enter some numeric value : ");
    //    boolean chk_double = sc.hasNextDouble();
    //    System.out.println(chk_double);

    System.out.println("Enter string literals for test");
    // string is build in type for storing string literals
    String str = sc.nextLine(); // when we use .next method for string its takes only first literal(word)
    System.out.println(str);

    sc.nextLine();

    System.out.println("Enter string literals for test");
    String str2 = sc.nextLine(); // for .nextLine method its takes whole line as a input
    System.out.println(str2);

    sc.close();
  }
}
