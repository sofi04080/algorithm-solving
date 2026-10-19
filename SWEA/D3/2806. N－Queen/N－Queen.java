import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        // 내용은 알겠는데 뭔가 깔끔하진 않네

		for(int test_case = 1; test_case <= T; test_case++)
		{
			BackTracking bt = new BackTracking();
        	bt.N = sc.nextInt();
            bt.board = new int[bt.N][bt.N];
        	bt.backTracking(0);

        	System.out.println("#" + test_case + " " + bt.ans);
		}
	}
}

class BackTracking {
    int N;
    int ans;
    int[][] board;

    void backTracking(int row) {
        if(row == N) {
            ans++;
            return;
        }

        for(int col = 0; col < N; col++){
            if(isPossible(row, col)) {
                board[row][col] = 1;
                backTracking(row+1);
                board[row][col] = 0;
            }
        }
    }

    boolean isPossible(int row, int col) {
        // 위
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 1)
                return false;
        }
        // 왼쪽 위
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 1)
                return false;
        }
        // 오른쪽 위
        for (int r = row - 1, c = col + 1; r >= 0 && c < N; r--, c++) {
            if (board[r][c] == 1)
                return false;
        }
        return true;
    }
}