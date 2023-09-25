import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cote27 {
    public static void main(String[] args) {
        String s = "try hello world";
        String[] test = s.split(" ", -1);
        //연속된 공백도 처리하기 위해

        for(int i=0; i<test.length; i++) {
            char[] str = test[i].toCharArray();  // 문자열을 char 배열로 변경
            for (int y = 0; y < str.length; y++) {
                if (y % 2 == 0) {  // 짝수 인덱스
                    str[y] = Character.toUpperCase(str[y]);
                } else {  // 홀수 인덱스
                    str[y] = Character.toLowerCase(str[y]);
                }
            }
            test[i] = new String(str);  // char 배열을 문자열로 변경
        }

        System.out.println(Arrays.toString(test));
        
        // 배열 요소를 공백으로 연결하여 출력
        String result = String.join(" ", test);
        System.out.println(result);

        Solution27 so = new Solution27();
        System.out.println(so.solution27(s));

    }
}
class Solution27 {
    public String solution27(String s) {
        return Arrays.stream(s.split(" ", -1))
        .map(word -> {
            //스트림의 각 요소에 함수를 적용하여 새로운 형태로 변환
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<word.length(); i++) {
                char c = word.charAt(i);
                sb.append((i%2==0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
            return sb.toString();
        })
        .collect(Collectors.joining(" "));
    }
}