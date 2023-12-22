public class cote4 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        Solution so = new Solution();
        Solution1 so1 = new Solution1();
        Solution2 so2 = new Solution2();

        System.out.println(so.solution(s));
        System.out.println(so1.solution(s));
        System.out.println(so2.solution(s));


    }
}
class Solution {
    boolean solution(String s) {
    boolean answer = true;
    String[] str = s.toLowerCase().split("");
    int countP = 0;
    int countY = 0;
    for(int i=0; i<str.length; i++) {
        if(str[i].equals("p")) {
            countP++;
        } else if(str[i].equals("y")) {
            countY++;
        }
        if(countP == countY || (countP == 0 && countY == 0)) {
            answer = true;
        } else {
            answer = false;
        }
    
    }
    return answer;
}
}
class Solution1 {
    boolean solution(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
// 이 코드는 문자열 `s` 내에서 대문자 'P'와 대문자 'Y'의 등장 횟수가 같은지 검사하는 메소드를 담고 있는 `Solution` 클래스입니다. 아래는 각 부분의 설명입니다:

// 1. `class Solution { ... }`: `Solution`이라는 클래스를 선언합니다.
   
// 2. `boolean solution(String s) { ... }`: 문자열 `s`를 인자로 받고, 불리언 값을 반환하는 `solution`이라는 메소드를 선언합니다.

// 3. `s = s.toUpperCase();`: 문자열 `s`의 모든 문자를 대문자로 변환합니다.

// 4. `return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();`: 이 라인은 'P'의 수와 'Y'의 수가 같은지 비교하여 결과를 반환합니다. 상세한 설명은 아래와 같습니다:
   
//    - `s.chars()`: 문자열 `s`의 모든 문자를 스트림 형태로 제공합니다. 이 스트림은 문자열에 있는 각 문자에 대한 정수 (char의 ASCII 코드값) 스트림입니다.
   
//    - `.filter( e -> 'P'== e)`: 스트림에서 람다 표현식 `e -> 'P'== e`를 만족하는 요소만 필터링합니다. 여기서 `e`는 스트림에서의 현재 문자(정수 값)을 나타냅니다.
   
//    - `.count()`: 필터링된 스트림의 요소 수를 계산합니다.

// 이 코드는 두 개의 `count()` 메소드 호출을 사용하여 'P'의 수와 'Y'의 수를 각각 계산하고, 두 수가 같은지 비교하여 결과를 반환합니다.

class Solution2 {
    boolean solution(String s) {
        String lowercased = s.toLowerCase();
        int countP = 0;
        int countY = 0;

        for(char c : lowercased.toCharArray()) {
            if(c == 'p') {
                countP++;
            } else if(c == 'y') {
                countY++;
            }
        }
        return countP == countY;
    }
}

// toCharArray() 메소드를 사용하여 문자열을 문자 배열로 변환한 후, for-each 루프를 사용하여 각 문자를 반복합니다.
// countP와 countY는 반복문 외부에서 초기화되며, 반복문 내에서 증가됩니다.
// 반복문 후에 countP와 countY가 같은지 여부를 반환하여, answer 변수를 완전히 제거하여 코드를 간소화했습니다.