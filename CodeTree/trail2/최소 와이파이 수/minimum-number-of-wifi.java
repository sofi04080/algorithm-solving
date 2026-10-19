import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                i += m * 2;
                count++;
            }
        }

        System.out.print(count);
    }
}