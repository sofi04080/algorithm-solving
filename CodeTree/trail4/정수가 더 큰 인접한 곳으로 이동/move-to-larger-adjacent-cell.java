import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        static int[] dx = {-1, 1, 0, 0};
        static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] grid = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // Please write your code here.

        List<Integer> ans = new ArrayList<>();
        ans.add(grid[r][c]);
        int compare = 0;
        while(compare != grid[r][c]){
            compare = grid[r][c];
            for(int i = 0; i < 4; i++) {
                if(r + dx[i] > 0 && r + dx[i] <= n && c + dy[i] > 0 && c + dy[i] <= n){
                    int temp = grid[r + dx[i]][c + dy[i]];
                    if(temp > compare) {
                        r = r + dx[i];
                        c = c + dy[i];
                        ans.add(grid[r][c]);
                        break;
                    }
                }
            }
        }

        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}