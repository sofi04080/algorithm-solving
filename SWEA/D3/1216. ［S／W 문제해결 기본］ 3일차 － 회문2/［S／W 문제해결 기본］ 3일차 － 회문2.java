import java.util.*;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		

		for(int test_case = 1; test_case <= 10; test_case++)
        {
            int T = sc.nextInt();
            
            String[][] tc = new String[100][1];

            for(int i = 0; i < 100; i++) {
                    tc[i][0] = sc.next();
            }
            
            System.out.println("#" + T + " " + Math.max(findRowPal(tc), findColPal(tc)));
        }
	}
    
    // 행 회문 탐색
    static int findRowPal(String[][] arrays) {
        int rowPal = 0;
        for(int i = 0; i < 100; i++) {
            char[] chars = arrays[i][0].toCharArray();
            for(int j = 0; j < 100; j++){
                for(int k = j; k < 100; k++){
                    StringBuilder sb = new StringBuilder();
                    for (int l = j; l <= k; l++) {
                        sb.append(chars[l]);
                    }
                    String s1 = sb.toString();
                    String s2 = sb.reverse().toString();

                    if (s1.equals(s2) && s1.length() > rowPal)
                         rowPal = s1.length();
                }
            }
        }
        return rowPal;
    }

    // 열 회문 탐색
    static int findColPal(String[][] arrays){
        int colPal = 0;
        char[] chars = new char[100];
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                for(int k = 0; k < 100; k++)
                    chars[k] = arrays[k][0].charAt(i);
                for(int l = j; l < 100; l++){
                    StringBuilder sb = new StringBuilder();
                    for (int m = j; m <= l; m++) {
                        sb.append(chars[m]);
                    }
                    String s1 = sb.toString();
                    String s2 = sb.reverse().toString();

                    if (s1.equals(s2) && s1.length() > colPal)
                        colPal = s1.length();
                }
            }
        }
        return colPal;
	}
}