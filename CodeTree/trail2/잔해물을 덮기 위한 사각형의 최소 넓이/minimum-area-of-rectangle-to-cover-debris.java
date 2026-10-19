import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.

        // 겹치는 곳 좌표 구하기
        int over_x1 = Math.max(rect1_x1, rect2_x1);
        int over_y1 = Math.max(rect1_y1, rect2_y1);
        int over_x2 = Math.min(rect1_x2, rect2_x2);
        int over_y2 = Math.min(rect1_y2, rect2_y2);

        if(over_x1 < over_x2 && over_y1 < over_y2) {
            int count = 0;
            if(isInside(rect1_x1, rect1_y1, rect2_x1, rect2_x2, rect2_y1, rect2_y2)) count ++;
            if(isInside(rect1_x1, rect1_y2, rect2_x1, rect2_x2, rect2_y1, rect2_y2)) count ++;
            if(isInside(rect1_x2, rect1_y1, rect2_x1, rect2_x2, rect2_y1, rect2_y2)) count ++;
            if(isInside(rect1_x2, rect1_y2, rect2_x1, rect2_x2, rect2_y1, rect2_y2)) count ++;

            if(count >= 4) System.out.println(0);
            else if(count == 1 || count == 0) System.out.println(Math.abs(rect1_x2 - rect1_x1) * Math.abs(rect1_y2 - rect1_y1));
            else if (count == 2) System.out.println((Math.abs(rect1_x2 - rect1_x1) * Math.abs(rect1_y2 - rect1_y1)) - Math.abs(over_x2 - over_x1) * Math.abs(over_y2 - over_y1));
        } else {
            System.out.println(Math.abs(rect1_x2 - rect1_x1) * Math.abs(rect1_y2 - rect1_y1));
        }

    }

    static boolean isInside(int t1, int t2, int x1, int x2, int y1, int y2) {
        if(x1 <= t1 && t1 <= x2 && y1 <= t2 && t2 <= y2) {
            return true;
        }
        return false;
    }
}