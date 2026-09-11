import java.util.*;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
        }

        // Please write your code here.

        // 초마다 이동할 위치 기록할 배열
        int[] aMove = new int [2000001];
        int[] bMove = new int [2000001];
        Arrays.fill(aMove, Integer.MAX_VALUE);
        Arrays.fill(bMove, Integer.MIN_VALUE);

        int time = 0;
        int pos = 0;
        for(int i = 0; i < n; i++) {
            if(d[i] == 'R'){
                for(int j = 0; j < t[i]; j++){
                    aMove[++time] = ++pos;
                }

            } else if (d[i] == 'L') {
                for(int j = 0; j < t[i]; j++){
                    aMove[++time] = --pos;
                }
            }
        }

        time = 0;
        pos = 0;
        for(int i = 0; i < m; i++) {
            if(d2[i] == 'R'){
                for(int j = 0; j < t2[i]; j++){
                    bMove[++time] = ++pos;
                }
            } else if (d2[i] == 'L') {
                for(int j = 0; j < t2[i]; j++){
                    bMove[++time] = --pos;
                }
            }
        }

        int ans = -1;

        for(int i = 1; i < aMove.length; i++) {
            if(aMove[i] == bMove[i]){
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}