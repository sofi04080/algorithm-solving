
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int T = sc.nextInt();
            
            int[][] ladder = new int[100][100];

            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    ladder[i][j] = sc.nextInt();
                }
            }

            // 시작점 찾기
            int start = 0;
            for(int i = 0; i < 100; i++){
                if(ladder[99][i] == 2){
                    start = i;
                }
            }

            int pos = 99;
            while(pos != 0) {
                if (start - 1 >= 0 && ladder[pos][start - 1] == 1) {
                    while (start - 1 >= 0 && ladder[pos][start - 1] == 1) {
                        start--;
                    }
                    pos--;
                } else if (start + 1 < 100 && ladder[pos][start + 1] == 1) {
                    while (start + 1 < 100 && ladder[pos][start + 1] == 1) {
                        start++;
                    }
                   pos--;
                } else {
                    pos--;
                }
            }

            System.out.println("#" + T + " " + start);

		}
	}
}