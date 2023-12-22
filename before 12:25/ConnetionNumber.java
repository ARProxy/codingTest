import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ConnetionNumber {
    public static void main(String[] args) {
        int[] num = {3,4,5,2,1};
        int a = 0;
        int b = 0;
        String aa = "";
        String bb = "";
        for(int i=0; i<num.length; i++) {
            if(num[i]%2 == 1) {
                aa += String.valueOf(num[i]);
            } else {
                bb += String.valueOf(num[i]);
            }
        }
        a = Integer.parseInt(aa);
        b = Integer.parseInt(bb);
        System.out.println(a+b);

        Solutionss soo = new Solutionss();

        System.out.println(soo.solution000(num));
    }
}
class Solutionss {
    public int solution000(int[] num) {
        Map<Boolean, String> result = Arrays.stream(num)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x% 2 == 0,
                        Collectors.mapping(Object::toString, Collectors.joining())));
        String evenNumbers = result.get(true);
        String oddNumbers = result.get(false);
        return Integer.parseInt(evenNumbers) + Integer.parseInt(oddNumbers);
    }
}