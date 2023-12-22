import java.util.ArrayList;
import java.util.*;

public class cote46 {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        // int[] student1 = {1,2,3,4,5};
        // int[] student2 = {2,1,2,3,2,4,2,5};
        // int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        // int score1 = 0, score2 = 0, score3 = 0;

        // for(int i=0; i<answers.length; i++) {
        //     if(answers[i] == student1[i%student1.length]) score1++;
        //     if(answers[i] == student2[i%student2.length]) score2++;
        //     if(answers[i] == student3[i%student3.length]) score3++;
        // }

        // int maxScore = Math.max(score1, Math.max(score2, score3));
        // List<Integer> list = new ArrayList<>();

        // if(maxScore == score1) list.add(1);
        // if(maxScore == score2) list.add(2);
        // if(maxScore == score3) list.add(3);
        // System.out.println(list);
        //mapToInt 항등함수 i->i List<Integer> 타입의 리스트를 IntStream으로 변환

        Solution46 so = new Solution46();
        System.out.println(so.solution(answers));
    }
}
class Solution46 {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i=0; i<hit.length; i++) {
            for(int j=0; j<answers.length; j++) {
                if(patterns[i][j%patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(int[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<hit.length; i++) {
            if(max == hit[i]) list.add(i+1);
        }

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list) {
            answer[cnt++] = num;
        }
        return answer;
    }
}