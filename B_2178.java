import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//이것은 BFS 넓이 우선 탐색이다
public class B_2178 {
    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int[][] miro = {
            {1,0,1,1,1,1},
            {1,0,1,0,1,0},
            {1,0,1,0,1,1},
            {1,1,1,0,1,1}
        };
        //BFS를 위한 큐
        Queue<Node> queue = new LinkedList<>();
        //이동거리를 기록할 배열
        int[][] distance = new int[n][m];
        //시작점 설정
        queue.add(new Node(0, 0));
        distance[0][0] = 1;
        //BFS
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            //도착점에 도달한 경우
            if(current.x == n - 1 && current.y == m - 1) {
                System.out.print("최단거리 : " + distance[n-1][m-1]);
                return;
            }
            //상하좌우
            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};

            for(int i=0; i<4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                //미로 내부에 있고, 이동 가능한 칸인지 확인
                if(nx>=0&&ny>=0&&nx<n&&ny<m&&miro[nx][ny]==1&&distance[nx][ny]==0) {
                    queue.add(new Node(nx, ny));
                    distance[nx][ny] = distance[current.x][current.y] + 1;
                }
            }
        }
        System.out.println("도착점에 도달 못함");
    }
}
//    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
//    //상 하 우 좌
//
//    int result = findShortestPath(n,m,miro,directions);
//        System.out.println(result);
//static int findShortestPath(int n, int m, int[][] miro, int[][] directions) {
//        int[][] distance = new int[n][m];
//        Queue<int[]> queue = new LinkedList<>();
//
//        for(int i=0; i<n; i++) {
//        for(int j=0; j<m; j++) {
//        distance[i][j] = -1;
//        }
//        }
//        //모든 셀의 거리를 -1로 설정하여 방문하지 않음을 나타냄
//        //BFS알고리즘 시작 준비
//
//        distance[0][0] = 1;
//        //거리의 시작점을 1로 설정
//        queue.offer(new int[]{0, 0});
//        //시작점을 큐에 추가
//
//        while(!queue.isEmpty()) {
//        //큐가 비어 있지 않은 동안에는 다음 단계 수행
//        int[] current = queue.poll();
//        //큐에서 현재 탐색 중인 셀을 꺼내서 배열에 저장
//        int x = current[0];
//        int y = current[1];
//
//        for(int[] dir : directions) {
//        int newX = x + dir[0];
//        int newY = y + dir[1];
//
//        if (newX >= 0 && newX < n && newY >= 0 && newY < m && miro[newX][newY] == 1 && distance[newX][newY] == -1) {
//        distance[newX][newY] = distance[x][y] + 1;
//        queue.offer(new int[]{newX, newY});
//        }
//        }
//        }
//        return distance[n-1][m-1];
//        }