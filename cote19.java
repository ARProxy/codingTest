public class cote19 {
 public static void main(String[] args) {
    int price = 3;
    int money = 20;
    int count = 4;
    int result = 0;
    int sum = 0;

    for(int i=1; i<=count; i++) {
        result = i*price;
        sum += result;    
    }
    if((money - sum) < 0) {
        int answer = money - sum;
        System.out.println(answer*-1);
    } else {
        System.out.println(0);
    }
    Solution19 so = new Solution19();
    System.out.println(so.solution(price, money, count));
    }    
}  
class Solution19 {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
