
public class cote5 {
    public static void main(String[] args) {
        long n = 121;
        double i = Math.sqrt(n);
        long result = Math.floor(i) == i ? (long)Math.pow(i+1, 2) : -1;
        System.out.println(result);

        double sqrt = Math.sqrt(n);
        long result1 = sqrt==(int)sqrt ? (long)Math.pow(sqrt+1, 2) : -1;
        System.out.println(result1);

        long result2 = -1;
        if(sqrt == (int)sqrt) {
            result2 = (long)Math.pow(sqrt+1, 2);
        }
        System.out.println(result2);
    }
}

// class Solution {
//     public long solution(long n) {
//         double i = Math.sqrt(n);
//         return Math.floor(i) == i ? (long)Math.pow(i+1, 2) : -1;
//     }
// }
// class Solution1 {
//     public long solution1(long n) {
//         double sqrt = Math.sqrt(n);
//         if(sqrt == (int)sqrt) {
//             return (long)Math.pow(sqrt+1, 2);
//         } else {
//             return -1;
//         }
//     }
// }
// class Solution2 {
//     public long solution2(long n) {
//         double sqrt = Math.sqrt(n);
//         return sqrt==(int)sqrt ? (long)Math.pow(sqrt+1, 2) : -1;
//     }
// }