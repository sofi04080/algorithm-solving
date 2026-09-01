
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
			char[] batch = sc.next().toCharArray();
            Stack<Integer> stack = new Stack<>();

            System.out.println("#" + test_case + " " + find(batch, stack));
		}
	}
    
    private static int find(char[] batch, Stack<Integer> stack) {
        int ans = 0;
        for(int i = 0; i < batch.length; i++) {
            if(batch[i] == '(') {
                stack.push(i);
            } else {
                if(batch[i-1] == '('){
                    stack.pop();
                    ans += stack.size();
                } else {
                    stack.pop();
                    ans +=1;
                }
            }
        }
        return ans;
    }
}