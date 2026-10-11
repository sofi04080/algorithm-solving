import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);

        // 비교해야 될 상황이 양수 절댓값 3개 or 음수 절댓값 2개와 양수 절댓값 1개

        int a = arr[0] * arr[1] * arr[arr.length - 1];
        int b = arr[arr.length - 1] * arr[arr.length - 2 ] * arr[arr.length - 3];

        System.out.print( a > b ? a : b);
    }
}