import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Algo27110 {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 7;
        int c = 5;
        
        int[] arr = {a,b,c};
        
        int result = Arrays.stream(arr).reduce(0, (acc, x) -> acc + (x <= n ? x : n));
                //   .map(x -> x <= n ? x : n)
                //   .sum();

        System.out.println(result);
        
    }
}
