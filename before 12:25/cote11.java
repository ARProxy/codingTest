import java.util.*;
import java.util.stream.IntStream;

public class cote11 {
    public static void main(String[] args) {
       int[] absolutes = {4,7,12};
       boolean[] signs = {true,false,true};
       int result = 0;
       Solution22 so = new Solution22();
       result = so.solution1(absolutes, signs);
       System.out.println(result);
       System.out.println(so.solution22(absolutes, signs)); 
       
    }
}

class Solution22 {
    public int solution22(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length)
                        .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
                        .sum();
    }
    public int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) {
                absolutes[i] = absolutes[i] * (-1);
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
