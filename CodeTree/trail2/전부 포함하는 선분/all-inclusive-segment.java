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
        int max = 0;
        int min = 1000;
        int maxIdx = 0;
        int minIdx = 0;

        for(int i = 0; i < n; i++) {
            if(max < x2[i]){
                max = x2[i];
                maxIdx = i;
            }
            if(min > x1[i]) {
                min = x1[i];
                minIdx = i;
            }
        }

        max = 0;
        min = 1000;

        int ifMax = 0, ifMin = 0;

        for(int i = 0; i < n; i++) {
            if(i == maxIdx) continue;
            min = Math.min(min, x1[i]);
            max = Math.max(max, x2[i]);  
            ifMax = max - min;  
        }

        max = 0;
        min = 1000;

        for(int i = 0; i < n; i++) {
            if(i == minIdx) continue;
            min = Math.min(min, x1[i]);
            max = Math.max(max, x2[i]);    
            ifMin = max - min;
        }

        

        System.out.print(Math.min(ifMax, ifMin));
    }
}
