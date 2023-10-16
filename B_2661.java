import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2661 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ss = "123123";
        System.out.println(ss.substring(ss.length()-2*2, ss.length()-2));
        goodSequence(N, "");
    }

    public static boolean badSequence(String sequence) {
        int length = sequence.length();
        for(int i=1; i<=length/2; i++) {
            //길이를 반으로 나누는 이유는 부분 수열의 개수는 2^N개 이기 때문(시간 복잡도 줄이기)
            String suffix = sequence.substring(length - i);
            String preSubString = sequence.substring(length - 2*i, length - i);
            if(suffix.equals(preSubString)) {
                return true;
            }
        }
        return false;
    }

    public static void goodSequence(int N, String sequence) {
        if(N == 0) {
            System.out.println(sequence);
            System.exit(0);
            //재귀함수 종료, 무한 루프에 빠질수 있음
        }

        for(char digit : "123".toCharArray()) {
            String newSequence = sequence + digit;
            if(!badSequence(newSequence)) {
                goodSequence(N - 1, newSequence);
            }
        }
    }
}
