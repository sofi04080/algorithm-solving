import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int board[][] = new int[201][201];

        for(int i = 0; i < n; i++) {
            for(int j = x[i] + 100; j < x[i] + 108; j++){
                for(int k = y[i] + 100; k < y[i] + 108; k++ )
                {
                    board[j][k] = 1;
                }
            }
        }

        int ans = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1)
                    ans++;
            }
        }

        System.out.println(ans);
    }
}