import java.util.*;

public class cote36 {
    public static void main(String[] args) {
        int[] number = {2,1,3,4,1};

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        //List<Integer> list = Arrays.asList(1,2,3,4,5);
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<number.length; i++) {
            for(int y=i+1; y<number.length; y++) {
                int value = number[i] + number[y];
                set.add(value);
            }
        }
        System.out.println(set);
        int[] result = new int[set.size()];
        int index = 0;

        for(Integer value : set) {
            result[index++] = value;
        }

        System.out.println(Arrays.toString(result));

        Solution36 so = new Solution36();
        System.out.println(so.solution(number));
        System.out.println(Arrays.toString(so.solution1(number)));
        System.out.println(so.solution2(number));
    }
}
class Solution36 {
    public List<Integer> solution(int[] numbers) {
        boolean[] sumResult = new boolean[201];
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                sumResult[numbers[i] + numbers[j]] = true;
            }
        }
        System.out.println(Arrays.toString(sumResult));
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i<sumResult.length; i++) {
            if(sumResult[i]) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public int[] solution1(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        //Integer::intValue는 (integer)->integer.intValue() 같다.
    }

    public ArrayList<Integer> solution2(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        Iterator<Integer> iter = set.iterator();
        //Iterator는 컬렉션의 원소들을 순차적으로 접근하는 인터페이스이다.
        //여기서 set의 원소들을 순회하기 위해 사용한다.
        while(iter.hasNext()) {
            answer.add(iter.next());
        }
        Collections.sort(answer);
        return answer;
    }
}
//Iterator
//컬렉션 프레임워크에 포함된 원소들을 순차적으로 접근하는 방법을 제공하는 인터페이스이다.
//컬렉션의 원소들을 순차적으로 접근하면서 해당 원소를 수정하거나 제거할 필요가 있을 때.
//for-each 루프가 사용될 수 없는 구조적 상황에서 컬렉션의 원소들을 순차적으로 접근할 때.
//최근에는 API를 사용하기 때문에 자주 사용하지 않는다.