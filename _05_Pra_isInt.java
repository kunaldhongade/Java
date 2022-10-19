import java.util.Scanner;
public class _05_Pra_isInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check is number or not!");
        
        System.out.println("Enter number");
        boolean isInt = sc.hasNextInt();
        System.out.println(isInt);

        sc.close();
    }
}
