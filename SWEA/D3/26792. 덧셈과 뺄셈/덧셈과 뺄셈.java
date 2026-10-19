
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
            // a = (x+y)/2, b = (x-y)/2
            int x = sc.nextInt(), y = sc.nextInt();
            int a = (x+y)/2;
            int b = (x-y)/2;

            System.out.println( a + " " + b);
		}
	}
}