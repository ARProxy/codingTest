import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//깊이 우선 탐색
public class B_24480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        //정수 배열 리스트의 배열을 생성, 노드 간의 연결 정보를 저장할 목적으로 사용
        //N+1을 하는 이유는 노드는 1부터 시작하기 때문
        boolean[] visited = new boolean[N + 1];
        //노드 방문 여부를 저장하는 배열을 생성
        int[] order = new int[N + 1];
        //각 노드의 방문 순서를 저장하는 배열을 생성
        int orderCounter = 1;
        //방문 순서를 나타내는 변수를 초기화

        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }//graph 배열의 각 요소를 초기화, 각 노드에 대한 연결된 노드의 리스트를 생성

        for(int i=0; i<M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
//            int u = 1;
//            int v = 2;
//            graph[u].add(v); // u와 v를 연결
//            graph[v].add(u); // v와 u를 연결 (무방향 그래프이므로 양방향으로 연결)
        }//M번 반복을 통해 간선 정보를 입력받고, 그래프의 각 노드에 연결된 다른 노드들을 저장한다.

        for(int i=1; i<=N; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }//각 노드에 연결된 노드 리스트를 내림차순으로 정렬한다.

        dfs(R, visited, graph, order, orderCounter);
        //dfs 함수를 호출하여 깊이 우선 탐색을 시작한다.
        //시작 노드 R과 방문 여부, 그래프 정보, 방문 순서를 저장할 배열, 그리고 방문 순서를 나타내는 변수를 전달
        for(int i=1; i<=N; i++) {
            System.out.println(order[i]);
        }//각 노드의 방문 순서를 출력한다.
    }
    static void dfs(int v, boolean[] visited, ArrayList<Integer>[] graph, int[] order, int orderCounter) {
        visited[v] = true;
        //현재 노드 v를 방문했음을 표시한다.
        order[v] = orderCounter;
        //현재 노드의 방문 순서를 order 배열에 저장한다.

        for(int next : graph[v]) {
            if(!visited[next]) {
                dfs(next, visited, graph, order, orderCounter + 1);
            }
        }//현재 노드와 연결된 다음 노드에 대해 dfs를 재귀적으로 호출한다. 이미 방문한 노드는 건너뛰고, 방문 순서를 1 증가시킨다.
    }
}
