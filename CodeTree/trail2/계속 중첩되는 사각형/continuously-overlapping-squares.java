import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }
        // Please write your code here.
        int[][] board = new int [201][201];
        boolean isRed = false;
        for(int i = 0; i < n; i++) {
            isRed = !isRed;
            if(isRed) {
                for(int j = x1[i] + 100; j < x2[i] + 100; j++ )
                    for(int k = y1[i] + 100; k < y2[i] + 100; k++)
                        board[j][k] = 1;
            } else {
                for(int j = x1[i] + 100; j < x2[i] + 100; j++ )
                    for(int k = y1[i] + 100; k < y2[i] + 100; k++)
                        board[j][k] = 2;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 2)
                    ans++;
            }
        }

        System.out.println(ans);
    }
}
