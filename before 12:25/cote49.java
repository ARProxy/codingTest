import java.util.Arrays;
import java.util.stream.IntStream;

public class cote49 {
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;
        int result = 0;

        int[] aliquot = new int[number];
        
        // for(int i=1; i<=number; i++) {
        //     int count = 0;
        //     for(int j=1; j<=i; j++) {
        //         if(i % j == 0) count++;
        //     }
        //     aliquot[i-1] = count;
        // }시간 초과

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                //1부터 i의 제곱근까지 순회.
                //제곱근까지만 확인하면 그 후로는 중복계산이 발생하지 않음.
                if (i % j == 0) {
                    if (i / j == j) {
                        count++;//i가 완전 제곱수인 경우 약수가 중복 계산되지 않게 1추가
                    } else {
                        count += 2;//완전 제곱수가 아닌 경우에는 2를 증가
                    }
                }
            }
            aliquot[i - 1] = count;
        }
        System.out.println(Arrays.toString(aliquot));
        for(int i=0; i<aliquot.length; i++) {
            if(aliquot[i]<=limit) continue;
            else aliquot[i] = power;
        }
        System.out.println(Arrays.toString(aliquot));
        result = Arrays.stream(aliquot).sum();
        System.out.println(result);
    }
}
