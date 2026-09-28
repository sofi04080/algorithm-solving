import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxCount = 0;
        for(int i = 0; i < n; i++) {

            int money = b; // 예산
            int cnt = 1;

            // 우선 할인 대상 먼저 빼기
            money = money - (p[i]/2 + s[i]);
            
            if(money < 0) continue;

            int[] others = new int[n];
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                others[j] = p[j] + s[j];
            }

            // 오름차순
            Arrays.sort(others);

            for(int j = 1; j < n; j++) {
                if(money - others[j] >= 0) {
                    money -= others[j]; 
                    cnt++;
                } else {
                    break;
                }
            }

            maxCount = Math.max(cnt, maxCount);

        }
        
        System.out.print(maxCount);
        
    }
}