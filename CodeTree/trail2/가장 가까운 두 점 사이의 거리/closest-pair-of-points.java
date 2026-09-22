import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.

        int minDis = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
                if(minX > Math.abs(x[i] - x[j])) minX = Math.abs(x[i] - x[j]);
                if(minY > Math.abs(y[i] - y[j])) minY = Math.abs(y[i] - y[j]);

                if(minDis > minX * minX + minY * minY) minDis = minX * minX + minY * minY;
            }
        }

        System.out.println(minDis);
    }
}