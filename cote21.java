import java.util.Arrays;

public class cote21 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int y=0; y<arr1[i].length; y++) {
                answer[i][y] = arr1[i][y] + arr2[i][y];
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}
