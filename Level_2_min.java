import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level_2_min {
    public static void main(String[] args) {
        int[] A = {1,4,2};
        int[] B = {5,4,4};

        int[] list = new int[A.length + B.length];

        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            list1.add(A[i]);
            list[i] = A[i];
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<B.length; i++) {
            list2.add(B[i]);
            list[i+3] = B[i];
        }
        Arrays.sort(list);
        int min = Arrays.stream(list).min().getAsInt();

        if(list1.contains(min)) {
            Collections.sort(list1);
            Collections.sort(list2, (a, b) -> b - a);
        } else {
            Collections.sort(list2);
            Collections.sort(list1, (a, b) -> b - a);
        }

        System.out.println(list2);
        int sum = 0;
        for(int i=0; i<list1.size(); i++) {
            sum += list1.get(i) * list2.get(i);
        }

        System.out.println(sum);

    }
}
class Solution1294 {
    public int solution(int[] A, int[] B) {
        int n = A.length; // Assuming A and B are of the same length
        int[] list = new int[2 * n];
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(A[i]);
            list[i] = A[i];
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list2.add(B[i]);
            list[n + i] = B[i]; // Correctly merging B into list
        }
        Arrays.sort(list);
        int min = Arrays.stream(list).min().getAsInt();
        if (list1.contains(min)) {
            Collections.sort(list1);
            Collections.sort(list2, Collections.reverseOrder());
        } else {
            Collections.sort(list2);
            Collections.sort(list1, Collections.reverseOrder());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) { // Ensure that A and B are of the same length
            sum += list1.get(i) * list2.get(i);
        }
        return sum;
    }
}
