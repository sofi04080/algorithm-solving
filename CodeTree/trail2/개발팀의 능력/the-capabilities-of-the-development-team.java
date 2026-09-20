import java.util.Scanner;
public class Main {
    static int[] programmer;
    static int min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        // Please write your code here.

        programmer = new int[] {a, b, c, d, e};
        min = Integer.MAX_VALUE;
        int total = 0;
        
        for(int i = 0; i < programmer.length; i++){
            total += programmer[i];
        }

        for(int i = 0; i < programmer.length; i++) {
            for(int j = i + 1; j < programmer.length; j++ ){
                int sum = programmer[i] + programmer[j];
                for(int k = 0; k < programmer.length; k++) {
                    for(int h = k + 1; h < programmer.length; h++) {
                        if(k == i || k == j || h == i || h == j) continue;
                        int sum2 = programmer[h] + programmer[k];
                        int last = total - sum - sum2;
                        if(sum == sum2 || sum == last || sum2 == last) {
                            continue; 
                        }
                        int diff = Math.max(sum, Math.max(sum2, last)) - Math.min(sum, Math.min(sum2, last));
                        if(min > diff) min = diff;
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}