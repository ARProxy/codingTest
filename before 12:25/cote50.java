

package cote;

public class cote50 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};

        Solution50 so = new Solution50();
        System.out.println(so.solution(n, m, section));
    }
}
class Solution50 {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int ans = 1;
            
        for(int i : section){
            if(i>=start && i<=end)
                continue;
            else{
                start = i;
                end = i + (m-1);
                ans++;
            }
            
        }
        return ans;
    }
}
// start와 end 변수를 초기화합니다.
//  이 변수들은 현재 롤러로 페인트를 칠고 있는 구역의 시작과 끝을 나타냅니다.
//   초기값으로 section 배열의 첫 번째 원소로 설정됩니다.
// ans 변수는 최소 롤러 사용 횟수를 나타냅니다. 초기값은 1로 설정됩니다.
//  이는 첫 번째 구역을 롤러로 칠 때 필요한 횟수를 의미합니다.
// for-each 루프를 사용하여 section 배열을 순회합니다. 각 구역을 i로 가져옵니다.
// 현재 구역 i가 현재 칠하고 있는 구역의 범위인 start와 end 사이에 포함되면,
//  롤러로 칠하는 작업을 계속 진행합니다. 그래서 continue 명령문이 사용됩니다.
// 그렇지 않으면 (현재 구역이 이전 구역과 겹치지 않는 경우), 현재 구역을 다시 칠해야
//  하므로 start와 end를 업데이트하고 ans를 증가시킵니다. start는 현재 구역의 시작으로 설정되고
//  , end는 현재 구역의 끝으로 설정됩니다.
// 모든 구역에 대한 루프가 종료되면 ans에는 최소 롤러 사용 횟수가 포함됩니다.