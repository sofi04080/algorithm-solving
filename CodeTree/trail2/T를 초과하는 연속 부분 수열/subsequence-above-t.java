import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int max = 0;
        for(int i = 0 ; i < n ; i++) {
            int ans = 0;
            if(arr[i] > t){
                int j = i;
                while(j < n && arr[j] > t) {
                    j++;
                    ans++;
                }
                if( ans > max)
                    max = ans;
            } 
        }
        
        System.out.print(max);
    }
}