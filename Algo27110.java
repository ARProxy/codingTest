// 설날을 맞아 부대원들을 위해 특식으로 치킨을 주문했다. 후라이드 치킨, 간장치킨, 양념치킨을 각각 
// $N$마리씩 주문했고, 
// $1$인당 치킨을 한 마리씩 배부하고자 한다.

// 최대한 많은 부대원에게 본인이 선호하는 종류의 치킨을 배부해주기 위해 으뜸병사는 부대원들의 치킨 종류 선호도를 조사했고, 세 가지 치킨 중 후라이드 치킨, 간장치킨, 양념치킨을 가장 선호하는 인원의 수는 각각 
// $A$명, 
// $B$명, 
// $C$명이라는 것을 알아냈다. 이때, 모든 부대원은 각자 한 종류의 치킨만 골라 답했다.

// 본인이 가장 선호하는 종류의 치킨을 받을 수 있는 인원수의 최댓값을 구하여라.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Algo27110 {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 7;
        int c = 5;
        
        int[] arr = {a,b,c};
        
        int result = Arrays.stream(arr).reduce(0, (acc, x) -> acc + (x <= n ? x : n));
                //   .map(x -> x <= n ? x : n)
                //   .sum();

        System.out.println(result);
        
    }
}
