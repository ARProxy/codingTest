import java.lang.reflect.Array;
import java.util.Arrays;

public class P_pibona {
    public static void main(String[] args) {
        int n = 6;
        Pibo pi = new Pibo();
        int result = pi.f(n);
        System.out.println(result);

    }
}
class Pibo {
    public int f(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return f(n-1) + f(n-2);
    }
    //위처럼 계산하는 것은 같은 계산을 반복적으로 수행하기 때문에 숫자가 커질수록 매우 비효율적이다.
    //그러므로 동적 계회법(DP)를 사용해보자
    public int ff(int n) {
        if(n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        System.out.println(Arrays.toString(fib));
        for(int i=2; i<=n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(Arrays.toString(fib));
        }
        return fib[n];
    }
    //위처럼 해도 시간초과가 난다.
//    a,b,c값을 계속적으로 더해주면서 피보나치 수열을 앞으로 나아간다.
//    마지막 수 전인 b가 n번째 수이기 때문에 b를 반환한다.
    public int fff(int n) {
        if(n <= 1) {
            return n;
        }
        int mod = 1234567;
        int a = 0, b = 1, c;
        for(int i=2; i<=n; i++) {
            c = (a+b)%mod;
            a=b;
            b=c;
        }
        return b;
    }
}

