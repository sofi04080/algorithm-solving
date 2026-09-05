import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // Please write your code here.
        int[][] board = new int[2001][2001];

        for(int i = offset(ax1); i < offset(ax2); i++) {
            for(int j = offset(ay1); j < offset(ay2); j++) {
                board[i][j] = 1;
            }
        }

        for(int i = offset(bx1); i < offset(bx2); i++) {
            for(int j = offset(by1); j < offset(by2); j++) {
                board[i][j] = 1;
            }
        }

        for(int i = offset(mx1); i < offset(mx2); i++) {
            for(int j = offset(my1); j < offset(my2); j++) {
                board[i][j] = 2;
            }
        }

        int ans = 0;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) ans++;
            }
        }

        System.out.println(ans);
    }

    static int offset(int num) {
        num += 1000;
        return num;
    }
}