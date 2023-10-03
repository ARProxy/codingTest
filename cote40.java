import java.util.*;
import java.util.stream.IntStream;

public class cote40 {
    public static void main(String[] args) {
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int k = 4;
        int[] result = new int[score.length];
        int[][] top = new int[score.length][k];
        //4일차 부터는 점수가 인덱스 3개의 값보다 큰지 비교 후 크면 삽입 아니면 삭제
        // for(int i=0; i<score.length; i++) {

        //     for(int j=0; i<3 ? j<=i : j<k; j++) {
        //         //0,01,012,123,234
        //         top[i][j] = score[i];
        //     }
        // }
        // for (int i = 0; i < score.length; i++) {
        //     if (i < k) {
        //         int[] temp = Arrays.copyOfRange(score, 0, i + 1);
        //         Arrays.sort(temp);
        //         for (int j = 0; j < temp.length; j++) {
        //             top[i][j] = temp[temp.length - j - 1];
        //         }
        //     } else {
        //         int[] temp = Arrays.copyOfRange(score, i - k + 1, i);
        //         Arrays.sort(temp);
        //         boolean shouldInsert = true;
        //         for (int j = 0; j < temp.length; j++) {
        //             if (score[i] <= temp[j]) {
        //                 shouldInsert = false;
        //                 break;
        //             }
        //         }
        //         if (shouldInsert) {
        //             temp[0] = score[i];
        //             Arrays.sort(temp);
        //         }
        //         for (int j = 0; j < k; j++) {
        //             if (j < temp.length) {
        //                 top[i][j] = temp[temp.length - j - 1];
        //             }
        //         }
        //     }
        // }
        Solution40 so = new Solution40();

        System.out.println(Arrays.toString(so.solution(k, score)));
        System.out.println(Arrays.toString(so.solution1(k, score)));
        System.out.println(Arrays.toString(so.solution2(k, score)));
    }
}
class Solution40 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hallOfFame.add(score[i]);
                hallOfFame.sort(Collections.reverseOrder());
                //주어진 객체의 natural ordering을 반대로 하는 comparator비교자를 반환한다.
                // List<Integer> numbers = Arrays.asList(5, 1, 3, 2, 4);
                // Collections.sort(numbers, Collections.reverseOrder());
                // System.out.println(numbers); 출력: [5, 4, 3, 2, 1]
            } else {
                if (score[i] > hallOfFame.get(hallOfFame.size() - 1)) {
                    hallOfFame.remove(hallOfFame.size() - 1);
                    hallOfFame.add(score[i]);
                    hallOfFame.sort(Collections.reverseOrder());
                }
            }
            answer[i] = hallOfFame.get(hallOfFame.size() - 1);
        }
        return answer;
    }
    public int[] solution1(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //우선순위 큐 기본적으로 최소값이 가장 앞에 오도록 정렬된다.
        // priorityQueue.peek() 호출시 가장 작은 값을 반환한다.
        int temp;
        for(int i=0; i<score.length; i++) {
            priorityQueue.add(score[i]);
            if(priorityQueue.size()>k) {
                priorityQueue.poll();
                //기본적으로 오름차순으로 정렬 현재 가장 작은 수를 반환하고 큐에서 제거.
                // PriorityQueue<Integer> pq = new PriorityQueue<>();
                // pq.add(5);
                // pq.add(3);
                // pq.add(8);

                // System.out.println(pq.poll()); // 출력: 3
                // System.out.println(pq.poll()); // 출력: 5

            }
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
    public int[] solution2(int k, int[] score) {
        Integer[] scores = new Integer[score.length];

        return IntStream.range(0, score.length).peek(i -> scores[i] = score[i])
        //peek() 주어진 작업을 수행하고 같은 스트림을 반환하는 중간 연산. 배열 복사
        .map(i -> {
            Arrays.sort(scores, 0, i+1, Collections.reverseOrder(Integer::compare));
            return i<k ? scores[i] : scores[k-1];
        }).toArray();
    }
}