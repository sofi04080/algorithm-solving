import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer>[] records = new ArrayList[11];
        for(int i = 0; i < 11; i++) {
            records[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();

            records[pigeon].add(moveDir);
        }
        // Please write your code here.

        int count = 0;

        for(int j = 1; j <=10; j++) {
            if(!records[j].isEmpty()) {
                for(int i = 1; i < records[j].size(); i++) {
                    if(records[j].get(i - 1) != records[j].get(i)) count++;
                }
            }
        }

        System.out.print(count);
    }
}