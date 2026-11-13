import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {

    static int n, m;
    static final int INF = Integer.MAX_VALUE;
    static List<List<Node>> graph;
    static int[] dist;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점, 간선
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 거리, 방문 초기화
        dist = new int[n + 1];
        visited = new boolean[n + 1];

        // 그래프 초기화
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            // 모든 학생에 대하여 최대 거리 구하니까 간선 방향 뒤집어서
            graph.get(b).add(new Node(a, d));
        }

        // Please write your code here.
        Arrays.fill(dist, INF);

        dijkstra(n);

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(dist[i], max);
        }

        System.out.print(max);
    }

    static void dijkstra(int start) {
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            if (visited[curr.index]) continue;
            visited[curr.index] = true;

            for (Node next : graph.get(curr.index)) {
                if (dist[next.index] > curr.cost + next.cost) {
                    dist[next.index] = curr.cost + next.cost;
                    pq.offer(new Node(next.index, dist[next.index]));
                }
            }
        }

    }

    static class Node implements Comparable<Node> {
        int index;
        int cost;

        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
}
