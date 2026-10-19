import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        // Please write your code here
        int[] aTime = new int[1000001];
        int[] bTime = new int[1000001];

        int aPos = 0, bPos = 0, aNTime = 0, bNTime =0;;
        
        // 가지고 있는 건 몇 초에 누가 어디에 있는지 
        for(int i = 0; i < n; i++) { 
            for(int j = 1; j <= A[i][1]; j++) {
                aPos += A[i][0];
                aTime[++aNTime] = aPos;
            }
        }

        for(int i = 0; i < m; i++) { 
            for(int j = 1; j <= B[i][1]; j++) {
                bPos += B[i][0];
                bTime[++bNTime] = bPos;
            }
        }

        int count = 0;
        char checking = '?';

        for(int i = 1; i < aTime.length; i++) {
            if(aTime[i] == 0 && bTime[i] == 0) break;

            // 현재 상태 저장
            char curr;
            if (aTime[i] > bTime[i]) curr = 'A';
            else if (aTime[i] < bTime[i]) curr = 'B';
            else curr = 'S';

            if(checking == '?') {
                if(curr != 'S')
                    checking = curr;
            } else {
                if( curr != 'S' && curr != checking)
                count++;
                checking = curr;
            }
        }
        System.out.println(count);
    }
}