import java.util.Scanner;

public class Main {
    static int[] cups;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        // 조약돌 위치
        for(int i = 1; i < 4; i++) {
            cups = new int[4];
            cups[i]++;
            // 연산
            int count = 0;
            for(int j = 0; j < n; j++) {
                swap(a[j], b[j]);
                if(cups[c[j]] == 1) {
                    count++;
                }
                max = Math.max(count, max);
            }
        }

        System.out.print(max);
    }

    // 배열 원소 위치 바꾸기
    public static void swap(int a, int b) {
        int temp = cups[a];
        cups[a] = cups[b];
        cups[b] = temp;
    }
}