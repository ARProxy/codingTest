//짐승같은 힘, 무식한 힘이라는 뜻으로 완전 탐색과 걸맞는 이름이며 하나부터 열까지 모든 경우를 다 탐색하는 알고리즘이다.
//완전 탐색의 종류
//부르트 포스(Brute Force) - 조건문을 이용해 모든 경우의 수를 찾는 방법
//비트 마스트(Bit Mask) - 2진수인 컴퓨터의 연산을 이용하는 방법
//순열 - 완전 탐색의 대표적인 유형
//백트래킹 - 현재 상태에서 가능한 후보군으로 가지를 치며 탐색하는 방법
//DFS(너비 우선 탐색) - 정점과 같은 레벨에 있는 형제 노드들을 탐색
//, BFS(깊이 우선 탐색) - 정점의 자식 노드들을 탐색

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int N, M;
//         N = sc.nextInt();
//         M = sc.nextInt();
        
//         int result = 0;
//         int minDiff = Integer.MAX_VALUE;
        
//         int[] arr = new int[N];
//         for(int i=0; i<N; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         for(int i=0; i<N-2; i++) {
//             for(int j=i+1; j<N-1; j++) {
//                 for(int k=j+1; k<N; k++) {
//                     int sum = arr[i] + arr[j] + arr[k];
//                     if(sum <= M) {
//                         int diff = M - sum;
//                         if(diff < minDiff) {
//                             minDiff = diff;
//                             result = sum;
//                         }
//                     }
//                 }
//             }
//         }
//         System.out.println(result);
//     }
// }


package coteStudy;

import java.util.*;

public class B_2798 {
    public static void main(String[] args) {
        int n = 10;
        int m = 500;
        int[] card = {93, 181, 245, 214, 315, 36, 185, 138, 216, 295};

        CompleteSearch coo = new CompleteSearch();
        System.out.println(coo.solution(n, m, card));
    }  
}
class CompleteSearch {
    public int solution(int n, int m, int[] card) {
        int closest = 0;
        int minDiff = Integer.MAX_VALUE;
        //가능한 최대값으로 설정하여 첫 번째 조건문에 대해 항상 참이 되도록
        for(int i=0; i<n - 2; i++) {
            for(int j=i+1; j<n - 1; j++) {
                for(int k=j+1; k<n; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(sum <= m) {
                        int diff = m - sum;

                        if(diff < minDiff) {
                        minDiff = diff;
                        closest = sum;
                        }
                    }   
                }
            }
        }
        return closest;
    }
}
