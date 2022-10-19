import java.util.Scanner;

public class _05_Pra_MarkAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Marks for subjects ------> ");

        System.out.print("Sub1 : ");
        byte Msub1 = sc.nextByte();

        System.out.print("Sub2 : ");
        byte Msub2 = sc.nextByte();

        System.out.print("Sub3 : ");
        byte Msub3 = sc.nextByte();

        System.out.print("Sub4 : ");
        byte Msub4 = sc.nextByte();

        System.out.print("Sub5 : ");
        byte Msub5 = sc.nextByte();

        int stud_Marks = Msub1 + Msub2 + Msub3 + Msub4 + Msub5;
        float avgMarks = stud_Marks / 5;
        float percentage = stud_Marks* 100 / 500f ;

        System.out.println();
        System.out.print("Student name: ");
        System.out.println(name);
        System.out.print("Total marks: ");
        System.out.println(stud_Marks);
        System.out.print("Average of marks: ");
        System.out.println(avgMarks);
        System.out.print("The percentage of student : ");
        System.out.println(percentage);

        sc.close();
    }
}
