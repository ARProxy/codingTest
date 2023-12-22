import java.util.Arrays;

public class cote14 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        // int[] result = {};
        if(arr.length == 1) {
            int[] result = {-1};
            System.out.println(Arrays.toString(result));
        } else {
            int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
            int[] result = Arrays.stream(arr).filter(value -> value > min).toArray();
            System.out.println(Arrays.toString(result));
        }
        
    }
}
