public class cote6 {
    public static void main(String[] args) {
        int x = 11;
        int y = 18;
        int result = 0;
        String[] x1 = String.valueOf(x).split("");

        for(int i=0; i<x1.length; i++) {
            result += Integer.valueOf(x1[i]);
        }
        if(x%result == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        int sum = String.valueOf(y).chars().map(ch -> ch - '0').sum();
        System.out.println(y%sum==0);

        // String.valueOf(y): 숫자 y를 문자열로 변환합니다. 예를 들어, y가 123이라면 "123"이라는 문자열을 얻게 됩니다.
        // .chars(): 문자열에서 각 문자를 int 형태로 표현하는 스트림을 생성합니다. 이 때, 각 문자는 해당 문자의 유니코드 값을 나타냅니다.
        // .map(ch -> ch - '0'): 스트림의 각 요소(문자)에 대해, '0' 문자의 유니코드 값을 빼서 실제 정수 값을 얻습니다. 예를 들어, 문자 '1'의 유니코드 값은 49이므로, '1' - '0' = 49 - 48 = 1을 얻게 됩니다.
        // .sum(): 스트림의 모든 요소의 합을 계산합니다. 여기서는 변환된 정수 값들의 합을 구합니다.
    }
}
