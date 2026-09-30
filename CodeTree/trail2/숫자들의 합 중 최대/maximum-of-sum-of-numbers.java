import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        int max = Integer.MIN_VALUE;

        for(int i = x; i <=y; i++) {
            int num = sum(i);
            max = Math.max(max, num);
        }

        System.out.print(max);
    }

    public static int sum(int x) {
        // 자릿수 변환
        int a = x % 10;
        int b = (x % 100)/10;
        int c = (x % 1000)/100;
        int d = (x % 10000)/1000;
        int e = (x % 100000)/(10000);
        
        return a + b + c + d + e;
    }
}