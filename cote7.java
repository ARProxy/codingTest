import java.util.stream.*;

public class cote7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = 0;
        int result1 = IntStream.of(a, b).max().getAsInt();
        int result2 = IntStream.of(a, b).min().getAsInt();
        //스트림 공부중이라 어떻게든 스트림을 사용해서 풀어봤다.
        //Math.Max(a, b)나 Min을 이용한거와 같다.
        for(int i=result2; i<=result1; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
