import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.

        for(int i = 0; i < t; i++) {
            int tTemp = top[n-1];
            int bTemp = bottom[n-1];

            for(int j = n - 1; j > 0; j--) {
                top[j] = top[j-1];
                bottom[j] = bottom[j-1];
            }

            top[0] = bTemp;
            bottom[0] = tTemp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(top[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(bottom[i] + " ");
        }
    }
}