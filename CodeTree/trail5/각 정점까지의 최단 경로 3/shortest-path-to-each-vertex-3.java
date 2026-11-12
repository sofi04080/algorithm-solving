import java.util.*;
import java.util.Scanner;

public class Main {
    static List<List<Node>> graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Node(v, w));
        }

        // Please write your code here.
        // 다익스트라
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // 최소 거리, 방문 체크
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        // 시작 설정
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        pq.offer(new Node(1, 0));

        while (!pq.isEmpty()) {

            int now = pq.poll().index;

            // 방문처리
            if (visited[now]) continue;
            visited[now] = true;

            for (Node next : graph.get(now)) {
                if (dist[next.index] > dist[now] + next.cost) {
                    dist[next.index] = dist[now] + next.cost;
                    pq.offer(new Node(next.index, dist[next.index]));
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(dist[i] == Integer.MAX_VALUE ? -1 : dist[i]);
        }

    }

    // 그래프 노드
    static class Node implements Comparable<Node> {
        int index;
        int cost;

        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }
}
