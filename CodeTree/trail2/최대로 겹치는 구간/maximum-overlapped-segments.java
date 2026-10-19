import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] offset = new int[200];

        for(int i = 0; i < n; i++){
            int start = x1[i] + 100;
            int end = x2[i] + 100;
            for(int j = start; j < end; j++ ){
                offset[j]++;
            }
        }

        int max = 0;
        for(int i : offset) {
            if(i > max)
                max = i;
        }
        System.out.println(max);
    }
}