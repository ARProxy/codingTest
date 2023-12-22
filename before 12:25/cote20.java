import java.util.stream.IntStream;

public class cote20 {
    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";

        System.out.println(isNumeric(s1));
        System.out.println(isNumeric(s2));

        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
    public static boolean isNumeric(String str) {
        try {
            IntStream stream = str.chars();
            return stream.allMatch(Character::isDigit);
        } catch(Exception e) {
            return false;
        }
    }
    public static boolean solution(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum++;
            }    
        }
        if(sum == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}
