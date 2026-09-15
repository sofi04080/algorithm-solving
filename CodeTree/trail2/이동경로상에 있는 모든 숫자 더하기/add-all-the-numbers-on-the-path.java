import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        // 상하좌우
        int [] dr = {-1, 0, 1, 0};
        int [] dc = {0, 1, 0, -1};

        // 방향 변수, 0부터 상, 우, 하, 좌
        int dir = 0;

        char[] command = commands.toCharArray();

        int row = n/2, col = n/2; 

        int ans = board[row][col];

        for(int i = 0; i < command.length; i++) {
            if(command[i] == 'L') {
                dir = (dir + 3) % 4;
            } else if (command[i] == 'R') {
                dir = (dir + 1) % 4;
            } else if (command[i] == 'F') {
                if(row + dr[dir] < n && row + dr[dir] >= 0 && col + dc[dir] < n && col + dc[dir] >= 0){
                    row += dr[dir];
                    col += dc[dir]; 
                    ans += board[row][col];
                }
            }
        }
        System.out.println(ans);
    }
}