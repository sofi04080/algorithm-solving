import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] blocks = new int[N];

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j <=B; j++) {
                blocks[j - 1]++;
            }
        }
        // Please write your code here.

        Arrays.sort(blocks);

        int max = blocks[N-1];

        System.out.println(max);
    }
}