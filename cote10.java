import java.util.ArrayList;
import java.util.*;

public class cote10 {
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5,9,7,10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));

        System.out.println(Arrays.toString(div.solution(array, 5)));
        
    }
}
class Divisible {
    public int[] divisible(int[] array, int divisor) {
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i=0; i<array.length; i++) {
            if(array[i]%divisor==0) {
                ret.add(array[i]);
            }
        }
        return ret.stream().mapToInt(i -> i).toArray();
    }
    public int[] solution(int[] array, int divisor) {
        int[] answer = Arrays.stream(array).filter(num -> num%divisor==0)
        .sorted().toArray();

        if(answer.length == 0) {
            return new int[]{-1};
        } else {
            return answer;
        }
    }
}
// Arrays.stream(arr)를 사용하여 arr 배열을 스트림으로 변환합니다.
// .filter(num -> num % divisor == 0)를 사용하여 divisor로 나누어 떨어지는 수만 선택합니다.
// .sorted()를 사용하여 선택된 수들을 정렬합니다.
// .toArray()를 사용하여 결과를 배열로 변환합니다.
// 만약 결과 배열이 비어있다면, -1만 담긴 배열을 반환합니다. 그렇지 않다면 결과 배열을 반환합니다.