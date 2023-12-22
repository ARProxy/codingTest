import java.util.*;
import java.util.stream.IntStream;

public class cote25 {
    public static void main(String[] args) {
        int n = 45;
        String ternary = "";
        while(n>0) {
            ternary = (n%3)+ternary;
            n/=3;
        }
        System.out.println(ternary);
        String s = ternary;
        StringBuilder sb = new StringBuilder(s);
        // char temp = sb.charAt(0);
        // for(int i = 0; i < ternary.length() - 1; i++) {
        //     sb.setCharAt(i, sb.charAt(i+1));
        // }
        // sb.setCharAt(ternary.length() - 1, temp);
        // s = sb.toString();
        // System.out.println(s);
        String rever = sb.reverse().toString();
        System.out.println(rever);
        int result = 0;
        int base = 1;
        int index = rever.length()-1;
        while(index >=0) {
            int digit = Character.getNumericValue(rever.charAt(index));
            if(digit>2||digit<0) {
                throw new IllegalArgumentException("틀림");
            }
            result += digit*base;
            base*=3;
            index--;
        }
        System.out.println(result);
        int y = 45;
        Solution25 so = new Solution25();
        System.out.println(so.solution25(y));
    }
}
class Solution25 {
    public int solution25(int n) {
        if (n == 0) return 0;

        String a = "";
        while(n > 0) {
            a = (n % 3) + a;
            n /= 3;
        }
        
        a = new StringBuilder(a).reverse().toString();
        
        return Integer.parseInt(a, 3);
    }
}
