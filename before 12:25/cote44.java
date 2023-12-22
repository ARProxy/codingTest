import java.util.*;
import java.util.stream.*;

public class cote44 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1,2,3,1,2,3,1};

        Solution44 so = new Solution44();
        System.out.println(so.solution(k, m, score));
    }
}

class Solution44 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());
        
        for(int i=0; i<scores.length; i++) {
            if((i+1)%m==0) answer += scores[i] *m;
        }
        return answer;
    }
}