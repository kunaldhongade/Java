import java.util.Scanner;

public class _05_Pra_greetings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name: ");
    String name = sc.nextLine();
    System.out.println("Greetings");
    System.out.println("Hello "+name+" Have a good day!");
    sc.close();
    }
}
