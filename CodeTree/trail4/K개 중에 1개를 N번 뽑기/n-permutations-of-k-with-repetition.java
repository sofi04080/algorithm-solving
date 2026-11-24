import java.util.*;

public class Main {
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        
        seq(n, new ArrayList<>());
        
    }

    static void seq(int left, List<Integer> ans) {
        // 재귀 종료
        if(left == 0) {
            for(int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        // 재귀
        for(int i = 1; i <= k; i++) {
            left--;
            ans.add(i);
            seq(left, ans);
            ans.remove(ans.size() - 1);
            left++;
        }

    }
}