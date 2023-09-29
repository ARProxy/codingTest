import java.util.Arrays;
import java.util.concurrent.Flow.Subscriber;

public class cote34 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        // int[] subArray = Arrays.copyOfRange(array, commands[0][0]-1, commands[0][1]);
        // Arrays.sort(subArray);
        // int value = subArray[commands[0][2]-1];
        // System.out.println(value);
        Solution34 so = new Solution34();
        System.out.println(Arrays.toString(so.solution(array, commands)));
    }
}
class Solution34 {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            int value = subArray[commands[i][2] - 1];
            result[i] = value;
        }
        return result;
    }
}