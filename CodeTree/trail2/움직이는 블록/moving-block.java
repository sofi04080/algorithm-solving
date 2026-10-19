import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int objective = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            objective += blocks[i];
        }
        // Please write your code here.
        objective /= n;

        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += Math.abs(blocks[i] - objective);
        }

        System.out.print(ans/2);
    }
}