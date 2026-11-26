import java.util.*;

public class Main {
    static int n, m;
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        comb(0, 1);
    }

    static void comb(int count, int start) {
        if(count == m) {
            for(int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i <= n; i++) {
            ans.add(i);
            comb(count + 1, i + 1);
            ans.remove(ans.size() - 1);
        }
    }
}