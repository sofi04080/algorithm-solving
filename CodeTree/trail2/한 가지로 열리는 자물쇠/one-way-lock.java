import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        int total = n * n * n;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++) {
                    if( Math.abs(a - i) > 2 && Math.abs(b - j) > 2 && Math.abs(c - k) > 2)
                        total--;
                }
            }
        }
        
        System.out.print(total);
    }
}