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
        boolean isTrue = false;

        for(int i = 0; i < n; i++) {
            isTrue = false;
            int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                min = Math.max(min, x1[j]);
                max = Math.min(max, x2[j]);
            }

            if(max >= min) {
                isTrue = true;
                break;
            }
        }

        if(isTrue) System.out.print("Yes"); else System.out.print("No");
    }
}