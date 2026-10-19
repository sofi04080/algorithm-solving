import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.

        char[] seats = seat.toCharArray();

        int dist = 0;
        int zeroCount = 0; 
        boolean isFirst = false;

        int idx = 0;
        int minDist = Integer.MAX_VALUE;
        isFirst = false;

        for(int i = 0; i < n; i++) {
            if(seats[i] == '1'){
                if(!isFirst) {
                    dist = Math.max(zeroCount, dist);
                    isFirst = true;
                } else {
                    minDist = Math.min(i - idx, minDist);
                    dist = Math.max(dist, (zeroCount + 1)/2);
                }
                idx = i;
                zeroCount = 0;
            } else {
                zeroCount++;
            }
        }



        dist = Math.max(dist, zeroCount);
        dist = Math.min(minDist, dist);

        System.out.print(dist);
    }
}