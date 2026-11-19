import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> blocks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            blocks.add(sc.nextInt());
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();
        // Please write your code here.

        for(int i = s1; i <= e1; i++) {
            blocks.remove(s1 - 1);
        }

        for(int i = s2; i <= e2; i++) {
            blocks.remove(s2 - 1);
        }

        System.out.println(blocks.size());
        for(int i : blocks) {
            System.out.println(i);
        }
    }
}