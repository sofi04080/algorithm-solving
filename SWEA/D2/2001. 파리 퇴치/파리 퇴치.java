
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt(), M = sc.nextInt();
            int[][] flies = new int[N][N];
            
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++) {
                    flies[i][j] = sc.nextInt();
                }
            }
            
            // 파리 수 구하기
            int max = 0;
            for(int i = 0; i < N - (M - 1); i++){
                for(int j = 0; j < N - (M - 1); j++) {
                    int flySum = 0;
                    for(int k = 0; k < M; k++){
                        for(int l = 0; l < M; l++){
                            flySum += flies[i+k][j+l];
                            if(flySum > max)
                                max = flySum;
                        }
                    }
                    
                }
            }
            
            System.out.println("#" + test_case + " " + max);
		}
	}
}