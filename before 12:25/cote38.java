public class cote38 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        // int result = 0;
        // int sum = 0;
        // int dif = 0;
        
        // while(n>1) {
        //     if(n%a == 0) {
        //         n = n / a;
        //     } else {
        //         dif = n % a;
        //         n = (int)Math.ceil(n / a);
        //     }
        //     if(n == dif) {
        //         sum += 1;
        //     }
        //     sum += n;
        // }
        // System.out.println(sum);
        Solution38 so = new Solution38();
        System.out.println(so.solution(a, b, n));
    }
}
class Solution38 {
    public int solution(int a, int b, int n) {
        int sum = 0;

        while(true) {
            if(n<a) break;
            int cola = (n/a)*b;
            sum += cola;
            n = cola+(n%a);
        }
        return sum;
    }
}