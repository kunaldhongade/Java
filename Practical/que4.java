/*
Write a java program to display the system date and time in various
formats shown below : 
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530
Current time is : 15:25:59
Current week of year is : 35
Current week of month is : 5
Current day of the year is : 243
Note : Use java.util.Date and java.text.SimpleDateFormat 
 */
import java.text.SimpleDateFormat;
import java.util.Date;

class que4 {

  public static void main(String[] args) {
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
    String t = s.format(d);
    System.out.println("Current date is : " + t);
    SimpleDateFormat s1 = new SimpleDateFormat("MM-dd-yyyy");
    t = s1.format(d);
    System.out.println("Current date is : " + t);
    SimpleDateFormat s2 = new SimpleDateFormat("EEEE MMMM dd yyyy");
    t = s2.format(d);
    System.out.println("Current date is : " + t);
    SimpleDateFormat s3 = new SimpleDateFormat("EE MMMM dd hh:mm:ss z yyyy");
    t = s3.format(d);
    System.out.println("Current date and time is : " + t);
    SimpleDateFormat s4 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a Z");
    t = s4.format(d);
    System.out.println("Current date and time is : " + t);
    SimpleDateFormat s5 = new SimpleDateFormat("hh:mm:ss");
    t = s5.format(d);
    System.out.println("Current time is : " + t);
    SimpleDateFormat s6 = new SimpleDateFormat("w");
    t = s6.format(d);
    System.out.println("Current week of year : " + t);
    SimpleDateFormat s7 = new SimpleDateFormat("F");
    t = s7.format(d);
    System.out.println("Current week of month is : " + t);
    SimpleDateFormat s8 = new SimpleDateFormat("D");
    t = s8.format(d);
    System.out.println("Current day of the year : " + t);
  }
}
