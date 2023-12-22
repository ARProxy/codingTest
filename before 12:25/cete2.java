import java.util.*;
import java.util.stream.IntStream;
public class cete2 {
    public static void main(String[] args) {
        int n = 10;
        int x = 0;
        for(x=2; x<10; x++) {
            if(n%x ==1) {
                System.out.println(x);
                break;
            }
        }
        
    }
}

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}

class Solution1 {
    public int solution(int n) {
        List<Integer> result = new ArrayList<>();
        int x=0;
        for(x=2; x<n; x++) {
            if(n%x == 1) {
                result.add(x);
            }
        }
        return result.get(0);
    }
}