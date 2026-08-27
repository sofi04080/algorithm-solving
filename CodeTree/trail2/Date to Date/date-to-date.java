import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        // 월 일 배열로 고려
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;
        
        // 만약 달이 같다면
        if(m1 == m2) {
            ans = d2 - d1 + 1;
            System.out.println(ans);
        } else{
            for(int i = m1 + 1; i < m2; i++){
                ans += month[i-1];
            }
            ans = ans + (month[m1-1] - d1 + 1) + d2;
            System.out.println(ans);
        }
        

        
    }
}