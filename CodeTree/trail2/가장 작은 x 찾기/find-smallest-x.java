import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;

        for(int i = 1; i <= 10000; i++) {
            int min = 0;
            boolean done = true;
            for(int j = 1; j <= n; j++) {
                int x = (int)Math.pow(2, j) * i;
                if(a[j - 1] > x || x > b[j - 1]) {
                    done = false;
                    break;
                }
            }
            if(done) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}