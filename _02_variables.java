/*
        This is anatomy of java program

 * Documentation section    ---> (suggested)
 * package Statement        ---> (optional)
 * import statements        ---> (optional)
 * interface statements     ---> (optional)
 * Class Definition         ---> (optional)
 * main method class        ---> (required)
    public class ClassName {
    public static void main(String args[]) {
        # code here
      }
}
 */

/*
 * Data types in Java
 
 1. Primitive Data type

  *integral
    a. byte (W = 8)
    b. short (W = 16)
    c. int (W = 32)
    d. long (W = 64)
    
 *Floats(decimal)
    e. double (W = 64)
    i. float (W = 32)

 *char
    j. char (W = 16)

 *boolean
    k. boolean

 2. Non Primitive Data type
    a. Array
    b. class
    c. 
 */

public class _02_variables {
    public static void main(String[] args) {
        int i= 0; // takes 4 byte (-(2^32)/2 to (2^32)/2) ----> –2,147,483,648 to 2,147,483,647
        System.out.println(i);

        byte b = 127; // takes 1 byte (-(2^8)/2 to (2^8)/2) ---->  –128 to 127
        System.out.println(b);

        short s = 12345; // takes 2 bytes (-(2^16)/2 to (2^16)/2) ----> –32,768 to 32,767
        System.out.println(s);

            long l = 9223372036854775806l; // takes 8 bytes (-(2^64/2) to (2^64)/2) ----> –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            System.out.println(l);

            float f = 12345678.90f; // takes 4 bytes 
            System.out.println(f);

            double d = 123400000.578d; // takes 8 bytes
            System.out.println(d);

        char c = 'a'; // takes 2 bytes -> unicode | range (0 to 65,536) | default value is "\u0000"
        System.out.println(c);

        boolean bool = true; // default value is false(0) | size depends on JVM
        System.out.println(bool);

        String str = "its string"; // its obj | for any obj default value is null
        System.out.println(str);

        long res = (i + b + s);
        System.out.print("1. i + b + s = ");
        System.err.println(res);

        double resD = f + d;
        System.out.print("2. f + d = ");
        System.out.println(resD);

    }
}
 