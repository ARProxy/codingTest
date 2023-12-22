import java.util.stream.IntStream;

public class cote16 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int result = 0;

        for(int i=0; i<a.length; i++) {
            result += a[i]*b[i];
        }
        System.out.println(result);

        Solution16 so = new Solution16();
        System.out.println(so.solution(a, b));
    }
}
class Solution16 {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index]*b[index]).sum();
    }
}