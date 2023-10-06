import java.util.*;
import java.util.stream.Collectors;

public class cote43 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        int result = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size()<=nums.length/2) {
            result = set.size();
        } else {
            result = nums.length/2;
        }
        
        System.out.println(result);

        Solution43 so = new Solution43();
        System.out.println(so.solution(nums));
    }
}
class Solution43 {
    public int solution(int[] nums) {
        return Arrays.stream(nums).boxed()
        //Arrays.stream(nums) 배열 nums를 스트림으로 변환한다.
        //boxed() 기본 타입의 스트림을 객체 타입의 스트림으로 박싱한다.
        //IntStream ----> Stream<Integer>
        .collect(Collectors.collectingAndThen(Collectors.toSet(),
        //스트림 결과를 어떤 형태로 수집할 것인지 결정하는 메소드.
        //Collectors.collectingAndThen 하나의 수집 과정을 끝낸 후 추가 작업을 할수 있게 해주는 콜렉터
        //먼저 스트림의 요소들을 set에 모아준 후 추가 작업을 지정한다.
        phoneKemons -> Integer.min(phoneKemons.size(), nums.length/2)));
        //두 번째 인자로 함수를 받아 첫 번째 인자로 받은 콜렉터의 결과(Set<Integer>)에 추가 작업을 한다.
        //set의 크기와 배열/2 중 작은 값을 반환한다.
        //플레이어가 가져갈 수 있는 포켓몬의 최대 중 절반을 가져갈 수 있는 조건을 충족시키기 위함.
    }
}