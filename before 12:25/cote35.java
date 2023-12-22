import java.util.*;
import java.util.stream.IntStream;


/**
 * cote35
 */
public class cote35 {

    public static void main(String[] args) {
         String s = "banana";
         String s1 = "foobar";

         char[] ch = s.toCharArray();
         int[] result = new int[ch.length];
         result[0] = -1;
         for(int i=1; i<ch.length; i++) {
            for(int y=1; y<=i; y++) {
                if(ch[i] == ch[i-y]) {
                    result[i] = y;
                    break;
                } else {
                    result[i] = -1;
                }
            }
         }
         System.out.println(Arrays.toString(result));

         Solution35 so = new Solution35();
         System.out.println(Arrays.toString(so.solution(s1)));

         Solution35 soo = new Solution35();
         System.out.println(Arrays.toString(soo.solution1(s1)));
    }
}

class Solution35 {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            result[i] = i-map.getOrDefault(ch, i+1);
            //map에서 현재 문자 ch에 대한 마지막 위치를 가져온다.
            //만약 이전에 문자가 없다면, 기본값으로 i+1을 반환한다.
            //반환 값을 현재 위치에서 빼주고 차이를 구한다.
            map.put(ch, i);
        }
        return result;
    }
    public int[] solution1(String s) {
        return IntStream.range(0, s.length())
        //0~s.length()-1 연속된 정수 스트림을 생성한다.
        .map(i -> s.substring(0, i).lastIndexOf(s.charAt(i)) > -1 ? 
              i - s.substring(0, i).lastIndexOf(s.charAt(i)) : -1)
        //s의 문자열을 시작부터 i인덱스까지 substring해주고
        //i번째 문자가 마지막으로 나타나는 위치의 인덱스를 반환한다.
        .toArray();
    }
}
