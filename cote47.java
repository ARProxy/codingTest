public class cote47 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        Solution47 so = new Solution47();
        System.out.println(so.solution(nums));
    }
}

class Solution47 {
    public int solution(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length - 2; i++) {
            for(int j=i+1; j<nums.length - 1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public boolean isPrime(int num) {
        if(num <= 1) return false;
        //소수는 2 이상의 자연수 중에서 1과 자기 자신 외의 수로 나누어지지 않는 수를 의미.
        //따라서 1 이하의 수는 소수가 아님.
        if(num == 2) return true;
        //2는 소수, 반복문을 2부터 시작할거임.

        int sqrt = (int)Math.sqrt(num);
        //소수 판별할 때 모든 수로 나누어 볼 필요 없음. num의 약수 중에서 가장 큰 약수가 num의 제곱근
        //보다 클 경우, 그것의 쌍이 되는 작은 약수는 반드시 num의 제곱근보다 작기 때문.
        //double result = Math.sqrt(4); == 2.0
        for(int i=2; i<=sqrt; i++) {
            if(num%i==0) return false;
            //만약 num이 i로 나누어 떨어지면 num은 소수가 아님.
        }
        return true;
        //어떤 수로도 나누어 떨어지지 않았다면 num은 소수다.
    }
}
