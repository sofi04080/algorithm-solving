import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        // Please write your code here.

        int sum = 0;
        int[] times;

        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < N; i++) {
            times = new int[1001];
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                for(int k = A[j]; k < B[j]; k++) {
                    times[k] = 1;
                }
            }
            int temp = 0;
            for(int j : times) {
                temp += j;
            }
            max = Math.max(temp, max);
        }
        
        System.out.println(max);
        
    }
}