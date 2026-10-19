import java.util.*;
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
		
            int K = sc.nextInt();
            Stack<Integer> receipt = new Stack<>();

            for(int i = 0; i < K; i++) {
                int k = sc.nextInt();
                if(k == 0)
                    receipt.pop();
                else
                    receipt.push(k);
            }
            
            int sum = 0;
            for(int i : receipt) {
                sum += i;
            }
            
            System.out.println("#" + test_case + " " + sum );

		}
	}
}