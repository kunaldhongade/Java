public class _09_Prac_encryption {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypt the grade 
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
