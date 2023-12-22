package cote;

import java.util.Arrays;

public class KaKaoFailrate {
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        
        Solution51 so = new Solution51();
        System.out.println(Arrays.toString(so.solution(n, stages)));
    }
}
class Solution51 {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        int[] userCount = new int[n + 2];
        //스테이지별 도전한 사용자 수 저장
        double[] failureRate = new double[n];

        //실패율 저장

        //스테이지별 도전한 사용자 수 계산
        for(int stage : stages) {
            userCount[stage - 1]++;
        }

        int totalUsers = stages.length;

        //실패율 계산
        for(int i=0; i<n; i++) {
            if(totalUsers > 0) {
                failureRate[i] = (double) userCount[i] / totalUsers;
                totalUsers -= userCount[i];
            } else {
                failureRate[i] = 0.0;
            }
        }

        //실패율을 내림차순으로 정렬하여 스테이지 번호를 추출
        for (int i = 0; i < n; i++) {
            int maxIndex = 0;
            double maxFailureRate = -1.0;
            for (int j = 0; j < n; j++) {
                if (failureRate[j] > maxFailureRate) {
                    maxFailureRate = failureRate[j];
                    maxIndex = j;
                }
            }
            answer[i] = maxIndex + 1;
            failureRate[maxIndex] = -1.0; // 이미 처리한 스테이지는 마킹
        }
        return answer;
    }
}