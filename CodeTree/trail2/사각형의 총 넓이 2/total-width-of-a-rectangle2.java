import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;
        int[][] rec = new int[201][201];
        for(int i = 0; i < n; i++) {
            int xF = x1[i] + 100;
            int yF = y1[i] + 100;
            int xS = x2[i] + 100;
            int yS = y2[i] + 100;

            for(int x = xF; x < xS; x++){
                for(int y = yF ; y < yS; y++){
                    rec[x][y] = 1;
                }
            }
        }
        for(int j = 0; j < rec.length; j++) {
            for(int k = 0; k < rec[j].length; k++){
                if(rec[j][k] == 1){
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}