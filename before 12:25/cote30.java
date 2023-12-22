package cote;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class cote30 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        int[][] sort = new int[sizes.length][2];
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                sort[i][0] = sizes[i][1];
                sort[i][1] = sizes[i][0];
            } else if(sizes[i][0] == sizes[i][1]){
                sort[i][0] = sizes[i][1];
                sort[i][1] = sizes[i][0];
            } else {
                sort[i][0] = sizes[i][0];
                sort[i][1] = sizes[i][1];
            }
        }
        int height = IntStream.range(0, sizes.length)
        .map(i -> sort[i][1]).max().orElse(0);
        int width = IntStream.range(0, sizes.length)
        .map(i -> sort[i][0]).max().orElse(0);

        int result = width*height;
        System.out.println(result);

        Solution30 so = new Solution30();
        System.out.println(so.solution30(sizes));
    }
}
class Solution30 {
    public int solution30(int[][] sizes) {
        int length = 0, height = 0;
        for(int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}