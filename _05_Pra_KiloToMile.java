import java.util.Scanner;
public class _05_Pra_KiloToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for Km to Mile");
        System.out.print("Enter Km: ");
        float km = sc.nextFloat();
        float res = km / 1.609344f;
        System.out.println(res +" mile");
        System.out.println();
        System.out.println("Program for Mile to KM");
        System.out.print("Enter mile");
        float mile = sc.nextFloat();
        res = mile * 1.609344f;
        System.out.println(res + " kiloMeter");
        sc.close();
    }
}
