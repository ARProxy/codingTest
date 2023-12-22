import java.util.Arrays;
import java.util.concurrent.Flow.Subscriber;

public class cote28 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        int sum = 0;
        String[] arr = t.split("");
        int len = p.length();
        String[] str = new String[arr.length - len + 1];
        for(int i=0; i<=arr.length-len; i++) {
            str[i] = "";  // 초기화
            for(int y=i; y<i+len; y++) {
                str[i] += arr[y];
            }
        }
        int requ = Integer.parseInt(p);
        for(int i=0; i<str.length; i++) {
            int digit = Integer.parseInt(str[i]);
            if(digit <= requ) {
                sum++;
            }
        }
        System.out.println(sum);
        //위의 코드는 내가 생각해낸 코드지만 런타임에러가 몇몇 테스트 케이스에 발생함.

        Solution28 so = new Solution28();
        System.out.println(so.solution28(t, p));
    }
    
}
class Solution28 {
    public int solution28(String t, String p) {
        int sum = 0;
        int len = p.length();
        for(int i=0; i<=t.length()-len; i++) {
            if(isLessThanOrEqual(t.substring(i, i+len), p)) {
                sum++;
            }
        }
        return sum;
    }
    private boolean isLessThanOrEqual(String a, String b) {
        if(a.length() < b.length()) return true;
        if(a.length() > b.length()) return false;

        return a.compareTo(b) <= 0;
    }
}