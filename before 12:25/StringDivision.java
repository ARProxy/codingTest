public class StringDivision {
    public static void main(String[] args) {

        String s = "abracadabra";

        Solution so = new Solution();
        int result = so.solution(s);

        System.out.println(result);

    }
}
class Solution {
    public int solution(String  s) {
        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for(int i=0; i<s.length(); i++) {
            if(firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if(s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return result++;
    }
}