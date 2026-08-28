import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String ans = "";
        
        int day1 = 0, day2 = 0;

        for(int i = 1; i < m1; i++) {
            day1 += month[i];
        }
        day1 += d1;

        for(int i = 1; i < m2; i++) {
            day2 += month[i];
        }
        day2 += d2;


        int diff = (day2 - day1)%7;
        if(diff >= 0){
            ans = day[diff];
            System.out.println(ans);
        } else {
            diff = 7 + diff;
            ans = day[diff];
            System.out.println(ans);
        }
        


    }
}