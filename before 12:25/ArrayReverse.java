import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i<num.length; i++) {
//            list.add(num[i]);
//        }
//        Collections.reverse(list);
//        System.out.println(list);

        List<Integer> list = Arrays.stream(num)
                .boxed()
                //int값을 Integer 객체로 변환하는 과정 == 박싱
                .collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);
    }
}
