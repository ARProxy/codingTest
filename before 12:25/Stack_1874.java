import java.util.*;

public class Stack_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        int num = 1;
        boolean isPossible = true;

        for(int i=0; i<n; i++) {
            while(num <= list.get(i)) {
                stack.push(num++);
                sb.append("+\n");
            }
            if(Objects.equals(stack.peek(), list.get(i))) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if(isPossible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
