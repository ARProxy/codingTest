// import java.util.*;

// public class cote37 {
//     public static void main(String[] args) {
//         int[] food = {1,3,4,6};
//         int[] digit = new int[food.length - 1];
//         int[] digit1 = digit;
//         String result = "";
//         String result2 = "";
//         String answer = "";
//         for(int i=1; i<food.length; i++) {
//             digit[i-1] = (int)Math.ceil(food[i]/2);
//             for(int y=1; y<=digit[i-1]; y++) {
//                 result += String.valueOf(i);
//             }
//         }
//         List<Integer> list = new ArrayList<>();
//         for(int i=0; i<digit.length; i++) {
//             list.add(digit[i]);
//         }
//         Collections.reverse(list);
        
//         for(int i=digit1.length; i>=1; i--) {
//             for(int y=digit1[digit1.length - i]; y>=1; y--) {
//                 result2 += String.valueOf(i);
//             }
//         }

//         answer = result + "0" + result2;
//         System.out.println(answer);
//     }
// }
import java.util.*;

public class cote37 {
    public static void main(String[] args) {
        int[] food = {1,7,1,2};
        int[] digit = new int[food.length - 1];
        String result = "";
        String result2 = "";
        String answer = "";
        
        for(int i=1; i<food.length; i++) {
            digit[i-1] = (int)Math.ceil(food[i]/2);
            for(int y=1; y<=digit[i-1]; y++) {
                result += String.valueOf(i);
            }
        }
        
        for(int i=digit.length - 1; i>=0; i--) {
            for(int y=1; y<=digit[i]; y++) {
                result2 += String.valueOf(i + 1);
            }
        }

        answer = result + "0" + result2;
        System.out.println(answer);
    }
}
