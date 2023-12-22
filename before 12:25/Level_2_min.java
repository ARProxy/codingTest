import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

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
        Solution1294 soo = new Solution1294();
        int result = soo.solution(A, B);
        System.out.println(result);

        Long answer = soo.solution00(A, B);
        System.out.println(answer);

        Long finalNumber = soo.solution01(A, B);
        System.out.println(finalNumber);
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

    public Long solution00(int[] A, int[] B) {
        int n = A.length;
        int min = 0;
        List<Integer> listA = new ArrayList<>();
        Arrays.stream(A).forEach(e -> listA.add(e));
        List<Integer> listB = new ArrayList<>();
        Arrays.stream(B).forEach(listB::add);

        if(!listA.isEmpty() && !listB.isEmpty()) {
            int minA = Collections.min(listA);
            int minB = Collections.min(listB);
            min = Math.min(minA, minB);
        }
        if (listA.contains(min)) {
            Collections.sort(listA);
            Collections.sort(listB, Collections.reverseOrder());
            return IntStream.range(0, n)
                    .mapToLong(i -> listA.get(i) * listB.get(i))
                    .sum();
        } else {
            Collections.sort(listB);
            Collections.sort(listA, Collections.reverseOrder());
            return IntStream.range(0, n)
                    .mapToLong(i -> listA.get(i) * listB.get(i))
                    .sum();
        }
    }
    public Long solution01(int[] A, int[] B) {
        int n = A.length;
        long sum = 0;

        // 배열 A와 B를 정렬합니다.
        Arrays.sort(A);
        Arrays.sort(B);

        // 배열 A는 오름차순, 배열 B는 내림차순으로 곱셈을 수행합니다.
        for (int i = 0; i < n; i++) {
            sum += (long) A[i] * B[n - 1 - i];
        }

        return sum;
    }
}
