import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        // Please write your code here.

        int max = Integer.MIN_VALUE;
            for(int j = -10; j <= 1010; j++) {
                int work = 0;
                for(int k = 0; k < n; k++) {
                    if(ta[k] <= j && j <= tb[k]) work += g;
                    else if (j < ta[k]) work += c;
                    else if (j > tb[k]) work += h;
                }
                max = Math.max(work, max);
            }
        
        System.out.print(max);
    }
}