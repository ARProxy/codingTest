import java.util.Stack;

public class P_right {
    public static void main(String[] args) {
        String s = "()()";
        String s1 = ")()(";

        Solution soo = new Solution();
        System.out.println(soo.solution01(s));
        System.out.println(soo.solution01(s1));

        System.out.println(soo.solution02(s));
        System.out.println(soo.solution02(s1));
    }
}
class Solution {
    boolean solution01(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else if(s.charAt(i) == ')') {
                if(count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }
    boolean solution02(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}