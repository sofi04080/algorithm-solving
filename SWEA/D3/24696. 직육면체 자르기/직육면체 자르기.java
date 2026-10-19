
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
			// 자를 수 있는 최대 횟수 a*b*c - 1
    		// 자를 수 있는 회수가 짝수면 2 홀수면 1
            
            // 각 변 길이
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            
            // 이긴 사람 판별
            if((a*b*c-1)%2 == 0) 
                System.out.println(2);
            else
                System.out.println(1);
		}
	}
}