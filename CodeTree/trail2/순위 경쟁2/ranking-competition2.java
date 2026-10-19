import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0;
        int count = 0;
        int[] last = {1, 1};
        int[] hof = new int[2]; 

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if(c == 'A') {
                a += s;
            } else {
                b += s;
            }

            if(a > b) {
                hof[0] = 1;
                hof[1] = 0;

                if(last[0] != hof[0] || last[1] != hof[1]) count++;

                last[0] = hof[0];
                last[1] = hof[1];
            } else if (a < b) {
                hof[0] = 0;
                hof[1] = 1;

                if(last[0] != hof[0] || last[1] != hof[1]) count++;

                last[0] = hof[0];
                last[1] = hof[1];                
            } else {
                hof[0] = 1;
                hof[1] = 1;

                if(last[0] != hof[0] || last[1] != hof[1]) count++;

                last[0] = hof[0];
                last[1] = hof[1];        
            }
        }
        // Please write your code here.

        System.out.print(count);

    }
}