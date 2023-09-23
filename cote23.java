import java.util.ArrayList;
import java.util.List;

public class cote23 {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        
        int gcd = getGCD(n, m);
        int lcm = getLCM(n, m, gcd);

        List<Integer> result = new ArrayList<>();
        result.add(gcd);
        result.add(lcm);

        System.out.println(result);
        
        
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int getLCM(int a, int b, int gcd) {
        return (int)((long)(a * b) / gcd);
    }
    
}
