package swea;

import java.util.Scanner;

public class Snail_1954 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int SIZE = sc.nextInt();
			int[][] snail = new int[SIZE][SIZE];
			int num = 1;
			int start = 0;
			// 0,0 시작해서 0, SIZE 까지
			int N = SIZE - 1;
			while (start <= N) {
				// 0, 0 시작해서 0, SIZE까지
				for (int i = start; i < SIZE - start; i++) {
					snail[start][i] = num++;
				}
				// 0, SIZE 시작해서 SIZE, SIZE 까지
				for (int i = start + 1; i < SIZE - start; i++) {
					snail[i][N] = num++;
				}

				// SIZE, SIZE 시작해서 SIZE, 0 까지
				for (int i = N; i > 0 + start; i--) {
					snail[N][i-1] = num++;
				}
				// SIZE, 0 에서 시작해서 1, 0 까지
				for (int i = N - 1; i > 0 + start; i--) {
					snail[i][start] = num++;
				}
				// 변수들 더해주기
				N--;
				start++;
			}
			System.out.println("#" + T);
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
