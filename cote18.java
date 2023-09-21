import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class cote18 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String result = solution(s);
        System.out.println(result);

        String result1 = solution1(s);
        System.out.println(result1);

        String result2 = solution2(s);
        System.out.println(result2);
    }
    public static String solution(String s) {
        //문자열을 문자 배열로 변환
        Character[] chars = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        //문자 배열 정렬(기본 정렬이 아닌 역순 정렬)
        Arrays.sort(chars, Collections.reverseOrder());
        //문자 배열을 문자열로 변환하여 반환
        StringBuilder sb = new StringBuilder(chars.length);
        for(char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static String solution1(String s) {
        //문자열을 문자 배열로 반환
        Character[] chars = new Character[s.length()];
        for(int i=0; i<s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        //사용자 정의 비교자를 사용하여 문자 배열 정렬
        Arrays.sort(chars, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return c2 - c1;
            }
        });
        //문자 배열을 문자열로 변환하여 반환
        StringBuilder sb = new StringBuilder();
        for(char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static String solution2(String s) {
        List<Character> cha = new ArrayList<>();
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            cha.add(s.charAt(i));
        }
        //문자들을 내림차순으로 정렬
        Collections.sort(cha, Collections.reverseOrder());
        //정렬된 문자들로 결과 문자열 생성
        for(char c : cha) {
            answer += c;
        }
        return answer;
    }
}

// public class cote18 {
//     public static void main(String[] args) {
//         String s = "Zbcdefg";
//         String result = "";

//         List<Character> cha = new ArrayList<>();
//         for (int i = 0; i < s.length(); i++) {
//             cha.add(s.charAt(i));
//         }

//         // 문자들을 내림차순으로 정렬
//         Collections.sort(cha, Collections.reverseOrder());

//         // 정렬된 문자들로 결과 문자열 생성
//         for (char c : cha) {
//             result += c;
//         }

//         System.out.println(result);  // 출력: gfedcbZ
//     }
// }
