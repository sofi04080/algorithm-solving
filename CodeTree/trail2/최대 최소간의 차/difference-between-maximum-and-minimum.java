import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        int ans = Integer.MAX_VALUE;

        for(int i = min; i <= max; i++ ) {
            // i 가 최솟값일 때 변경해야 할 수
            int diff = 0;
            for(int j : arr) {
                if(j == i) continue;
                else if (j > i) {
                    diff += Math.abs(j - i);
                }
                else if (j < i && (i - j) > k) {
                    diff += Math.abs((i - j) - k);
                }
            }

            ans = Math.min(ans, diff);
        }

        System.out.print(ans);
        
    }
}