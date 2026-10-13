import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) { 
            int diff = arr[n + i] - arr[i];
            min = Math.min(min, diff);
        }

        System.out.print(min);
    }
}

