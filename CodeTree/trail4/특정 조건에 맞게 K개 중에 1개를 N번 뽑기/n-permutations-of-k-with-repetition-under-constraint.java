import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static int n, k;
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        // Please write your code here.
        seq();
        
    }

    static void seq() {
        // 재귀 종료
        if(ans.size() == n) {
            for(int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        // 재귀
        if(ans.size() > 1 && ans.get(ans.size()-1) == ans.get(ans.size()-2)) {
            for(int i = 1; i <= k; i++) {
                if(i == ans.get(ans.size() - 1)) continue;
                ans.add(i);
                seq();
                ans.remove(ans.size() - 1);
            }
        } else {
                for(int i = 1; i <= k; i++) {
                ans.add(i);
                seq();
                ans.remove(ans.size() - 1);
            }
        }
    }
}