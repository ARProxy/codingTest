import java.util.*;
import java.util.stream.IntStream;

public class cote26 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        int[] arr1 = {2,2,3,3};
        int budget = 9;
        int budget1 = 10;
        int sum = 0;
        int result = 0;
        Arrays.sort(arr1);
        
        for(int i=0; i<arr1.length; i++) {
            sum += arr1[i];
            if(sum == budget1) {
                result = i+1;
                break;
            } else if(sum > budget1) {
                result = i;
                break;
            } else if(sum < budget1) {
                result = arr1.length;
                //모든 요소의 합이 budget을 초과하지 않는 경우
                //모든 부서를 지원할 수 있음
                //이 부분을 놓쳤다..
            }
        }
        System.out.println(result);
    }

}
