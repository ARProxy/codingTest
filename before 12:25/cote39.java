import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class cote39 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        int[][] updatedPhoto = new int[photo.length][];

        for (int i = 0; i < photo.length; i++) {
            updatedPhoto[i] = new int[photo[i].length];
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    updatedPhoto[i][j] = map.get(photo[i][j]);
                } else {
                    updatedPhoto[i][j] = 0;
                }
            }
        }
        int[] result = new int[photo.length];
        for(int i=0; i<updatedPhoto.length; i++) {
            result[i] = Arrays.stream(updatedPhoto[i]).sum();
            //sum()을 계산하기 전에 배열 원소를 스트림으로 변환해야 한다.
        }
        System.out.println(Arrays.toString(result));
    }
}
