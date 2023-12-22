import java.util.Arrays;

public class cote3 {
    public static void main(String[] args) {
        long n = 12345;
        Solution soo = new Solution();
        System.out.println(Arrays.toString(soo.solution(n)));
        System.out.println(Arrays.toString(soo.solution1(n)));
        System.out.println(Arrays.toString(soo.solution2(n)));
    }
}
class Solution {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];
        int index = 0;
        while(n>0) {
            answer[index++] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
    public int[] solution1(long n) {
        return new StringBuilder().append(n).reverse().chars()
        .map(Character::getNumericValue).toArray();
    }
    public int[] solution2(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }
}
