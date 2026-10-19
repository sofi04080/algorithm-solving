import java.util.Scanner;

public class Main {

    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int[][] square = new int [n][n];

        //  시작점. n 은 홀수가 확정이니까
        int r = n/2, c = n/2;

        // 2차원 배열 모든 칸 채울 때까지
        square[r][c] = 1;
        int count = 2;
        int go = 1;
        int dir = 0; // 우 상 좌 하 순

        while(count <= n*n) {
            outer:for(int i = 0; i < 2; i++) {
                for(int j = 0; j < go; j++ ){
                    r = r + dr[dir];
                    c = c + dc[dir];
                    if(r >= n || c >= n || r < 0 || c < 0) break outer;
                    square[r][c] = count++; 
                }
                dir = (dir + 1) % 4;
            }
            go++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

    }
}