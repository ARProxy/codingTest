public class cote48 {
    public static void main(String[] args) {
        int n = 10;

        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        boolean[] prime = new boolean[n+1];
        //prime 배열은 각 인덱스의 숫자가 소수인지 아닌지를 나타냄. 초기값은 false

        //초기값 설정: 모든 값을 소수로 가짐
        for(int i=2; i<=n; i++) {
            prime[i] = true;
            //처음에는 모든 숫자를 소수로 가정하고 prime 배열의 값을 true로 설정.
        }

        //에라토스테네스의 체
        for(int i=2; i*i<=n; i++) {
            //i*i<=n 인 이유는 i의 제곱 값이 n을 초과하면 그보다 큰 i의 배수는 이미 이전 단계에서 지워짐.
            if(prime[i]) {  //i가 소수인 경우
                for(int j=i*i; j<=n; j+=i) {
                    prime[j] = false;   //i의 배수를 모두 제거
                }
            }
        }

        int count = 0;
        for(int i=2; i<=n; i++) {
            if(prime[i]) count++;
        }
        //반복적인 소수 판별을 피하면서 주어진 범위 내에 모든 소수를 효과적으로 찾을 수 있다.
        return count;
    }
}
//에라토스테네스의 체는 소수를 찾기 위한 가장 오래된 알고리즘이며, 주어진 범위 내에서 모든 소소를
//효과적으로 찾을 수 있다.
//1 - 2부터 n까지의 모든 숫자를 적는다.
//2 - 아직 지워지지 않은 숫자 중 가장 작은 수를 찾는다.
//3 - 그 소수의 모든 배수를 지운다.
//4 - 모든 숫자가 지워질 때까지 2번 3번 단계를 반복.