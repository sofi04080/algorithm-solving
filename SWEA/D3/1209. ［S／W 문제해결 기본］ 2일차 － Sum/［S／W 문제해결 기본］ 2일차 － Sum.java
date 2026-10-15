
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int T;
			T=sc.nextInt();
			int max = 0;
            int[][] arr = new int[100][100];
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0; i < 100; i++) {
                int sum = 0; 
                for(int j = 0; j < 100; j++) {
                    sum += arr[i][j];
                    max = Math.max(sum, max);
                }
            }
            
            for(int i = 0; i < 100; i++) {
                int sum = 0; 
                for(int j = 0; j < 100; j++) {
                    sum += arr[j][i];
                    max = Math.max(sum, max);
                }
            }
            int sum = 0;     
            for(int i = 0; i < 100; i++) {
            	sum += arr[i][i];
            }
            max = Math.max(sum, max);
                
            sum = 0;
            for(int i = 99; i >= 0; i--) {
                sum += arr[i][99-i];
            }
            max = Math.max(sum, max);
                
            System.out.println("#" + test_case + " " + max);
		
        }
	}
}