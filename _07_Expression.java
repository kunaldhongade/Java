/*
 * R = b + S ---->  int
 * R = S + I ---->  int
 * R = L + F ---->  float
 * R = I + F ---->  float
 * R = C + I ---->  int
 * R = C + S ---->  int
 * R = L + D ---->  Double
 * R = F + D ---->  Doubles
 */
public class _07_Expression {
    public static void main(String[] args) {
    
        int I = 10;
        byte b = 20;
        short S = 30;
        long L = 40l;
        float F = 50.0f;
        double D = 60.0d;
        char C = 'a';

        double R;

        R = b + S;
        System.out.println(R);

        R = S + I;
        System.out.println(R);
        
        R = L + F;
        System.out.println(R);
        
        R = I + F;
        System.out.println(R);
        
        R = C + I;
        System.out.println(R);
        
        R = C + S;
        System.out.println(R);
        
        R = L + D;
        System.out.println(R);
        
        R = F + D;
        System.out.println(R);
        
    }
}
