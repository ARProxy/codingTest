public class cote17 {
    public static void main(String[] args) {
        int result = 0;

        for(int i = 13; i <= 17; i++) {
            int sum = 0;
            for(int x = 1; x <= i; x++) {
                if(i % x == 0) {
                    sum++;
                }
            }
            if(sum % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        System.out.println(result);

        Solution18 so = new Solution18();
        int left = 13;
        int right = 17;
        System.out.println(so.solution(left, right));
    }
}
class Solution18 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            if(i%Math.sqrt(i)==0) { //제곱수인 경우 약수의 개수가 홀수
                answer -= i;
            } else {    //제곱수가 아닌 경우 약수의 개수가 짝수
                answer += i;
            }
        }
        return answer;
    }
}
