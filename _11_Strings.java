import java.util.Scanner;

public class _11_Strings {
    /*
     * Strings in java 
     * strings is sequence of collections (its class)
     * it has a special support
     * Strings are immutable can not be changed but we can copy it and change it
     */
    public static void main(String[] args) {
        String name = new String("kunal");
        String str = "abc";
        System.out.println(str);
        System.out.println(name);
        System.out.printf("this is printf %s ", str);// does not have new line automatic
        System.out.print("this is print");// does not have new line automatic
        System.out.format("this is printf %s ", name);// does not have new line automatic

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

        sc.close();
    }
}
