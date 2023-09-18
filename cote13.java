import java.util.Arrays;
import java.util.stream.IntStream;

public class cote13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,0};
        int result =IntStream.range(0, 10)
        .filter(i -> Arrays.stream(arr).noneMatch(x -> x==i)).sum();
        
        System.out.println(result);

        Solution10 so = new Solution10();
        System.out.println(so.solution(arr));
    }
}
class Solution10 {
    public int solution(int[] arr) {
        int sum = 45;
        for(int i : arr) {
            sum -= i;
        }
        return sum;
    }
}