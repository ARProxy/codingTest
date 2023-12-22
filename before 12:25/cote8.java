public class cote8 {
    public static void main(String[] args) {
        int num = 6;
        int result = 0;
        long n = num;
        while(n != 1) {
            if(result >= 500) {
                n = -1;
            }
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n*3 + 1;
            }
            result++;
        }
        System.out.println(result);

        Collatz c = new Collatz();
        int ex = 6;
        System.out.println(c.collatz(ex));
    }
}
class Collatz {
    public int collatz(int num) {
    long n = (long)num;
    for(int i=0; i<500; i++){
        if(n==1) return i; 
      n = (n%2==0) ? n/2 : n*3+1;
    }
        return -1;
    }
}