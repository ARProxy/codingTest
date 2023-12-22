public class cote1 {
    public static void main(String[] args) {
        Test test = new Test();
        int result = test.Solution(1234);
        System.out.println("result : " + result);
    }
}
class Test {
    public int Solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i+1));
        }

        return answer;
    }
    
}

//test
