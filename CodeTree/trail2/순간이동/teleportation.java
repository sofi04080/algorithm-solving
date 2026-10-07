import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        if(Math.abs(A-x) > Math.abs(A-y)) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.print((Math.abs(x - A) + Math.abs(y - B)) > Math.abs(A-B) ? Math.abs(A-B) : (Math.abs(x - A) + Math.abs(y - B)));
    }
}