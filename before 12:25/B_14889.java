package BFBT;

public class B_14889 {
    static int[][] array = {{0,1,2,3,4,5},{1,0,2,3,4,5},{1,2,0,3,4,5},{1,2,3,0,4,5},{1,2,3,4,0,5},{1,2,3,4,5,0}};
    static int n = array.length;
    static int minDiff = Integer.MAX_VALUE;
    public static void main(String[] args) {
        boolean[] startTeam = new boolean[n];
        calculateTeamAbility(0, 0, startTeam);
        System.out.println(minDiff);
    }
    static void calculateTeamAbility(int player, int startCount, boolean[] startTeam) {
        if (player == n) {
            //모든 선수를 고려했을 때, 두 팀의 능력 차이를 계산
            if (startCount == n / 2) {
                //스타트 팀의 선수가 절반인 경우에만 계산
                int startTeamScore = 0;
                int linkTeamScore = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (startTeam[i] && startTeam[j]) {
                            //속하면 스타트
                            startTeamScore += array[i][j];
                        } else if (!startTeam[i] && !startTeam[j]) {
                            //아니면 링크
                            linkTeamScore += array[i][j];
                        }
                    }
                }
                int diff = Math.abs(startTeamScore - linkTeamScore);
                minDiff = Math.min(minDiff, diff);
            }
            return;
        }
        startTeam[player] = true;
        calculateTeamAbility(player + 1, startCount + 1, startTeam);
        //true 면 스타트
        startTeam[player] = false;
        calculateTeamAbility(player + 1, startCount, startTeam);
        //false 면 링크
    }
}

