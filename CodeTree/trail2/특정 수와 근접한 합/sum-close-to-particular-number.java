import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        int diff = Integer.MAX_VALUE;

        for(int i =0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = sum - arr[i] - arr[j];
                diff = Math.abs(temp - s) < diff ? Math.abs(temp - s) : diff;
            }
        }

        System.out.println(diff);
    }
}