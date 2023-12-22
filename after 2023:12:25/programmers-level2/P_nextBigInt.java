import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P_nextBigInt {
    public static void main(String[] args) {
        int n = 78;
        int b = 0;
        List<Integer> list = numberChange(n);
        int sum = list.stream().mapToInt(Integer::intValue).filter(num -> num == 1).sum();
        int result = 0;
        while(true) {
            n++;
            List<Integer> list1 = numberChange(n);
            System.out.println(list1);
            int sum1 = list1.stream().mapToInt(Integer::intValue).filter(num -> num == 1).sum();
            System.out.println(sum1);
            if(sum == sum1) {
                result = numberRollback(list1);
                break;
            }
        }
        System.out.println(result);

        int m = 15;
        Solution011 so = new Solution011();
        int answer = so.solution1(m);
        System.out.println(answer);
    }
    public static List<Integer> numberChange(int n) {
        List<Integer> list = new ArrayList<>();
        int b = 0;
        while(n>0) {
            b = n % 2;
            list.add(b);
            n /= 2;
        }
        Collections.reverse(list);
        return list;
    }
    public static int numberRollback(List<Integer> list) {
        //1111 -> 2^0 + 2^1 + 2^2 + 2^3 -> 1 + 2 + 4 + 8
        Collections.reverse(list);
        int result = 0;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) == 1) {
                result += Math.pow(2, i);
            }
        }
        return result;
    }
}
class Solution011 {
    public int solution1(int n) {
        int targetBit = Integer.bitCount(n);
        int result = n + 1;
        while(Integer.bitCount(result) != targetBit) {
            result++;
        }
        return result;
    }
}