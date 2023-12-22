import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class cote33 {
    public static void main(String[] args) {
        String[] str = {"abce","abcd","cdx"};
        String[] str1 = {"sun","bed","car"};
        int n = 2;
        Solution33 so = new Solution33();
        System.out.println(Arrays.toString(so.solution(str1, n)));
        Solution33 soo = new Solution33();
        String[] result =soo.solution(str, n);
        System.out.println(Arrays.toString(result));
    }
}
class Solution33 {
    public String[] solution(String[] str, int n) {
        Arrays.sort(str, new Comparator<String>() {
            //Comparator<>()는 인터페이스임 그래서 재정의 해야함.
            @Override
            public int compare(String o1, String o2) {
                //여러번 호출하면서 인덱스 개수만큼 비교를 하여 정렬함.
                int comparison = Character.compare(o1.charAt(n), o2.charAt(n));
                if(comparison == 0) {
                    return o1.compareTo(o2);
                    //n번째 문자가 동일할 경우 사전순으로 정렬
                }
                return comparison;
            }
        });
        return str;
    }
    public String[] solution1(String[] str, int n) {
        String[] result = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<str.length; i++) {
            arr.add("" + str[i].charAt(n) + str[i]);
            //각 문자열의 n번째 문자와 원래 문자열을 합친 것을 추가함.
        }
        Collections.sort(arr);
        result = new String[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return result;
    }
}