import java.util.*;
import java.util.stream.IntStream;

public class cote24 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

        List<Integer> list = new ArrayList<>();

        list.add(arr1[0]);
        for(int i=1; i<arr1.length; i++) {
            if(arr1[i] != arr1[i-1]) {
                list.add(arr1[i]);
            }
        }
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();

        list1.add(arr2[0]);
        for(int i=1; i<arr2.length; i++) {
            if(arr2[i] != arr2[i-1]) {
                list1.add(arr1[i]);
            }
        }
        System.out.println(list1);
        // int[] result = new int[list.size()];
        // for(int i=0; i<list.size(); i++) {
        //     result[i] = list.get(i);
        // }
        System.out.println(Arrays.toString(solution24(arr1)));
        
    }
    public static int[] solution24(int[] arr) {
        int[] result = IntStream.range(0, arr.length)
        .filter(i -> i == 0 || arr[i] != arr[i-1])
        .map(i -> arr[i])
        .toArray();

        return result;
    }
}
