public class P_NumberExpress {
    public static void main(String[] args) {
        int n = 15;
        int result = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int y=i; y<=n; y++) {
                sum += y;
                if(sum == n) {
                    result++;
                } else if(sum > 15) {
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
