package swea;

import java.util.*;

public class Fly_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			// 풀이
			// N*N 배열 안에서 M*M 공간 안에 있는 수들의 합이 가장 큰 
			// 경우 찾기
			// 모두 탐색 후 더해가면서 일일이 값 비교..? 
			int N = sc.nextInt();
			int M = sc.nextInt();
			int MAX = N - (M - 1);
			int[][] flies = new int[N][N];
			int[][] tool = new int [M][M];
			
			// 배열 값 입력받기
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					flies[i][j] = sc.nextInt();
				}
			}
			
		
			int maxFlies = 0;
			
			// 실질 탐색 범위
			// 4중 for문?
			for(int i = 0; i < MAX; i++) {
				for(int j = 0; j < MAX; j++) {
					int sum = 0;
					for(int k = 0; k < M; k++) {
						for(int l = 0; l < M; l++) {
							sum += flies[i+k][j+l];
							if(sum > maxFlies) {
								maxFlies = sum;
							}
						}
					}
				}
			}
		
			// 결과 출력
			System.out.println("#" + test_case + " " + maxFlies);
		}
	}
}
