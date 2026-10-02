import java.util.Scanner;

public class Main {
    static int n, m, sum, count;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int max = 0;

        for(int i = 1; i <= n; i++) {
            count = 0;
            sum = 0;
            int curr = i;

            for (int step = 0; step < m; step++) {
                sum += arr[curr];
                curr = arr[curr];
            }

            max = Math.max(max, sum);
        }

        System.out.print(max);
    }

}