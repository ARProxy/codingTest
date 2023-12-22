//백트래킹은 결정 문제를 해결하는 데 사용되는 알고리즘.
//주어진 문제의 해결 방법을 찾기 위해 가능한 모든 경로를 탐색하는 방법.
//문제의 답을 찾게 되면 더 이상의 탐색을 중지하고 그 경로를 반환.
//백트래킹은 보통 재귀적 구조를 가짐.
//대표적인 백트리킹 문제로는 N-Queen, 미로찾기, 수도쿠

package BFBT;

import java.util.*;

public class B_10819 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        BackTracking back = new BackTracking();
        System.out.println(back.permutation(a, 0, n));

        BruteForce brute = new BruteForce();
        System.out.println(brute.findValue(a));

    }
}
class BackTracking {
    private int maxSum = 0;
    //클래스 내부에서 사용할 멤버 변수를 초기화 시킴.
    //멤버 변수를 선언하는 이유는 순열을 생성하면서 최대값을 계산할 때마다 값을 업데이트 할 수 있으며 동시에 결과값으로도 반환할 수 있음.
    //만약 permutation에 지역변수였다면 재귀 호출을 할 때마다 그 값을 전달해야 함.
    public int permutation(int[] a, int depth, int n) {
        if(depth == n) {
            maxSum = Math.max(maxSum, calculate(a));
            return maxSum;
        }

        for(int i=depth; i<n; i++) {
            swap(a, depth, i);
            permutation(a, depth+1, n, r);
            swap(a, depth, i);
            //원래 상태로 복원
        }
        return maxSum;
        //permutation 메서드는 주어진 배열 a 의 모든 가능한 순열을 생성함.
        //depth는 현재 재귀 깊이를 나타내고 재귀를 이용하여 모든 순열을 생성하고
        //각 순열에 대한 값을 계산한 후, 최대값을 구함.
    }
    public void swap(int[] a, int depth, int i) {
        int temp = a[depth];
        a[depth] = a[i];
        a[i] = temp;
        //원소 교환 메서드
    }
    public int calculate(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length - 1; i++) {
            sum += Math.abs(a[i] - a[i+1]);
        }
        return sum;
        //각 배열 원소 사이의 절대값 차이를 더하여 합계를 반환.
    }
}
class BruteForce {
    public int findValue(int[] a) {
        Arrays.sort(a);
        int max = 0;

        do {
            int temp = calculate(a);
            max = Math.max(max, temp);
        } while(nextPermutation(a));

        return max;
    }
    private boolean nextPermutation(int[] a) {
        int i = a.length;
        while(i>=0 && a[i]>=a[i+1]) {
            i--;
        }

        if(i==-1) return false;

        int j = a.length - 1;
        while(a[j]<=a[i]) {
            j--;
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        int k = a.length - 1;
        while(i<k) {
            temp = a[i+1];
            a[i+1] = a[k];
            a[k] = temp;
            i++;
            k--;
        }
        return true;
    }
    private int calculate(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length - 1; i++) {
            sum += Math.abs(a[i] - a[i+1]);
        }
        return sum;
    }
}