import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] line = new int[101];
        for(int i = 0; i < n; i++){
            for(int j = start[i]; j <= end[i]; j++) {
                line[j]++;
            }
        }

        Arrays.sort(line);

        System.out.print(line[100]);
    }
}